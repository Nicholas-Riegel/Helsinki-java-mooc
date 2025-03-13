
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

    public String longest(){
        String longest;
        if (this.elements.size() < 1){
            return null;
        } else {
            longest = elements.get(0);
            for (String el : elements){
                if (el.length() > longest.length()){
                    longest = el;
                }
            }
            return longest;
        }
    }

}
