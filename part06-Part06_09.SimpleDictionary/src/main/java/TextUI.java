import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start(){
        while (true){

            System.out.print("Command: ");
            String answer = scanner.nextLine();

            if (answer.equals("end")){
            
                System.out.println("Bye bye!");
                return;
            
            } else if (answer.equals("add")){
            
                System.out.print("Word: ");
                String word = scanner.nextLine();
            
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
            
                dictionary.add(word, translation);
            
            } else if (answer.equals("search")){

                System.out.print("To be translated: ");
                String toBeTranslated = scanner.nextLine();
                
                String translation = dictionary.translate(toBeTranslated);
                
                if (translation == null){
                    System.out.println("Word " + toBeTranslated + " was not found");
                } else {
                    System.out.println("Translation: " + translation);
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
