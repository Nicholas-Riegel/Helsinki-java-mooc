
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = -1;
        while (true) {
            String answer = scanner.nextLine();
            if (answer.equals("")){
                break;
            }
            String[] stringArray = answer.split(",");
            int age = Integer.valueOf(stringArray[1]);
            if (age > oldest){
                oldest = age;
            }
        }
        if (oldest > -1){
            System.out.println("Age of oldest: "+oldest);
        }
    }
}
