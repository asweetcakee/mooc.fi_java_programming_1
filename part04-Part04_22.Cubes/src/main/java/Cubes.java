
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter months: ");
        int months = scanner.nextInt();
        System.out.println("Enter deposit amount: ");
        int depositAmount = scanner.nextInt();
        
        double balance = 0;       
        
        for (int i = 1; i <= months; i++){
            balance += depositAmount;
            balance *= 1.011;
        }
        
        System.out.println("Your balance: " + balance + " after " + months + " months passed");
        
    }
}
