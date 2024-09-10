/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author mefferio
 */
public class Suitcase {

        private ArrayList<Item> items;
        private final int maximumWeight;

        public Suitcase(int totalWeight) {
            this.items = new ArrayList<>();
            this.maximumWeight = totalWeight;
        }

        public void addItem(Item item) {
            if (this.maximumWeight >= this.totalWeight() + item.getWeight()){
                this.items.add(item);
            }
        }

        public int totalWeight() {
            if (this.items.isEmpty()) {
                return 0;
            }

            int total = 0;

            for (Item el : this.items) {
                total += el.getWeight();
            }

            return total;
        }
        
        public void printItems(){
            for (Item item : this.items){
                System.out.println(item);
            }
        }
        
        public Item heaviestItem(){
            if (this.items.isEmpty()){
                return null;
            }
            
            Item heaviestItem = this.items.get(0);
            
            for (Item item : this.items){
                if (heaviestItem.getWeight() < item.getWeight()){
                    heaviestItem = item;
                }
            }
            
            return heaviestItem;
        }
        
        public String toString() {
            String outputEnding = " items (" + this.totalWeight() + " kg)";
            
            if (this.items.isEmpty()){
                return "no" + outputEnding;
            }
            
            if (this.items.size() == 1){
                return this.items.size() + " item (" + this.totalWeight() + " kg)";
            }
            
            return this.items.size() + outputEnding;
        }
    
    }
