
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int answer = Integer.valueOf(scan.nextLine());
        if (answer >= 0 && answer <= 120){
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }

    }
}
