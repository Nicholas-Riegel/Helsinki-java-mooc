import java.util.ArrayList;

public class Room {

    private ArrayList<Person> personsArrayList;

    public Room(){
        personsArrayList = new ArrayList<>();
    }

    //  - add the person passed as a paramter to the list.
    public void add(Person person){
        personsArrayList.add(person);
    }

    //  - returns a boolean-type value true or false, that tells whether the room is empty or not.
    public boolean isEmpty(){
        return personsArrayList.isEmpty();
    }

    public Person shortest(){
        if (personsArrayList.isEmpty()){
            return null;
        } else {
            Person shortest = personsArrayList.get(0);
            for (Person person : personsArrayList){
                if (person.getHeight() < shortest.getHeight()){
                    shortest = person;
                }
            }
            return shortest;
        }
    }

    public Person take(){
        Person shortest = this.shortest();
        for (int i = 0; i < personsArrayList.size(); i++){
            if (personsArrayList.get(i) == shortest){
                personsArrayList.remove(i);
                break;
            }
        }
        return shortest;
    }

    //  - returns a list of the persons in the room.
    public ArrayList<Person> getPersons(){
        return personsArrayList;
    }
}
