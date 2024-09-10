
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        scanner.close();
        
        try (Scanner scan = new Scanner(Paths.get(file))){
            
            while (scan.hasNextLine()){
                String person = scan.nextLine();
                String[] parts = person.split(",");
                System.out.println(parts[0] + ", age: " + parts[1] + " years");
            }
            scan.close();
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
