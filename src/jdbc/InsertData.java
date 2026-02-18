package jdbc;

import java.rmi.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {
    public static void main(String[] args) {
        try {
            // load & register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // establish Connection
            String url = "jdbc:mysql://localhost:3306/himanshu";
            String username = "root";
            String password = "root";
            Connection connection = DriverManager.getConnection(url, username, password);

            String query = "insert into student values(?, ?, ?)";

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, 3);
            ps.setString(2, "Himanshu");
            ps.setInt(3, 91);

            int row = ps.executeUpdate();
            if (row > 0){
                System.out.println("Data Inserted Successfully");
            }
            else {
                System.out.println("Data not Inserted Successfully");
            }

            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println();
        }
    }
}
