import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> itemsList;

    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.itemsList = new ArrayList<>();
    }

    // which adds the item passed as a parameter to the suitcase. The method does not return a value.
    public void addItem(Item item){
        int currentWeight = totalWeight();
        if (currentWeight + item.getWeight() <= this.maxWeight){
            itemsList.add(item);
        }
    }

    // which prints all the items in the suitcase
    public void printItems(){
        for (Item it : itemsList){
            System.out.println(it);
        }
    } 

    // returns the total weight of the items
    public int totalWeight(){
        int totalWeight = 0;
        for (Item it : itemsList){
            totalWeight += it.getWeight();
        }
        return totalWeight;
    } 
    
    public Item heaviestItem(){
        Item heaviest = null;
        if (itemsList.size() > 0){
            heaviest = itemsList.get(0);
            for (Item it : itemsList){
                if (it.getWeight() > heaviest.getWeight()){
                    heaviest = it;
                }
            }
        }
        return heaviest;
    }

    // which returns the string "x items (y kg)"
    public String toString(){
        int numItems = itemsList.size();
        int totalWeight = totalWeight();
        if (numItems == 0){
            return "no items (0 kg)";
        } else if (numItems == 1){
            return numItems + " item (" + totalWeight + " kg)";
        } else {
            return numItems + " items (" + totalWeight + " kg)";
        }
    }
}
