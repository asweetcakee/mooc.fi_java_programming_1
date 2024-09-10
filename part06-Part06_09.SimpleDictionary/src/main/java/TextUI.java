/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author mefferio
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dict;
    private static final String COMMAND_ADD = "add";
    private static final String COMMAND_SEARCH = "search";
    private static final String COMMAND_END = "end";

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String input = scanner.nextLine().trim();

            if (input.equals(COMMAND_END)) {
                break;
            }

            switch (input) {
                case COMMAND_ADD:
                    addWordAndTranslation();
                    break;
                case COMMAND_SEARCH:
                    searchForTranslation();
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }

        System.out.println("Bye bye!");
    }

    public void addWordAndTranslation() {
        System.out.println("Word: ");
        String word = scanner.nextLine().trim();

        System.out.println("Translation: ");
        String translation = scanner.nextLine().trim();

        dict.add(word, translation);
    }

    public void searchForTranslation() {
        System.out.println("To be translated: ");
        String word = scanner.nextLine().trim();
        
        String translation = dict.translate(word);
        
        if (translation != null){
            System.out.println(translation);
        } else {
            System.out.println("Word " + word + " was not found");
        }
        
    }
}
