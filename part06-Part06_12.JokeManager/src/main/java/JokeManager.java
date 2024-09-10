
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mefferio
 */
public class JokeManager {
    private ArrayList<String> jokesList;

    public JokeManager() {
        this.jokesList = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        this.jokesList.add(joke);
    }
    
    public String drawJoke(){
        if (this.jokesList.isEmpty()){
            return "Jokes are in short supply.";
        }
        
        Random draw = new Random();
        int index = draw.nextInt(this.jokesList.size());
        
        return this.jokesList.get(index);
    }
    
    public void printJokes(){
        for (String joke : this.jokesList) {
            System.out.println(joke);
        }
    }
}
