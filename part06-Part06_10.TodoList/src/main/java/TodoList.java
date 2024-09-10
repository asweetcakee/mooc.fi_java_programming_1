
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
public class TodoList {
    private ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }
    
    public void add(String task){
        this.tasks.add(task);
    }
    
    public void print(){
        int taskIndex = 0;
        for (String task : this.tasks){
            taskIndex++;
            System.out.println(taskIndex + ": " + task);
        }
    }
    
    public void remove(int number){
        if (number > 0){
            this.tasks.remove(number-1);
        } else{
            System.out.println("An incorrect task number was specified.");
        }        
    }
    
}
