import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start(){
        while (true) {

            System.out.print("Command: ");
            String answer = scanner.nextLine();
            
            if (answer.equals("stop")){

                return;
            
            } else if (answer.equals("add")){

                System.out.print("To add: ");
                String toAdd = scanner.nextLine();
                todoList.add(toAdd);
            
            } else if (answer.equals("list")){
            
                todoList.print();
            
            } else if (answer.equals("remove")){
            
                System.out.print("Which one is removed? ");
                int toBeRemoved = Integer.valueOf(scanner.nextLine());
                todoList.remove(toBeRemoved);
            }
        }
    }
}
