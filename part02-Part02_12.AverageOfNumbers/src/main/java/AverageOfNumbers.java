
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int total = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                break;
            }
            total = total + 1;
            sum = sum + num;
        }
        double average = (double) sum / total;
        System.out.println("Average of the numbers: "+average);
    }
}
