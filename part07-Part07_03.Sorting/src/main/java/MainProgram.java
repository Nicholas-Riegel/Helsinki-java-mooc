import java.util.Arrays;

public class MainProgram {

    
    public static int smallest(int[] array){
        int smallest = array[0];
        for (int num : array){
            if (num < smallest){
                smallest = num;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int index = -1;
        int smallest = MainProgram.smallest(array);
        for (int i = 0; i < array.length; i++){
            if (array[i] == smallest){
                index = i;
                break;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int indexOfSmallest = startIndex;
        for (int i = startIndex; i < table.length; i++){
            if (table[i] < smallest){
                smallest = table[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++){
            int iOfSmallest = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, iOfSmallest);
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        
        // write your test code here

        // int[] array = {3, 1, 5, 99, 3, 12};
        // System.out.println(MainProgram.smallest(array));

        // int[] numbers = {6, 5, 8, 7, 11};
        // System.out.println("Smallest: " + MainProgram.smallest(numbers));

        // indices:      0  1  2  3  4
        // int[] numbers = {6, 5, 8, 7, 11};
        // System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));

        // int[] numbers = {-1, 6, 9, 8, 12};
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

        // int[] numbers = {3, 2, 5, 4, 8};

        // System.out.println(Arrays.toString(numbers));

        // MainProgram.swap(numbers, 1, 0);
        // System.out.println(Arrays.toString(numbers));

        // MainProgram.swap(numbers, 0, 3);
        // System.out.println(Arrays.toString(numbers));

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers));
        MainProgram.sort(numbers);
    }
}
