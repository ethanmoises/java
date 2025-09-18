public class Employee {

    private int idNum;

    private String firstName;

    private String lastName;

    private String position;

    private Department department;
    Employee(int idNum, String firstName, String lastName, String position, Department department){
        this.idNum = idNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.department = department;

    }
    @Override
    public String toString(){
        return "ID: " + idNum +
                ", First Name: " + firstName +
                ", Last Name: " + lastName +
                ", Position: " + position +
                ", Department: " + department;

    }

    public int getIdNum() {
        return idNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getPosition(){
        return position;
    }
    public Department getDepartment() {
        return department;
    }


}
