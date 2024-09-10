
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Statistics statisticsAll = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();
        
        System.out.println("Enter numbers:");
        int number;
        while (true) {
            number = scan.nextInt();
            if (number == -1) {
                break;
            }
            
            if (number % 2 == 0){
                statisticsEven.addNumber(number);
            } else {
                statisticsOdd.addNumber(number);
            }
            
            statisticsAll.addNumber(number);
            
            
        }
        
        System.out.println("Sum: " + statisticsAll.sum());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());
    }
}
