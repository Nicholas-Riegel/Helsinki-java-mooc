import java.util.ArrayList;

public class TodoList {

    ArrayList<String> todoArrayList;

    public TodoList(){
        todoArrayList = new ArrayList<>();
    }

    //  - add the task passed as a parameter to the todo list.
    public void add(String task){
        todoArrayList.add(task);
    }
    
    //  - removes the task associated with the given number; the number is the one seen associated with the task in the print.
    public void remove(int number){
        todoArrayList.remove(number - 1);
    }
    
    // - prints the exercises. Each task has a number associated with it on the print statement — use the task's index here (+1).
    public void print() {
        for (int i = 0; i < todoArrayList.size(); i++){
            System.out.println((i + 1) + ": " + todoArrayList.get(i));
        }
    }
}