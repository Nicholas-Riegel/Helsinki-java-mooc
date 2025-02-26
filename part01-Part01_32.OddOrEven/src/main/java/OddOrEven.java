
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("Give a number:");
        int answer = Integer.valueOf(scan.nextLine());
        if (answer % 2 == 0){
            System.out.println("Number "+answer+" is even.");
        } else {
            System.out.println("Number "+answer+" is odd.");
        }
    }
}
