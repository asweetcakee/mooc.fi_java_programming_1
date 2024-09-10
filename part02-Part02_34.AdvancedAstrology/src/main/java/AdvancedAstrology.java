
public class AdvancedAstrology {

    public static void printStars(int number) {
        int counter = 0;
        while (number > counter) {
            System.out.print("*");
            counter++;
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        int counter = 0;
        while (number > counter) {
            System.out.print(" ");
            counter++;
        }
    }

    public static void printTriangle(int size) {
        int initialSize = 1;
        while (size >= initialSize){
            printSpaces(size - initialSize);
            printStars(initialSize);
            initialSize++;
        }
    }

    public static void christmasTree(int height) {
        for (int i = 1; i <= height; i++){
            printSpaces(height - i);
            printStars(i * 2 - 1);
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
