public class Employee {

    private String name;

    private int idNumber;

    public Department getDepartment() {
        return department;
    }

    public String getFullName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getPosition() {
        return position;
    }

    private Department department;

    private String position;

    Employee(String fullName, int idNumber, Department department, String position) {
        this.name = fullName;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    public void displayEmployee(){

        System.out.println("Full Name: " + name + " ,Id Number: " + idNumber + " ,Department: " + department + " ,Position: " + position);
    }


}
