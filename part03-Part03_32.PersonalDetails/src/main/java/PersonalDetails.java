
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longest = Integer.MIN_VALUE;
        int sum = 0;
        int counter = 0;
        String longestName = "";
        
        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] pieces = input.split(",");

            if (pieces[0].length() > longest) {
                longest = pieces[0].length();
                longestName = pieces[0];
            }
            sum += Integer.valueOf(pieces[1]);
            counter++;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + sum/Double.valueOf(counter));

    }
}
