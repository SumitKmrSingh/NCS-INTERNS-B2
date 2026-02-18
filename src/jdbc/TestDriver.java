package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestDriver {
    public static void main(String[] args) {
        try {
            // Step 1 : register and load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Connected Successfully");

            // establish connection between Java application and Database
            String url="jdbc:mysql://localhost:3306/himanshu";
            String username="root";
            String password="root";
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection establish Successfully");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Driver not connected");
        }
    }
}
