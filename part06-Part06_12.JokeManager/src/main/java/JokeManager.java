import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager(){
        jokes = new ArrayList<>();
    }

    // - adds a joke to the manager.
    public void addJoke(String joke){
        jokes.add(joke);
    } 
    
    // - chooses one joke at random and returns it. It there are no jokes stored in the joke manager, the method should return the string "Jokes are in short supply.".
    public String drawJoke() {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random rando = new Random();
            int index = rando.nextInt(jokes.size());
            return jokes.get(index);
        }
    }
    
    // - prints all the jokes stored in the joke manager.
    public void printJokes() {
        for (String joke : jokes){
            System.out.println(joke);
        }
    }
}
