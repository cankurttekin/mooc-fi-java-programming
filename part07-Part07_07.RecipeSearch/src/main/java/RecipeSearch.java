
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Recipe> recipes = new ArrayList<Recipe>();
        
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        
        //File recipes = new File(input);
        try (Scanner fileReader = new Scanner(new File(fileName))) {
            while (fileReader.hasNextLine()) {
                String name = fileReader.nextLine(); // first line is recipe name of each recipes seperated by empty line
                int cookingTime = Integer.valueOf(fileReader.nextLine()); // second line cooking time
                
                Recipe recipe = new Recipe(name, cookingTime);
                recipes.add(recipe);
                
                String ingredient = fileReader.nextLine(); // at least one ingredient
                recipe.addIngredient(ingredient);
                
                while(fileReader.hasNextLine() && !ingredient.isEmpty()) {
                    ingredient = fileReader.nextLine();
                    recipe.addIngredient(ingredient);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
        
        // user interface
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        while (true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine();
            
            if (input.equals("stop")) {
                break;
            } else if (input.equals("list")) {
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            } else if (input.equals("find name")) {
                System.out.print("Searched word: ");
                input = scanner.next();
                searchWord(recipes, input);
                
            } else if (input.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                input = scanner.next();
                
                searchCookingTime(recipes, Integer.valueOf(input));
                
            } else if (input.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                input = scanner.next();
                searchIngredient(recipes, input);
            }
        }

    }
    
    public static void searchWord(ArrayList<Recipe> recipes, String keyword) {
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(keyword)) {
                System.out.println(recipe);
            }
        }
    }
    
    public static void searchCookingTime(ArrayList<Recipe> recipes, int cookingTime) {
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= cookingTime) {
                System.out.println(recipe);
            }
        }
    }
    
    public static void searchIngredient(ArrayList<Recipe> recipes, String keyword) {
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(keyword)) {
                System.out.println(recipe);
            }
        }
    }

}
