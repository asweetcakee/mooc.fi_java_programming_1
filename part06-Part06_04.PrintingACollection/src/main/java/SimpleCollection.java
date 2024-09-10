
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString(){
        
        if (this.elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        } 
        
        String output = "The collection " + this.name + " has " + this.elements.size();
                        
        String elementsCollection = "";
        
        int counter = 0;
        for (String element : this.elements){
            counter++;
            if (counter == this.elements.size()){
                elementsCollection += element;
            } else {
                elementsCollection += element + "\n";
            }
        }
        
        if (this.elements.size() == 1){
            return output + " element:\n" + elementsCollection;
        }        
        
        return  output + " elements:\n" + elementsCollection;
    }
    
}
