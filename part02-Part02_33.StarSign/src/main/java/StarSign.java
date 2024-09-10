
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(5);
        System.out.println("");
        printStars(3);
        System.out.println("");
        printStars(9);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        while (number != 0) {
            System.out.print("*");
            number--;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int sqrSize = size * size;
        while (sqrSize != 0) {
            System.out.print("*");
            sqrSize--;
            if (sqrSize % size == 0) {
                System.out.println("");
            }
        }
    }

    public static void printRectangle(int width, int height) {
        int sqrSize = width * height;
        while (sqrSize != 0) {
            System.out.print("*");
            sqrSize--;
            if (sqrSize % width == 0) {
                System.out.println("");
            }
        }
    }

    public static void printTriangle(int size) {
        int counter = 1;
        for (int i = 1; i <= size * (size + 1) / 2; i++) {
            System.out.print("*");
            if (i == counter * (counter + 1) / 2) {
                System.out.println("");
                counter++;
            }
        }
    }
}
