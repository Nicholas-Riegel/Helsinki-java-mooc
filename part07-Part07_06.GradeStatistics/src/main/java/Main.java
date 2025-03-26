import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Frontend ui = new Frontend(new Scanner(System.in), new Grades());

        ui.start();
    }
}