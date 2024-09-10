
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mefferio
 */
public class RecipesManager {

    private ArrayList<Recipe> recipesList;
    
    public RecipesManager() {
        this.recipesList = new ArrayList<>();
    }
    
    public Recipe assignRecipe(ArrayList<String> list){
        if (list == null){
            return null;
        }
        
        if (list.size() <= 2){
            System.out.println("No ingredients have been listed. \n Exiting...");
            return null;
        }       
        
        String name = list.get(0);
        int cookingTime = Integer.valueOf(list.get(1));
        Recipe recipe = new Recipe();
        
        recipe.setName(name);
        recipe.setCookingTime(cookingTime);
        
        for (int i = 2; i < list.size(); i++){
            recipe.addIngredient(list.get(i));
        }
        
        return recipe;
    }
    
    public void addRecipe(Recipe recipe){
        if (recipe == null){
            System.out.println("Recipe is empty...");
            return;
        }
        
        this.recipesList.add(recipe);
    }

    public ArrayList<Recipe> getRecipesList() {
        return recipesList;
    }
        
    @Override
    public String toString() {
        return this.recipesList.toString(); 
    }
}   
