import java.util.Scanner;

public class Frontend {

    private Scanner scanner;
    private BirdDB birdDB;

    public Frontend(Scanner a, BirdDB b){
        scanner = a;
        birdDB = b;
    }

    public void start(){

        while (true) {
            
            System.out.print("? ");
            String input = scanner.nextLine();
            
            if (input.equals("Quit")){
                break;
            }

            if (input.equals("Add")){
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();
                Bird bird = new Bird(name, latinName);
                birdDB.addBird(bird);
            }

            if (input.equals("All")){
                birdDB.listBirds();
            }

            if (input.equals("Observation")){
                System.out.print("Bird? ");
                String birdName = scanner.nextLine();
                birdDB.addObservation(birdName);
            }

            if (input.equals("One")){
                System.out.print("Bird? ");
                String birdName = scanner.nextLine();
                birdDB.getOneBird(birdName);
            }
        }
    }
}
