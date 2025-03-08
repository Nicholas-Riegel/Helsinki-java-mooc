public class Cube {

    public int edgeLength;
    private int volume;

    public Cube(int edgeLength){
        this.edgeLength =  edgeLength;
        this.volume = (int) Math.pow(edgeLength, 3);
    }

    public int volume(){
        return this.volume;
    }

    public String toString(){
        return "The length of the edge is " + this.edgeLength + " and the volume " + this.volume;
    }
}
