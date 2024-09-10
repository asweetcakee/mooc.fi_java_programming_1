/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mefferio
 */
public class Gift {
    private String name;
    private int weight; // in KG
    
    public Gift(String giftName, int weight){
        this.name = giftName;
        this.weight = weight;
    }
    
    public String getName(){
        return this.name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg)";
    }
    
    
    
}
