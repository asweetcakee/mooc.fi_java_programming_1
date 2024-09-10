
import java.util.Scanner;

public class SquareRootOfSum {
    static int first;
    static int second;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        first = Integer.valueOf(scanner.nextLine());
        second = Integer.valueOf(scanner.nextLine());
        
        System.out.println(Math.sqrt(first + second));
    }
}
