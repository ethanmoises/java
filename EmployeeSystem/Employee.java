public class Employee {

    private String name;

    private int employeeId;

    private String position;

    private String department;

    Employee(String name, int employeeId, String position, String department) {
    this.name = name;
    this.employeeId = employeeId;
    this.position = position;
    this.department = department;
    }

    public String getName(){
        return name;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public String getPosition(){
        return position;
    }

    public String getDepartment(){
        return department;
    }



}
