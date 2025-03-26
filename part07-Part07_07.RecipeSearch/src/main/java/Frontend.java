import java.util.Scanner;

public class Frontend {

    private RecipeBook recipeBook;
    private Scanner scanner;

    public Frontend(Scanner scanner, RecipeBook recipeBook){
        this.recipeBook = recipeBook;
        this.scanner = scanner;
    }

    public void start(){

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        // String fileName = "recipes.txt";

        recipeBook.loadRecipesFromFile(fileName);        

        System.out.println("Commands:\nlist - lists the recipes\nstop - stops the program\nfind name - searches recipes by name\nfind cooking time - searches recipes by cooking time\nfind ingredient - searches recipes by ingredient");

        while (true) {
            
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
         
            if (command.equals("stop")){
                break;
            }

            if (command.equals("list")){
                System.out.println("Recipes:");
                for(Recipe recipe : recipeBook.getRecipeList()){
                    System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
                }
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
