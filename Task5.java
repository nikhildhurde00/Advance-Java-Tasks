package ClassRoomTasks;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) throws SQLException {
        Connection conn=DB.databaseConnection();
        Scanner sc=new Scanner(System.in);
        deleteValues(conn,sc);
    }
    static void deleteValues(Connection conn, Scanner sc) throws SQLException {
        String delete = "delete from student1 where id=?";
        PreparedStatement stmt1 = conn.prepareStatement(delete);

        System.out.println("Enter student ID delete its Record:");
        int id=sc.nextInt();
        sc.nextLine();

        stmt1.setInt(1,id);

        int i = stmt1.executeUpdate();
        if (i >0)
            System.out.println("Information deleted succesfully...!");
        else
            System.out.println("Something wrong in deleting information...");

        System.out.println("\n");
    }
}
