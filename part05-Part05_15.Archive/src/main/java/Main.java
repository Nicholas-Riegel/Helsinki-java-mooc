
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }

            Item newItem = new Item(identifier, name);
            if (!items.contains(newItem)){
                items.add(newItem);
            }
        }
        
        for (Item it : items){
            System.out.println(it.getIdentifier() + ": " + it.getName());
        }
    }
}
