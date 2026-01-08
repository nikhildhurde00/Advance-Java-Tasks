package ClassRoomTasks;
import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    static Connection databaseConnection(){
        Connection conn=null;
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
        return conn;
    }
}
