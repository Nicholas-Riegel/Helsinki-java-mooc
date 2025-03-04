import java.util.Scanner;
public class PersonalDetails {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int sumOfBirthYears = 0;
        int counter = 0;

        while (true) {
            String answer = scanner.nextLine();
            if (answer.equals("")){
                break;
            }
            String[] answerArray = answer.split(",");
            String name = answerArray[0];
            int birthYear = Integer.valueOf(answerArray[1]);

            sumOfBirthYears = sumOfBirthYears + birthYear;
            counter++;
            
            if (name.length() > longestName.length()){
                longestName = name;
            }
        }
        double averageBirthYear = (double) sumOfBirthYears / counter;
        System.out.println("Longest name: "+longestName);
        System.out.println("Average of birth years: "+averageBirthYear);
    }
}
