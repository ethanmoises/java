import java.util.*;
public class Main {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);

        List<Employee> employee = new ArrayList<>();


        employee.add(new Employee(101, "Ethan James", "Moises", "Java Developer", Department.IT));
        employee.add(new Employee(102, "Nathan James", "Moises", "Java Developer", Department.IT));
        employee.add(new Employee(103, "Athan James", "Moises", "Java Developer", Department.IT));
        employee.add(new Employee(104, "James Moises", "Ethan", "Java Developer", Department.IT));


        String choice = "y";

    while(choice.equalsIgnoreCase("y")) {

        System.out.println("Available Employee IDs:");
        for (Employee e : employee) {
            System.out.println(e.getIdNum());
        }

        System.out.println("Enter An ID To View: ");
        int searchId = scan.nextInt();

        boolean found = false;

        for (Employee e: employee) {
            if(e.getIdNum() == searchId) {
                System.out.println(e);

                found = true;
                break;

            }
        }
        if (!found) {
            System.out.println("Employee with ID" + searchId + " not found.");
        }

        System.out.println("Continue Searching? (Y/N)");
        choice = scan.next();

        while (!(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("n"))) {
            System.out.println("Wrong choice. Please enter only 'y' or 'n'.");

            System.out.print("Search again? (y/n): ");
            choice = scan.next();
        }

    }

    }
}