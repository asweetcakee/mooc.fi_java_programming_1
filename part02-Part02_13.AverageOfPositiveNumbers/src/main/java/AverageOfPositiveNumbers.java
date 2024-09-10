
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    static int counter = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            } else if (num > 0) {
                sum += num;
                counter += 1;
            }
        }

        if (sum > 0) {
            System.out.println(Double.valueOf(sum) / Double.valueOf(counter));
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
