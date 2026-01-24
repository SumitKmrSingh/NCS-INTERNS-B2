package encapsulation;

public class Client {
    public static void main(String[] args) {
//        Employee employee1 = new Employee("Sumi", "1011", "SE");
//        employee1.displayEmployeeDetails();

        Employee employee1 = new Employee();
        employee1.setEmpId("101");
        String empid = employee1.getEmpId();
        System.out.println(empid);

        employee1.setEmpName("Sumi");
        employee1.setEmpName("Sumit");

//
       employee1.displayEmployeeDetails();

//        Employee employee2 = new Employee("Sumit", "101", "SE");
//        employee2.displayEmployeeDetails();
    }
}
