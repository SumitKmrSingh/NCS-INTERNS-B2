package jdbc;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReadData {
    public static void main(String[] args) throws Exception{
        // load & register Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // establish Connection
        String url = "jdbc:mysql://localhost:3306/himanshu";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

        String query = "select *from student";

        PreparedStatement ps = connection.prepareStatement(query);

        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            System.out.println("Id : "+rs.getInt(1)+", name : "+rs.getString(2)+", Marks : "+rs.getInt(3));
            System.out.println("=================================================================================");
        }
    }
}

