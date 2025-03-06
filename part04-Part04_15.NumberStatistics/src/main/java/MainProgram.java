
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        Statistics stats = new Statistics();
        Statistics evens = new Statistics();
        Statistics odds = new Statistics();

        System.out.println("Enter numbers:");

        while (true) {
            int answer = Integer.valueOf(scanner.nextLine());
            if (answer == -1){
                break;
            }
            stats.addNumber(answer);
            if (answer % 2 == 0){
                evens.addNumber(answer);
            } else {
                odds.addNumber(answer);
            }
        }
        
        System.out.println("Sum: "+stats.sum());
        System.out.println("Sum of even numbers: "+evens.sum());
        System.out.println("Sum of odd numbers: "+odds.sum());
    }
}
