import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Pick A Dish Type: ");
        System.out.println("1. Main Dish");
        System.out.println("2. Appetizer");
        System.out.println("3. Soup");
        System.out.println("4. Dessert");
        System.out.print("Select 1-4: ");
        int choice = scan.nextInt();
        scan.nextLine();

        DishType dishType;
        switch(choice) {
            case 1: dishType = DishType.MAIN_COURSE; break;
            case 2: dishType = DishType.APPETIZER; break;
            case 3: dishType = DishType.SOUP; break;
            case 4: dishType = DishType.DESSERT; break;
            default:
                System.out.println("Invalid choice");
                scan.close();
                return;
        }


        System.out.print("What is the name of the dish?: ");
        String dishName = scan.nextLine();

        ArrayList<String> ingredients = new ArrayList<>();
        String ing;
        while(true) {
            System.out.print("Enter ingredient (n to stop): ");
            ing = scan.nextLine();
            if(ing.equalsIgnoreCase("n")) {
                break;
            }
            ingredients.add(ing);
        }


        Dish dish = new Dish(dishType, dishName, ingredients);


        dish.displayDish();


    }
}