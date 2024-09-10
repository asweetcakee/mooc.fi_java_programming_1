
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BirdDatabase db = new BirdDatabase();
        UserInterface ui = new UserInterface(scan, db);
        
        ui.start();
        
    }

}
