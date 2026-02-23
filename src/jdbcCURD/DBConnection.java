package jdbcCURD;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String mysqlDriver = "com.mysql.cj.jdbc.Driver";
    private static final String url="jdbc:mysql://localhost:3306/himanshu";
    private static final String username="root";
    private static final String password="root";

    private static Connection connection;

    public static Connection getConnection(){
        try {
            Class.forName(mysqlDriver);
            if (connection == null){
                connection = DriverManager.getConnection(url, username, password);
            }
        }
        catch (Exception e){
            e.getMessage();
            System.out.println("Connection not establish");
        }
        return connection;
    }
}
