public class Student {
  
    private String fullName;
    private String studentId;
    private String grade;
    private String bookTitle;
    private String bookId;


    public Student(String fullName, String studentId, String grade, String bookTitle, String bookId) {
        this.fullName = fullName; 
        this.studentId = studentId;
        this.grade = grade;
        this.bookTitle = bookTitle;
        this.bookId = bookId;
    }


    public String getStudentId() {
        return studentId;
    }


    public String getBookId() {
        return bookId;
    }


    public void setBookTitle(String newTitle) {
        this.bookTitle = newTitle;
    }


    @Override
    public String toString() {
        return "Name: " + fullName +
                ", ID: " + studentId +
                ", Grade: " + grade +
                ", Book: " + bookTitle +
                ", Book ID: " + bookId;
    }
}

