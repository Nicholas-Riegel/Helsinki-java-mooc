import java.lang.reflect.Constructor;

public class Item {

    private String name;
    private int weight;

    // Constructor that takes the name and the weight of the item as parameters
    public Item(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    
    // which returns the item's name
    public String getName(){
        return this.name;
    }

    // which returns the item's weight
    public int getWeight(){
        return this.weight;
    }

    // which returns the string "name (weight kg)"
    public String toString(){
        return this.name + " (" + this.weight + " kg)";
    }


}
