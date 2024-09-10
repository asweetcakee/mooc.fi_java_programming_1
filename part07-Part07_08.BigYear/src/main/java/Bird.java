/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mefferio
 */
public class Bird {
    private String name;
    private String nameLatin;
    private int observationCount;

    public Bird(String name, String nameLatin) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.observationCount = 0;
    }

    public String getName() {
        return name;
    }

    public String getNameLatin() {
        return nameLatin;
    }

    public int getObservationCount() {
        return observationCount;
    }
    
    public void increaseObservationCount(){
        this.observationCount++;
    }

    @Override
    public String toString() {
        return String.format("%s (%s): %d observations", this.getName(), this.getNameLatin(), this.getObservationCount()); 
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        final Bird other = (Bird) obj;
        return this.name.equals(other.name) && this.nameLatin.equals(other.nameLatin) && this.observationCount == other.observationCount;
    }
}
