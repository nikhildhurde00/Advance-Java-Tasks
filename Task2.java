package ClassRoomTasks;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws SQLException {
        Connection conn=DB.databaseConnection();

        // View Student Information........
        viewAllInfo(conn);
        // Closing connection
        conn.close();
    }
      static void viewAllInfo(Connection conn) throws SQLException {
        String select = "select * from student1;";
        PreparedStatement stmt1 = conn.prepareStatement(select);
        ResultSet rs = stmt1.executeQuery();
        while(rs.next()){
            System.out.println("Student ID:"+rs.getInt(1)+"\tStudent Name:"+rs.getString(2)+"\tStudent AGE:"+rs.getInt(3)+"\tStudent Marks:"+rs.getInt(4));
        }
    }
}
