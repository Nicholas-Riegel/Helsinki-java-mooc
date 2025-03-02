
public class AdvancedAstrology {

    public static void printStars(int number) {
        int num = 0;
        while (num < number){
            System.out.print("*");
            num++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 0; i<number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int spaces = size - 1;
        int stars = 1;
        while (spaces >= 0) {
            printSpaces(spaces);
            printStars(stars);
            spaces--;
            stars++;
        }
    }

    public static void christmasTree(int height) {
        
        int spaces = height - 1;
        int stars = 1;
        int trunkWidth = 3;
        int spacesToTrunk = height - 2;
        
        while (spaces >= 0) {
            printSpaces(spaces);
            printStars(stars);
            spaces--;
            stars = stars + 2;
        }
        
        for (int i = 0; i < 2; i++){
            printSpaces(spacesToTrunk);
            printStars(trunkWidth);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        // printTriangle(5);
        // System.out.println("---");
        // christmasTree(4);
        // System.out.println("---");
        christmasTree(10);
    }
}
