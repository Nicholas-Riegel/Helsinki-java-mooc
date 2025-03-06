import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> bookArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()){
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            bookArrayList.add(new Book(title, pages, year));
        }

        System.out.print("What information will be printed? ");
        String answer = scanner.nextLine();

        if (answer.equals("everything")){
            for (Book b : bookArrayList){
                System.out.println(b);
            }
        } else if (answer.equals("name")){
            for (Book b : bookArrayList){
                System.out.println(b.getTitle());
            }
        }
    }
}