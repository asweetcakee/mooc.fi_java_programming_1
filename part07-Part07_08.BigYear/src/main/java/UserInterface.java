
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
    private Scanner scanner;
    private BirdDatabase dataBase;
    private final String QUIT_COMMAND = "Quit";
    private final String ADD_COMMAND = "Add";
    private final String OBSERVATION_COMMAND = "Observation";
    private final String PRINT_EVERYTHING_COMMAND = "All";
    private final String PRINT_ONLY_OBSERVED_COMMAND = "One";

    public UserInterface(Scanner scanner, BirdDatabase dataBase) {
        this.scanner = scanner;
        this.dataBase = dataBase;
    }
    
    public void start(){
        inputHandle();
    }
    
    private void inputHandle(){
        while (true){
            System.out.println("? ");
            String input = scanner.nextLine().trim();
            if (input.equals(QUIT_COMMAND)){
                break;
            }
            
            switch (input){
                case ADD_COMMAND:
                    createBird();
                    break;
                case OBSERVATION_COMMAND:
                    observeBird();
                    break;
                case PRINT_EVERYTHING_COMMAND:
                    printAll();
                    break;
                case PRINT_ONLY_OBSERVED_COMMAND:
                    printOnlyObservedBird();
                    break;    
                default:
                    System.out.println("Given command does not exist.");
                    break;
            }
            
        }
        
        scanner.close();
    }
    
    private void createBird(){
        System.out.println("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("Name in Latin: ");
        String latinName = scanner.nextLine().trim();
        
        if (name.isEmpty() || latinName.isEmpty()){
            System.out.println("Bird name or name in Latin can not be empty.");
            return;
        }
        
        if (!this.dataBase.doesBirdExistInDB(name)){
            this.dataBase.add(new Bird(name, latinName));
        }        
    }
    
    private void observeBird(){
        System.out.println("Bird? ");
        String name = scanner.nextLine().trim().toLowerCase();
        
        Bird bird = this.dataBase.retrieveBirdByNameFromDB(name);
        if (bird == null){
            System.out.println("Not a bird!");
            return;
        }
        bird.increaseObservationCount();
    }
    
    private void printAll(){
        for (Bird bird : this.dataBase.getBirds()){
            System.out.println(bird.toString());
        }
    }
    
    private void printOnlyObservedBird(){
        System.out.println("Bird? ");
        String name = scanner.nextLine().trim().toLowerCase();
        
        Bird bird = this.dataBase.retrieveBirdByNameFromDB(name);
        if (bird == null){
            System.out.println("Given bird does not exist in Data Base.");
            return;
        }        
        System.out.println(bird.toString());
        
    }
}
