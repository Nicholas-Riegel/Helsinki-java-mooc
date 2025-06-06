
import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);

        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }
    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getId() == searchedId){
                return i;
            }
        }
        return -1;
    }

    // number of books to search for is 5
    // [0, 1, 2, 3, 4]
    // List<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4)) ;
    // int index = binarySearch(list, 4);
    // System.out.println("The index of searched is: " + index);
    // }
    
    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        
        int begin = 0;
        int end = books.size() - 1;
        int middle;
        int bookId;

        while (begin <= end){

            middle = (begin + end) / 2;
            bookId = books.get(middle).getId();

            if (bookId == searchedId){
                return middle;
            } else if (searchedId < bookId){
                end = middle - 1;
            } else {
                begin = middle + 1;
            }
        }
        return -1;
    }
}