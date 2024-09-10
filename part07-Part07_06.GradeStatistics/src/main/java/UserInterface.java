
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mefferio
 */
public class UserInterface {
    private final int EXIT_COMMAND = -1;
    
    private final Scanner scanner;
    private PointsManager points;

    public UserInterface(Scanner scanner, PointsManager points) {
        this.scanner = scanner;
        this.points = points;
    }
        
    public void start(){
        System.out.println("Enter point totals, " + EXIT_COMMAND + " stops: ");
        handleInput();
        printResults();
        this.scanner.close();
    }
    
    public void handleInput(){
        while(true){    
            int input = Integer.valueOf(this.scanner.nextLine());
            
            if (input == EXIT_COMMAND){
                break;
            }
            
            Point point = new Point(input);
            
            this.points.addPoint(point);            
        }
    }
    
    public void printResults(){
        System.out.println("Points list: " + this.points.toString());
        System.out.println("Point average (all): " + this.points.averagePoints());
        
        double averagePassing = this.points.averagePointsPassed();
        System.out.println("Point average (passing): " + (averagePassing != -1 ? averagePassing : "-"));
        
        System.out.println("Pass percentage: " + this.points.percentagePassed());
        printGradesQuantity();
    }
    
    public void printGradesQuantity(){
        int grade = 5;
        while (grade >= 0){
            int stars = this.points.gradesQuantity(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");
            grade--;
        }
    }
    
    public void printStars(int stars){
        while(stars > 0){
            System.out.print("*");
            stars--;
        }
    }
}
