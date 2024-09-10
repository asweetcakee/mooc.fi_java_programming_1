/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mefferio
 */
public class Container {
    private int value;

    public Container() {
        this.value = 0;
    }

    public int contains(){
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public void add(int amount){
        if (amount > 0){
            if ((amount + this.value) < 100){
                this.value += amount;
            } else {
                this.value = 100;
            }
        }
    }
    
    public void remove(int amount){
        if (amount > 0){
            if (amount >= this.value){
                this.value = 0;
            } else {
                this.value -= amount;
            }
        }
    }
    
    public Container move(int amount, Container container){
        if (amount > 0){
            if (amount >= this.value){
                container.value += this.value;
                this.value = 0;
            } else {
                container.value += amount;
                this.value -= amount;
            }
            
            if (container.value > 100){
                container.value = 100;
            }
        }
        
        return container;
    }
    
    @Override
    public String toString() {
        return this.value + "/100"; 
    }
}
