
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            String[] parts = input.split(" ");

            String command = parts[0];

            int amount = 0;
            if (parts.length > 1) {
                amount = Integer.valueOf(parts[1]);
            }

            if (input.equals("quit")) {
                break;
            }

            if (command.equals("add")) {
                if (amount > 0) {
                    if ((amount + first) < 100) {
                        first += amount;
                    } else {
                        first = 100;
                    }
                }
            }

            if (command.equals("move")) {

                if (amount > 0) {
                    if (amount >= first) {
                        second += first;
                        first = 0;
                    } else {
                        second += amount;
                        first -= amount;
                    }

                    if (second > 100) {
                        second = 100;
                    }
                }
            }

            if (command.equals("remove")) {
                if (amount > 0) {
                    if (amount >= second) {
                        second = 0;
                    } else {
                        second -= amount;
                    }
                }
            }

        }
    }
}
