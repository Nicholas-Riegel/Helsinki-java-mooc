

public class FromParameterToOne {
    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    public static void printFromNumberToOne(int num){
        while (num > 0){
            System.out.println(num);
            num--;
        }
    }
}
