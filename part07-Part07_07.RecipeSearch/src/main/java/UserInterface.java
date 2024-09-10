
import java.nio.file.Paths;
import java.util.ArrayList;
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
    private RecipesManager manager;
    private final String LIST_COMMAND = "list";
    private final String STOP_COMMAND = "stop";
    private final String SEARCH_BY_NAME_COMMAND = "find name";
    private final String SEARCH_BY_COOKING_TIME_COMMAND = "find cooking time";
    private final String SEARCH_BY_INGREDIENT_COMMAND = "find ingredient";

    public UserInterface(Scanner scanner, RecipesManager manager) {
        this.scanner = scanner;
        this.manager = manager;
    }

    public void start() {
        processFileContent();
        inputHandle();
    }
    
    private void processFileContent() {
        System.out.println("File to read: ");
        
        try (Scanner fileScanner = getFileScanner()) {
            if (fileScanner == null) {
                System.out.println("Failed to read the file...");
                return;
            }

            ArrayList<String> content = new ArrayList<>();
            while (fileScanner.hasNextLine()) {
                String data = fileScanner.nextLine().trim();
                if (!data.isEmpty()) {
                    content.add(data);
                }
                if (data.isEmpty()) {
                    processRecipe(content);
                }
            }
            if (!content.isEmpty()) {
                processRecipe(content);
            }
        }
    }

    private void inputHandle(){
        printCommands();
                      
        while (true){
            System.out.println("\nEnter command: ");
            String input = this.scanner.nextLine().trim().toLowerCase();
            
            if (input.equals(STOP_COMMAND)){
                break;
            }
            
            switch(input){
                case LIST_COMMAND:
                    printRecipiesNameAndCookingTime(this.manager.getRecipesList());
                    break;
                case SEARCH_BY_NAME_COMMAND:
                    printRecipiesNameAndCookingTime(searchRecipeByName());
                    break;
                case SEARCH_BY_COOKING_TIME_COMMAND:
                    printRecipiesNameAndCookingTime(searchRecipeByCookingTime());
                    break;
                case SEARCH_BY_INGREDIENT_COMMAND:
                    printRecipiesNameAndCookingTime(searchRecipeByIngredient());
                    break;
                default:
                    System.out.println("Given command does not exist.");
                    break;
            }
        }
        
        this.scanner.close();
    }
    
    private Scanner getFileScanner() {
        String filePath = this.scanner.nextLine();
        try {
            return new Scanner(Paths.get(filePath));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    private void processRecipe(ArrayList<String> content) {
        Recipe recipe = this.manager.assignRecipe(content);
        this.manager.addRecipe(recipe);
        clearContent(content);
    }

    private void clearContent(ArrayList<String> content) {
        content.clear();
    }
    
    private void printCommands(){
        System.out.println("\nCommands: ");
        System.out.println(LIST_COMMAND + " - lists the recipes");
        System.out.println(STOP_COMMAND + " - stops the program");
        System.out.println(SEARCH_BY_NAME_COMMAND + " - searches recipes by name");
        System.out.println(SEARCH_BY_COOKING_TIME_COMMAND + " - searches recipes by cooking time");
        System.out.println(SEARCH_BY_INGREDIENT_COMMAND + " - searches recipes by ingredient");
    }
    
    private void printRecipiesNameAndCookingTime(ArrayList<Recipe> list){
        System.out.println("\nRecipes: ");
        for (Recipe recipe : list){
            System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookingTime());
        }
    }
    
    private ArrayList<Recipe> searchRecipeByName(){
        System.out.println("Searched word: ");
        String keyWord = this.scanner.nextLine().trim().toLowerCase();
        
        ArrayList<Recipe> result = new ArrayList<>();
        for (Recipe recipe : this.manager.getRecipesList()){
            if (recipe.getName().toLowerCase().contains(keyWord)){
                result.add(recipe);
            }
        }
        return result;        
    }
    
    private ArrayList<Recipe> searchRecipeByCookingTime(){
        System.out.println("Max cooking time: ");
        int maxTime = Integer.valueOf(this.scanner.nextLine().trim());
          
        ArrayList<Recipe> result = new ArrayList<>();
        for (Recipe recipe : this.manager.getRecipesList()){
            if (recipe.getCookingTime() <= maxTime){
                result.add(recipe);
            }
        }
        return result;        
    }
    
    private ArrayList<Recipe> searchRecipeByIngredient(){
        System.out.println("Ingredient: ");
        String ingredient = this.scanner.nextLine().trim().toLowerCase();
          
        ArrayList<Recipe> result = new ArrayList<>();
        for (Recipe recipe : this.manager.getRecipesList()){
            for (int i = 0; i < recipe.getIngredients().size(); i++){
                if (recipe.getIngredients().get(i).toLowerCase().equals(ingredient)){
                    result.add(recipe);
                    break;
                }
            }
        }
        return result;        
    }
    
    
}
