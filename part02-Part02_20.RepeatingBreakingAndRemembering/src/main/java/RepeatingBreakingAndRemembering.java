
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int counter = 0;
        int evenNum = 0;
        int oddNum = 0;
        int sum = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            } else if (num % 2 == 1) {
                oddNum += 1;
            } else if (num % 2 == 0) {
                evenNum += 1;
            }
            sum += num;
            counter += 1;

        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + Double.valueOf(sum) / Double.valueOf(counter));
        System.out.println("Even: " + evenNum);
        System.out.println("Odd: " + oddNum);
    }
}
