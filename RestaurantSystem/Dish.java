import java.util.ArrayList;
public class Dish {

    private DishType dishType;
    private String name;
    private ArrayList<String> ingredients;

     Dish(DishType dishType, String name, ArrayList<String> ingredients) {
        this.dishType = dishType;
        this.name = name;
        this.ingredients = ingredients;
    }
    public void displayDish() {
        System.out.println("Dish Type: " + dishType);
        System.out.println("Dish Name: " + name);
        System.out.println("Ingredients:");
        for (String i : ingredients) {
            System.out.println("- " + i);
        }
    }
}


