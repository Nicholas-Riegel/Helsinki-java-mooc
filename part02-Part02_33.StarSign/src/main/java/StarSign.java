
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int num = 0;
        while (num < number){
            System.out.print("*");
            num++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int num = 0;
        while (num < size){
            printStars(size);
            num++;
        }
    }

    public static void printRectangle(int width, int height) {
        int num = 0;
        while (num < height){
            printStars(width);
            num++;
        }
    }

    public static void printTriangle(int size) {
        int num = 1;
        while (num <= size){
            printStars(num);
            num++;
        }
    }
}
