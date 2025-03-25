import java.util.Scanner;

public class Frontend {

    private Scanner scanner;
    private Grades grades;

    public Frontend(Scanner scanner, Grades grades){
        this.scanner = scanner;
        this.grades = grades;
    }

    public void start(){
        
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
        
            int input = Integer.valueOf(scanner.nextLine());
        
            if (input == -1){
                break;
            }
            
            grades.addPoint(input);
        }
        
        System.out.println("Point average (all): " + grades.averagePoints());
        
        System.out.println("Point average (passing): " + grades.averageOfPassingPoints());

        System.out.println("Pass percentage: " + grades.passPercentage());

        System.out.println("Grade distribution:\n5: " 
            + grades.printStars(5) + "\n4: "
            + grades.printStars(4) + "\n3: "
            + grades.printStars(3) + "\n2: "
            + grades.printStars(2) + "\n1: "
            + grades.printStars(1) + "\n0: "
            + grades.printStars(0)  
        );
    }
}
