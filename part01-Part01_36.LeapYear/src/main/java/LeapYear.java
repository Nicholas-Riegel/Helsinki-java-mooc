
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year:");
        int answer = Integer.valueOf(scan.nextLine());
        if (answer % 4 != 0){
            System.out.println("The year is not a leap year.");
        } else if (answer % 100 == 0 && answer % 400 != 0){
            System.out.println("The year is not a leap year.");
        } else {
            System.out.println("The year is a leap year.");
        }
    }
}
