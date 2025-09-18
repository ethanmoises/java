import java.util.*;
public class Main {
    public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);

    ArrayList<GroceryItem> groceryItems = new ArrayList<>();

    while(true) {
        System.out.println("1. Add Item");
        System.out.println("2. Check Out");
        System.out.println("3. Exit");
        System.out.println("Select a number(1-3): ");
        int choice = scan.nextInt();
        scan.nextLine();


        switch(choice) {
            case 1:
                System.out.println("Enter Item Name: ");
                String name = scan.nextLine();
                System.out.println("Enter ID Number: ");
                int idNum = scan.nextInt();
                System.out.println("Enter Price: ");
                double price = scan.nextDouble();
                scan.nextLine();

                System.out.println("Is it discounted? (y/n): ");
                String isDiscounted = scan.nextLine();
                boolean discounted = isDiscounted.equalsIgnoreCase("y");

                double discountRate = 0.0;
                if (discounted) {
                    System.out.println("Enter discount rate (%): ");
                    discountRate = scan.nextDouble() / 100.0;
                    scan.nextLine();
                }

                GroceryItem item = new GroceryItem(name, idNum, price, discounted, discountRate);
                groceryItems.add(item);
                break;

            case 2:
                System.out.println("---RECEIPT---");
                double subtotal = 0;
                for(GroceryItem g: groceryItems){
                    double finalPrice;


                    if (g.isDiscounted()) {
                        finalPrice = g.getPrice() * (1 - g.getDiscountRate());
                    } else {
                        finalPrice = g.getPrice();
                    }
                    System.out.println("Item: " + g.getName());
                    System.out.println("Id Number: " + g.getIdNum());
                    System.out.println("Price: ₱" + g.getPrice());

                    if (g.isDiscounted()) {
                        System.out.println("Discount Rate: " + (g.getDiscountRate() * 100) + "%");
                        System.out.println("Discounted Price: ₱" + finalPrice);
                    }

                    System.out.println("-------");

                    subtotal += finalPrice;

                }
                System.out.println("TOTAL: ₱" + subtotal);
                break;

            case 3:
                System.out.println("Exiting program...");
                return;

            }
        }
    }
}
