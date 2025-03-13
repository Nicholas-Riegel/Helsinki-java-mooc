import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stringsArrayList;

    public Stack(){
        stringsArrayList = new ArrayList<>();
    }

    public void add(String value){
        stringsArrayList.add(value);
    }
    
    public String take(){
        return stringsArrayList.remove(stringsArrayList.size()-1);
    }

    public boolean isEmpty(){
        return stringsArrayList.isEmpty();
    }

    public ArrayList<String> values(){
        return stringsArrayList;
    }
}
