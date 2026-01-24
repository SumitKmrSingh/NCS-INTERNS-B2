package association;

public class Client {
    public static void main(String[] args) {
        Student student = new Student("Sumit", 1,new Address("Patna", "Bihar"));
        student.displayStudentDetails();
    }
}
