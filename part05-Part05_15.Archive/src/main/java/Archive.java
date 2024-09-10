/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mefferio
 */
public class Archive {
    private String identifier;
    private String name;
    
    Archive(){
        this("AAAAAAAAAA", "He-Man");
    }
    
    Archive(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared){
            return true;
        }
        
        if (!(compared instanceof Archive)){
            return false;
        }
        
        Archive comparedArchive = (Archive) compared;
        return this.identifier.equals(comparedArchive.identifier);
    }
    
    
    
    @Override
    public String toString() {
        return this.identifier + ": " + this.name; //To change body of generated methods, choose Tools | Templates.
    }    
}
