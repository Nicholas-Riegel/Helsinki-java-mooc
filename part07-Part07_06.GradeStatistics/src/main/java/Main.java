
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Grades gradList = new Grades();
        
        Frontend ui = new Frontend(scanner, gradList);

        ui.start();
    }
}
