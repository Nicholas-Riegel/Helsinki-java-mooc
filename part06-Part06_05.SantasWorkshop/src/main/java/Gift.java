public class Gift {

    private String name;
    private int weight;

    public Gift(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    // which returns the name of the gift
    public String getName(){
        return this.name;
    }

    // which returns the weight of the gift
    public int getWeight(){
        return this.weight;
    }
    
    // which returns a string in the form "name (weight kg)"
    public String toString(){
        return this.name + " (" + this.weight + " kg)";
    }
}
