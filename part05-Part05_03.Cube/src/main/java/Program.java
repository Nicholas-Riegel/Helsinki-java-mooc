
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        int answer = Integer.valueOf(scanner.nextLine());
        Cube cube = new Cube(answer);

        System.out.println(cube.volume());
        System.out.println(cube);
    }
}
