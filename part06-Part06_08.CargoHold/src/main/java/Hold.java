
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
public class Hold {
    private final int maximumWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if (this.maximumWeight >= this.totalWeight() + suitcase.totalWeight()){
            this.suitcases.add(suitcase);
        }        
    }
    
    public int totalWeight() {
        if (this.suitcases.isEmpty()) {
            return 0;
        }

        int totalWeight = 0;

        for (Suitcase suitcase : this.suitcases) {
            totalWeight += suitcase.totalWeight();
        }

        return totalWeight;
    }
    
    public void printItems(){
        for (Suitcase suitcase : this.suitcases){
            suitcase.printItems();
        }
    }
    
    public String toString(){
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
