
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maxAge = Integer.MIN_VALUE;
        String name = "";
        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] pieces = input.split(",");
            int age = Integer.valueOf(pieces[1].trim());
            
            if (age > maxAge) {
                maxAge = age;
                name = pieces[0];
            }
        }
        System.out.println("Name of the oldest: " + name);

    }
}
