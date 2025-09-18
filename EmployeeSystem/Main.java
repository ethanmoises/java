import java.util.Scanner;
public class Main {
   public static void main (String[]args) {
      Scanner scan = new Scanner(System.in);

      Employee emp1 = new Employee("Ethan Moises", 1, "Java Developer", "IT");
      Employee emp2 = new Employee("Conrad Fisher", 2, "Manager", "SALES");
      Employee emp3 = new Employee("Noah Calhoun", 3, "Assistant", "HR");
      Employee emp4 = new Employee("Harry", 4, "Developer", "IT");

      Employee[] employee = {emp1, emp2, emp3, emp4};

      String choice = "y";

      while (choice.equalsIgnoreCase("y")) {
         System.out.println("Available Employee IDs:");
         for (int i = 0; i < employee.length; i++) {

            System.out.println("Employee ID: " + employee[i].getEmployeeId());

         }

         System.out.print("Enter an Employee ID to view details: ");
         int searchId = scan.nextInt();

         boolean found = false;
         for (int i = 0; i < employee.length; i++) {
            if (employee[i].getEmployeeId() == searchId) {
               System.out.println("Employee ID: " + employee[i].getEmployeeId() +
                       ", Name: " + employee[i].getName() +
                       ", Position: " + employee[i].getPosition() +
                       ", Department: " + employee[i].getDepartment());
               found = true;
               break;
            }
         }

         if (!found) {
            System.out.println("Employee not found!");
         }

         System.out.print("Do you want to search again? (Y/N): ");
         choice = scan.next();
      }
         System.out.println("Program ended.");
   }
}
