
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();
        
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try (Scanner scan = new Scanner(Paths.get(file))){
            int counter = 0;
            while (scan.hasNextLine()){
                int item = Integer.valueOf(scan.nextLine());
                if ( item >= lowerBound && item <= upperBound){
                    counter++;
                }
            }
            System.out.println("Numbers: " + counter);
            scan.close();
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }

}
