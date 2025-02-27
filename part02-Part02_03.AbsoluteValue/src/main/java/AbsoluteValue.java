
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = Integer.valueOf(scanner.nextLine());
        if (answer < 0){
            System.out.println(answer * -1);
        } else {
            System.out.println(answer);
        }
    }
}
