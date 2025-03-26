import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeBook {
    
    private ArrayList<Recipe> recipeList;
    private ArrayList<String> recipeInputs;

    public RecipeBook(){
        recipeList = new ArrayList<>();
        recipeInputs = new ArrayList<>();
    }

    public void loadRecipesFromFile(String file){

        // try (Scanner fileReader = new Scanner(Paths.get("part07-Part07_07.RecipeSearch/" + file))){
        try (Scanner fileReader = new Scanner(Paths.get(file))){
           
            while (fileReader.hasNextLine()) {
                
                String row = fileReader.nextLine();

                if (row.isEmpty() || !fileReader.hasNextLine()){
                    Recipe recipe = new Recipe(recipeInputs.get(0), Integer.valueOf(recipeInputs.get(1)));
                    for (int i = 2; i < recipeInputs.size(); i++){
                        recipe.addIngredients(recipeInputs.get(i));
                    }
                    recipeList.add(recipe);
                    recipeInputs.clear();
                    continue;
                }
                recipeInputs.add(row);
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void listRecipes(){
        for (Recipe recipe : recipeList){
            System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
        }
    }

    public void findInName(String word){
        for (Recipe recipe : recipeList){
            if (recipe.getName().contains(word)){
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
            }
        }
    }
    
    public void findByTime(int time){
        for (Recipe recipe : recipeList){
            if (recipe.getTime() <= time){
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
            }
        }
    }
    
    public void findByIngredient(String ingredient){
        for (Recipe recipe : recipeList){
            if (recipe.getIngredients().contains(ingredient)){
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
            }
        }
    }
}
