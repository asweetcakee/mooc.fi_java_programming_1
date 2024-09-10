
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
    private JokeManager jokes;
    private Scanner scanner;
    private final String STOP_COMMAND = "X";
    private final int ADD_COMMAND = 1;
    private final int DRAW_COMMAND = 2;
    private final int LIST_COMMAND = 3;

    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true){
            printExistingCommands();
            String input = scanner.nextLine().trim().toUpperCase();
            
            if (input.equals(STOP_COMMAND)){
                break;
            }
            
            switch (Integer.valueOf(input)){
                case ADD_COMMAND:
                    addJoke();
                    break;
                case DRAW_COMMAND:
                    drawJoke();
                    break;
                case LIST_COMMAND:
                    printJokes();
                    break;
                default:
                    System.out.println("Unknown command.");
            }
        }
        scanner.close();
    }
    
    private void addJoke(){
        System.out.println("Write the joke to be added:");
        String input = scanner.nextLine().trim();
        
        this.jokes.addJoke(input);
    }
    
    private void drawJoke(){
        System.out.println("Drawing a joke.");
        System.out.println(this.jokes.drawJoke());
    }
    
    private void printJokes(){
        System.out.println("Printing the jokes.");
        this.jokes.printJokes();
    }
    
    private void printExistingCommands(){
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
    }
}
