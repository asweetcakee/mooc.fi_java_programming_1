
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a word: ");
        String input = scanner.nextLine();
        for (int i = 0; i < 3; i++){
            System.out.print(input);
        }
        // Write your program here

    }
}