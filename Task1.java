package ClassRoomTasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Task1 {
    public static void main(String[] args) throws SQLException {
        Connection conn=null;
        try{
            String mySqlDriver="com.mysql.cj.jdbc.Driver";
            String mySqlUrl="jdbc:mysql://localhost:3306/advjava";
            String userName="root";
            String password="nikhil1234";
            try{
                Class.forName(mySqlDriver);
                conn= DriverManager.getConnection(mySqlUrl,userName,password);
                System.out.println("Databases Connected Successfully...!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        conn.close();
    }
}
