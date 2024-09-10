
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maxAge = Integer.MIN_VALUE;
        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] pieces = input.split(",");
            int age = Integer.valueOf(pieces[1].trim());

            if (age > maxAge) {
                maxAge = age;
            }
        }
        System.out.println("Age of the oldest: " + maxAge);
        
    }
}
