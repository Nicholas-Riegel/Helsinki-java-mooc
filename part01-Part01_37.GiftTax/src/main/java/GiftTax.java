
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of gift?");
        double answer = Double.valueOf(scan.nextLine());
        double tax = 0;
        if (answer >= 1000000){
            tax = 142100 + (answer - 1000000) * .17;
        } else if (answer >= 200000){
            tax = 22100 + (answer - 200000) * .15;
        } else if (answer >= 55000){
            tax = 4700 + (answer - 55000) * .12;
        } else if (answer >= 25000){
            tax = 1700 + (answer - 25000) * .10;
        } else if (answer >= 5000){
            tax = 100 + (answer - 5000) * .08;
        } else {
            tax = 0;
        }

        if (tax == 0){
            System.out.println("No Tax!");
        } else {
            System.out.println("Tax: "+tax);
        }
        
    }
}
