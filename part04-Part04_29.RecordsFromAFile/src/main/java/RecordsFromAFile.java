
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get(file))){

            while (reader.hasNextLine()) {

                String row = reader.nextLine();
                String[] array = row.split(",");
                String name = array[0];
                int age = Integer.valueOf(array[1]);
                
                if (age != 1){
                    System.out.println(name + ", age: " + age + " years");
                } else {
                    System.out.println(name + ", age: " + age + " year");
                }
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
