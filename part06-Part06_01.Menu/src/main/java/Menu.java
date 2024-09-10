
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal){
        if (!this.meals.contains(meal)){
            this.meals.add(meal);
        }
    }
    
    public void printMeals(){
        for (String meal : this.meals){
            System.out.println(meal);
        }
    }
    
    public void clearMenu(){
        int menuSize = this.meals.size();
        for (int i = menuSize; i > 0; i--){
            this.meals.remove(this.meals.get(i-1));
        }
    }
    
}
