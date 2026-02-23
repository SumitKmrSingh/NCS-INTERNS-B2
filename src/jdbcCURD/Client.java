package jdbcCURD;

import java.sql.Connection;

public class Client {
    public static void main(String[] args) {
//        Connection connection = DBConnection.getConnection();
//        if (connection != null){
//            System.out.println("Connection Establish");
//        }
//        else {
//            System.out.println("Connection not establish");
//        }

        // Insert Data
        Student student = new Student(5, "Kavin", 81);
        StudentDAO studentDAO = new StudentDAOImpl();
        boolean isInserted = studentDAO.insertStudent(student);
        if (isInserted){
            System.out.println("Data Inserted Successfully");
        }
        else {
            System.out.println("Data not Inserted Successfully");
        }

        // Read Data

        // Update Data

        // Delete Data
    }
}
