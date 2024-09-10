
import java.util.Scanner;

public class Adulthood {
    static int age;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        age = Integer.valueOf(scan.nextLine());
        if (age < 18) {
            System.out.println("You are not an adult");
        } else {
            System.out.println("You are an adult");
        }
        // Write your program here 
    }
}
