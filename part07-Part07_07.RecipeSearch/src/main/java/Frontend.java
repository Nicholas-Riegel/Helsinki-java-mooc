import java.util.Scanner;

public class Frontend {

    private Scanner scanner;
    private RecipeBook recipeBook;

    public Frontend(Scanner a, RecipeBook b){
        this.scanner = a;
        this.recipeBook = b;
    }

    public void start(){

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        // String fileName = "recipes.txt";

        recipeBook.loadRecipesFromFile(fileName);        

        System.out.println(
            "Commands:\n" 
            + "list - lists the recipes\n" 
            + "stop - stops the program\n" 
            + "find name - searches recipes by name\n"
            + "find cooking time - searches recipes by cooking time\n"
            + "find ingredient - searches recipes by ingredient"
        );

        while (true) {
            
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
         
            if (command.equals("stop")){
                break;
            }

            if (command.equals("list")){
                System.out.println("Recipes:");
                recipeBook.listRecipes();
            }
            
            if (command.equals("find name")){
                System.out.print("Searched word: ");
                String searchWord = scanner.nextLine();
                System.out.println("Recipes:");
                recipeBook.findInName(searchWord);
            }
            
            if (command.equals("find cooking time")){
                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                System.out.println("Recipes:");
                recipeBook.findByTime(maxTime);
            }
            
            if (command.equals("find ingredient")){
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("Recipes:");
                recipeBook.findByIngredient(ingredient);
            }
        }
    }
}
