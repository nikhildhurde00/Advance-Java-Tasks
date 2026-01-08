package ClassRoomTasks;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) throws SQLException {

        Connection conn=DB.databaseConnection();
        Scanner sc=new Scanner(System.in);
        updateValues(conn,sc);
    }

    static void updateValues(Connection conn , Scanner sc) throws SQLException {
        String update = "Update student1 set marks=? where id=?";
        PreparedStatement stmt1 = conn.prepareStatement(update);

        System.out.println("Enter student id;");
        int id=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter new Marks:");
        int marks=sc.nextInt();
        sc.nextLine();

        stmt1.setInt(1,marks);
        stmt1.setInt(2,id);
        int i = stmt1.executeUpdate();
        if (i > 0)
            System.out.println("Marks updated succesfully...!");
        else
            System.out.println("Something error in Updating the Marks...!");

    }

}
