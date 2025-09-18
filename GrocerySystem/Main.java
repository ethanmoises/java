import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Rice (1kg)", 50.00, 100));
        products.add(new Product(2, "Milk (1L)", 75.00, 50));
        products.add(new Product(3, "Bread", 35.00, 80));
        products.add(new Product(4, "Eggs (dozen)", 120.00, 30));
        products.add(new Product(5, "Chicken (1kg)", 180.00, 40));

        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Available Products:");
            for (Product p : products) {
                System.out.println(p.getId() + " - " + p.getName());
            }

            System.out.print("Enter a Product ID to view: ");
            int searchId = scan.nextInt();

            boolean found = false;
            for (Product p : products) {
                if (p.getId() == searchId) {
                    System.out.println("Product found: " + p);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Product with ID " + searchId + " not found.");
            }


            System.out.print("Search another product? (y/n): ");
            choice = scan.next();
            while (!(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("n"))) {
                System.out.println("Wrong choice. Please enter only 'y' or 'n'.");
                System.out.print("Search another product? (y/n): ");
                choice = scan.next();
            }
        }

        System.out.println("Thank you for visiting the Grocery Store!");
        scan.close();
    }
}
