import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    // that sorts an array of integers.
    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    // that sorts an array of strings.
    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    // that sorts a list of integers.
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    // that sorts a list of strings.
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
}
