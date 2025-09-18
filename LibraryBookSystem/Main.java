import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operations ops = new Operations();
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            // Display menu options
            System.out.println("\nLibrary Book System Menu:");
            System.out.println("1. Add Record");
            System.out.println("2. Delete Record");
            System.out.println("3. Update Record");
            System.out.println("4. Search Record");
            System.out.println("5. Display All Records");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();


            switch (choice) {
                case 1: // Add a new record
                    System.out.print("Student Name: ");
                    String name = scan.nextLine();
                    System.out.print("Student ID: ");
                    String id = scan.nextLine();
                    System.out.print("Grade/Class: ");
                    String grade = scan.nextLine();
                    System.out.print("Book Title: ");
                    String bookTitle = scan.nextLine();
                    System.out.print("Book ID / Barcode: ");
                    String bookId = scan.nextLine();
                    ops.addRecord(name, id, grade, bookTitle, bookId);
                    break;

                case 2:
                    System.out.print("Student ID: ");
                    id = scan.nextLine();
                    System.out.print("Book ID / Barcode to Delete: ");
                    bookId = scan.nextLine();
                    ops.deleteRecord(id, bookId);
                    break;

                case 3:
                    System.out.print("Student ID: ");
                    id = scan.nextLine();
                    System.out.print("Book ID / Barcode: ");
                    bookId = scan.nextLine();
                    System.out.print("New Book Title: ");
                    String newTitle = scan.nextLine();
                    ops.updateRecord(id, bookId, newTitle);
                    break;

                case 4:
                    System.out.print("Student ID to Search: ");
                    id = scan.nextLine();
                    ops.searchRecord(id);
                    break;

                case 5:
                    ops.displayRecords();
                    break;

                case 6:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6); 
    }
}
