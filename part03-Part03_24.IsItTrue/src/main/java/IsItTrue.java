
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a string: ");
        String answer = scanner.nextLine();
        if (answer.equals("true")){
            System.out.println("You got it right!");
            // break;
        } else {
            System.out.println("Try again!");
        }
    }
}
