
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String answer = scanner.nextLine();
        // try (Scanner fileReader = new Scanner(Paths.get("part04-Part04_25.PrintingASpecifiedFile/" + answer))){
        try (Scanner fileReader = new Scanner(Paths.get(answer))){

            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                System.out.println(row);
            }

        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
