
import java.util.Scanner;

public class GiftTax {

    static double gift;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        gift = Double.valueOf(scan.nextLine());
        if (gift < 5000) {
            System.out.println("No tax!");
        } else if (gift > 4999 && gift < 25000) {
            System.out.println(Double.valueOf(100 + (gift - 5000)* 0.08));
        } else if (gift > 24999 && gift < 55000) {
            System.out.println(Double.valueOf(1700 + (gift - 25000)* 0.1));
        } else if (gift > 54999 && gift < 200000) {
            System.out.println(Double.valueOf(4700 + (gift - 55000)* 0.12));
        } else if (gift > 199999 && gift < 1000000) {
            System.out.println(Double.valueOf(22100 + (gift - 200000)* 0.15));
        } else if (gift > 100000){
            System.out.println(Double.valueOf(142100 + (gift - 1000000)* 0.17));
        }
    }
}
