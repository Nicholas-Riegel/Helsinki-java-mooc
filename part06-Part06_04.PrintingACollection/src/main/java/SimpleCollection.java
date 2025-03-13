
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

    public String toString(){
        
        String start = "The collection " + this.name;

        if (elements.isEmpty()){
        
            return start + " is empty.";
        
        } else if (elements.size() == 1){
        
            return start + " has 1 element:\n" + elements.get(0);
        
        } else {
        
            String wholeMessage = start + " has " + elements.size() + " elements:";
        
            for (String el : elements){
                wholeMessage += "\n" + el;
            }
        
            return wholeMessage;
        }
    }
}
