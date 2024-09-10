
import java.util.Scanner;

public class Factorial {

    static int num = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        num = scanner.nextInt();

        if (num == 0) {
            System.out.println(1);
        } else {
            int q = 1;
            for (int i = 1; i <= num; i++) {
                q *= i;
            }
            System.out.println("Factorial: " + q);
        }
    }
}
