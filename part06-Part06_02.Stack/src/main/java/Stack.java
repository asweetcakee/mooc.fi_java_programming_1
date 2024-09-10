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
public class Stack {
    private ArrayList<String> list = new ArrayList<>();
    
    public Stack(){
        this.list = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return this.list.isEmpty();
    }
    
    public void add(String value){
        this.list.add(value);
    }
    
    public ArrayList<String> values(){
        return this.list;
    }
    
    public String take(){
        String topMostValue = this.list.get(this.list.size()-1);
        this.list.remove(this.list.get(this.list.size()-1)); // removes the last added value
        return topMostValue;
    }
}
