
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mefferio
 */
public class UserInterface {
    private Container firstContainer;
    private Container secondContainer;
    private Scanner scanner;
    private final String EXIT_COMMAND = "quit";
    private final String ADD_COMMAND = "add";
    private final String MOVE_COMMAND = "move";
    private final String REMOVE_COMMAND = "remove";

    public UserInterface(Scanner scanner, Container firstContainer, Container secondContainer) {
        this.scanner = scanner;
        this.firstContainer = firstContainer;
        this.secondContainer = secondContainer;
    }
    
    public void start(){
        while(true){
            print();
            
            String input = scanner.nextLine().toLowerCase().trim();
            String[] parts = input.split(" ");
            
            String command = parts[0];
            
            int amount = 0;
            if (input.length() > 1){
                amount = Integer.valueOf(parts[1]);
            }
            
            if (command.equals(EXIT_COMMAND)){
                break;
            }
            
            switch(command){
                case ADD_COMMAND:
                    this.firstContainer.add(amount);
                    break;
                case MOVE_COMMAND:
                    this.secondContainer = this.firstContainer.move(amount, secondContainer);
                    break;
                case REMOVE_COMMAND:
                    this.secondContainer.remove(amount);
                    break;
                default:
                    System.out.println("Unknown command.");
                    break;
            }
        }
        
        scanner.close();
    }
    
    public void print(){
        System.out.println("First: " + firstContainer);
        System.out.println("Second: " + secondContainer);
    }
}
