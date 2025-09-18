import java.util.*;

public class Operations {
    private List<Student> records = new ArrayList<>();


    public void addRecord(String fullName, String studentId, String grade, String bookTitle, String bookId) {

        long count = records.stream()
                .filter(s -> s.getStudentId().equals(studentId))
                .count();


        if (count >= 3) {
            System.out.println("Error: Student with ID " + studentId + " has already borrowed 3 books.");
            return;
        }


        records.add(new Student(fullName, studentId, grade, bookTitle, bookId));
        System.out.println("Record added successfully!");
    }


    public void deleteRecord(String studentId, String bookId) {

        boolean removed = records.removeIf(s ->
                s.getStudentId().equals(studentId) && s.getBookId().equals(bookId));


        if (removed) {
            System.out.println("Record deleted successfully.");
        } else {
            System.out.println("Record not found.");
        }
    }


    public void updateRecord(String studentId, String bookId, String newBookTitle) {
        for (Student s : records) {

            if (s.getStudentId().equals(studentId) && s.getBookId().equals(bookId)) {
                s.setBookTitle(newBookTitle);
                System.out.println("Book title updated successfully.");
                return;
            }
        }

        System.out.println("Record not found.");
    }


    public void searchRecord(String studentId) {
        boolean found = false;

        for (Student s : records) {
            if (s.getStudentId().equals(studentId)) {
                System.out.println(s);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No records found for ID: " + studentId);
        }
    }


    public void displayRecords() {
        if (records.isEmpty()) {
            System.out.println("No records to display.");
            return;
        }

        System.out.println("All Borrow Records:");
        for (Student s : records) {
            System.out.println(s);
        }
    }
}
