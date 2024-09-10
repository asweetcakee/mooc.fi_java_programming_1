
import java.util.ArrayList;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mefferio
 */
public class BirdDatabase {
    private ArrayList<Bird> birds;
    private final String ERROR_BIRD_NULL_MESSAGE = "Given bird can not be null.";

    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }

    public ArrayList<Bird> getBirds() {
        return birds;
    }
    
    public void add(Bird bird){
        if (bird == null){
            System.out.println(ERROR_BIRD_NULL_MESSAGE);
            return;
        }
        this.birds.add(bird);
    }
        
    public boolean doesBirdExistInDB(String name){
        for (Bird bird : this.birds){
            if (bird.getName().toLowerCase().equals(name)){
                return true;
            }
        }
        return false;
    }
    
    public Bird retrieveBirdByNameFromDB(String name){
        for (Bird bird : this.birds){
            if (bird.getName().toLowerCase().equals(name)){
                return bird;
            }
        }
        return null;
    }
    
    public void birdIsObserved(Bird bird){
        if (doesBirdExistInDB(bird.getName())){
            bird.increaseObservationCount();
        }
    }    
    
}
