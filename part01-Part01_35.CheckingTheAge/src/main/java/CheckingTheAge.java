
import java.util.Scanner;

public class CheckingTheAge {
    static short age;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How old are you? ");
        age = Short.valueOf(scan.nextLine());
        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
