
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
public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }
    
    public Recipe() {
        this("None", 0, new ArrayList<>());
    }

    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCookingTime(int cookingTime) {
        if (this.cookingTime < 0){
            System.out.println("Cooking time can not be negative.");
            return;
        }
        this.cookingTime = cookingTime;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }
    
    public void addIngredient(String ingredient){
        if (ingredient == null){
            System.out.println("Given ingredient can not be empty.");
            return;
        }
        
        this.ingredients.add(ingredient);
    }
    
    @Override
    public String toString() {
        return "\nName: " + getName() + "\nCooking time: " + getCookingTime() + "\nIngredients: " + getIngredients() + "\n";  
    }

}
