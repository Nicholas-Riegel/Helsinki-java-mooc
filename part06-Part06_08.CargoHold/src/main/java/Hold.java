import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcaseList;

    // a constructor, to which the maximum weight is given
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcaseList = new ArrayList<>();
    }

    // that adds the specified luggage to the hold
    public void addSuitcase(Suitcase suitcase){
        int currentWeight = totalWeight();
        if (currentWeight + suitcase.totalWeight() <= this.maxWeight){
            suitcaseList.add(suitcase);
        }
    }

    public int totalWeight(){
        int totalWeight = 0;
        for (Suitcase sc : suitcaseList){
            totalWeight += sc.totalWeight();
        }
        return totalWeight;
    } 
    
    public void printItems(){
        for (Suitcase sc : suitcaseList){
            sc.printItems();
        }
    }

    // that returns the string "x suitcases (y kg)"
    public String toString(){
        int numSuitcases = suitcaseList.size();
        int totalWeight = totalWeight();
        if (numSuitcases == 0){
            return "no suitcases (0 kg)";
        } else if (numSuitcases == 1){
            return numSuitcases + " suitcase (" + totalWeight + " kg)";
        } else {
            return numSuitcases + " suitcases (" + totalWeight + " kg)";
        }
    }


}
