
import java.util.Scanner;


public class LiquidContainers2 {
    private static final String EXIT_COMMAND = "quit";
    private static final String ADD_COMMAND = "add";
    private static final String MOVE_COMMAND = "move";
    private static final String REMOVE_COMMAND = "remove";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();
        
        while(true){
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            
            String input = scanner.nextLine().toLowerCase().trim();
            String[] parts = input.split(" ");
            
            String command = parts[0];
            
            int amount = 0;
            if (parts.length > 1){
                amount = Integer.valueOf(parts[1]);
            }
            
            if (command.equals(EXIT_COMMAND)){
                break;
            }
            
            switch(command){
                case ADD_COMMAND:
                    firstContainer.add(amount);
                    break;
                case MOVE_COMMAND:
                    secondContainer = firstContainer.move(amount, secondContainer);
                    break;
                case REMOVE_COMMAND:
                    secondContainer.remove(amount);
                    break;
                default:
                    System.out.println("Unknown command.");
                    break;
            }
        }
        
        scanner.close();
    
    }


}
