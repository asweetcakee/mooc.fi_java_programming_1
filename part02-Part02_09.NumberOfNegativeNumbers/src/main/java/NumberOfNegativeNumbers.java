
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    static int counter = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            } else if (num < 0) {
                counter += 1;
            }

        }

        System.out.println("Number of negative numbers: " + counter);
    }
}
