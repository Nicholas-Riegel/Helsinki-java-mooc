
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int sumOfPositives = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                break;
            }
            if (num > 0){
                sumOfPositives = sumOfPositives + num;
                total = total + 1;
            }
        }
        if (total == 0){
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double) sumOfPositives / total;
            System.out.println(average);
        }
    }
}
