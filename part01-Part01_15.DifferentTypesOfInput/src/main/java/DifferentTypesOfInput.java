
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String text = scan.nextLine();
        System.out.println("Give an integer:");
        int number = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double floating_number = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean flag = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string "+ text +"\n" +
        "You gave the integer " + number + "\n" +
        "You gave the double " + floating_number + "\n" +
        "You gave the boolean " + flag);

    }
}
