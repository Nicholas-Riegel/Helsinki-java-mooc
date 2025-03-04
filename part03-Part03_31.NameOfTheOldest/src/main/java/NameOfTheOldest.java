
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = -1;
        String oldestName = "";
        while (true) {
            String answer = scanner.nextLine();
            if (answer.equals("")){
                break;
            }
            String[] answerArray = answer.split(",");
            int age = Integer.valueOf(answerArray[1]);
            String name = answerArray[0];
            if (age > oldest){
                oldest = age;
                oldestName = name;
            }
        }
        if (oldest > -1){
            System.out.println("Name of the oldest: "+oldestName);
        }
    }
}
