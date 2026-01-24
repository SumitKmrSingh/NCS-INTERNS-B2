package encapsulation;

public class Employee {
    private String empName;
    private String empId;
    private String empRole;

    public Employee() {
    }

    public Employee(String empName, String empId, String empRole) {
        this.empName = empName;
        this.empId = empId;
        this.empRole = empRole;
    }

    public void displayEmployeeDetails(){
        System.out.println("Employee name :"+empName+" Employee ID : "+empId+" Employee Role : "+empRole);
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        if(empId.length() == 3){
            this.empId = empId;
        }
        else {
            System.out.println("Invalid empID");
        }

    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }
}
