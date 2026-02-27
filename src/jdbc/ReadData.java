package jdbc;

import jdbcCURD.Student;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ReadData {
    public static void main(String[] args) throws Exception{
        // load & register Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // establish Connection
        String url = "jdbc:mysql://localhost:3306/himanshu";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

        List<Student> stdList = new ArrayList<>();

        String query = "select *from student";

        PreparedStatement ps = connection.prepareStatement(query);

        ResultSet rs = ps.executeQuery();
//        while (rs.next()){
//            System.out.println("Id : "+rs.getInt(1)+", name : "+rs.getString(2)+", Marks : "+rs.getInt(3));
//            System.out.println("=================================================================================");
//        }

        while (rs.next()){
            Student std = new Student();
            std.setId(rs.getInt(1));
            std.setName(rs.getString(2));
            std.setMarks(rs.getInt(3));
            stdList.add(std);
        }

        for (Student std : stdList){
            System.out.println("Id : "+std.getId()+" name : "+std.getName()+ " marks : "+std.getMarks());
            System.out.println("========================================================================");
        }
    }
}

