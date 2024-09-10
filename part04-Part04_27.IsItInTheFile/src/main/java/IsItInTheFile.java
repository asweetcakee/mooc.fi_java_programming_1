
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        ArrayList<String> list = new ArrayList<>();
        
        try (Scanner scan = new Scanner(Paths.get(file))){
            System.out.println("Search for:");
            String searchedFor = scanner.nextLine();
            
            while (scan.hasNextLine()){
                list.add(scan.nextLine());
            }           
            scan.close();
            
            int listSize = list.size();
            boolean flag = false;
            
            while (listSize > 0){
                if (list.contains(searchedFor)){
                    flag = true;
                    System.out.println("Found!");
                    break;
                }
                listSize--;
            }
            
            if (!flag){
                System.out.println("Not found.");
            }
            scanner.close();
            
            
        } catch (Exception e){
            System.out.println("Reading the file " + e.getMessage() + " failed.");
        }      

    }
}
