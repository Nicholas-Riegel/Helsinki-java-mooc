public class Bird {

    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        observations = 0;
    }

    public String getName(){
        return name;
    }
    
    public String getLatinName(){
        return latinName;
    }

    public void addObservation(){
        observations++;
    }
    
    public int getObervations(){
        return observations;
    }
}
