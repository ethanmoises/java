import java.util.*;
public class Main {
    public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<Employee> employees = new ArrayList<>();

        System.out.println("How many employees do you want to enter?: ");
        int count = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < count; i++) {
            System.out.println("Enter Name: ");
            String name = scan.nextLine();

            System.out.println("Enter Id Number: ");
            int idNumber = scan.nextInt();
            scan.nextLine();

            System.out.println("Enter Department: ");
            String deptInput = scan.nextLine();
            Department dept = Department.valueOf(deptInput.toUpperCase());

            System.out.println("Enter Position: ");
            String position = scan.nextLine();

            Employee emp = new Employee(name, idNumber, dept, position);
            employees.add(emp);
        }

            System.out.println("--Employee List--");
            for(Employee e: employees) {

                e.displayEmployee();
            }

        }
}
