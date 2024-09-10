
import java.util.Scanner;

public class Counting {

    static int num = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        num = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }
}
