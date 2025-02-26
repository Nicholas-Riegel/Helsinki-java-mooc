
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Give points [0-100]:");
        
        int answer = Integer.valueOf(scan.nextLine());

        if (answer > 100){
            System.out.println("incredible!");
        } else if (answer >= 90){
            System.out.println("5");
        } else if (answer >= 80){
            System.out.println("4");
        } else if (answer >= 70){
            System.out.println("3");
        } else if (answer >= 60){
            System.out.println("2");
        } else if (answer >= 50){
            System.out.println("1");
        } else if (answer >= 0){
            System.out.println("Failed");
        } else {
            System.out.println("impossible!");
        }
    }
}
