import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> giftsArrayList;

    public Package(){
        giftsArrayList = new ArrayList<>();
    }

    // which adds the gift passed as a parameter to the package. The method returns no value.
    public void addGift(Gift gift){
        giftsArrayList.add(gift);
    }

    // which returns the total weight of the package's gifts.     
    public int totalWeight(){
        int totalWeight = 0;
        for (Gift gift : giftsArrayList){
            totalWeight += gift.getWeight();
        }
        return totalWeight;
    }
}
