
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String answer = scanner.nextLine();
            if (answer.equals("")){
                break;
            }
            String[] stringArr = answer.split(" ");
            for (String word : stringArr){
                if (word.contains("av")){
                    System.out.println(word);
                }
            }
        }
    }
}
