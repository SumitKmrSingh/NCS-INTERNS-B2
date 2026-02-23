package jdbcCURD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAOImpl implements StudentDAO{
    public StudentDAOImpl() {
    }

    @Override
    public boolean insertStudent(Student student)  {
        String query = "insert into student values(?, ?, ?)";

        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setInt(3, student.getMarks());

            int row = ps.executeUpdate();

            return row>0;
        } catch (SQLException e) {
            return false;
//            throw new RuntimeException(e);
        }
    }
}
