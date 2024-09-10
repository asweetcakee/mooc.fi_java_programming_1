
import java.util.Scanner;

public class NumberAndSumOfNumbers {
    static int counter = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
                        
            if (num == 0) {
                break;
            }
            
            sum += num;
            counter += 1;
        }
        
        System.out.println("Number of numbers: " + counter);
        System.out.println("Sum of the numbers: " + sum);
    }
}
