package ClassRoomTasks;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws SQLException {
        Connection conn=DB.databaseConnection();
        Scanner sc=new Scanner(System.in);
        // Inserting new record into Student........
        insertValues(conn,sc);
        // Closing connection
        conn.close();
    }
    static void insertValues(Connection conn, Scanner sc) throws SQLException {

        String insert = "insert into student1 values(?,?,?,?);";
        PreparedStatement stmt = conn.prepareStatement(insert);

        System.out.println("Enter your id:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter name:");
        String name = sc.next();

        System.out.println("Enter Age:");
        int age = sc.nextInt();
        sc.nextLine();


        System.out.println("Enter Marks:");
        int marks = sc.nextInt();
        sc.nextLine();



        stmt.setInt(1, id);
        stmt.setString(2, name);
        stmt.setDouble(3, age);
        stmt.setInt(4, marks);

        int i = stmt.executeUpdate();
        if (i >0) {
            System.out.println("Value inserted  succesfully.....!");
        } else {
            System.out.println("Some error in storing values in TABLE");
        }


    }

}
