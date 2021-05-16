import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testDB {
    private static String url = "jdbc:postgresql://localhost:5432/StudentDB";
    private static String user = "postgres";
    private static String password = "zxcvbnmA8";
    Connection getConnection(){
        Connection cnt = null;
        try {
            cnt = DriverManager.getConnection(url, user, password);
            System.out.println("Connected");

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return cnt;
    }
    public static void main(String[] args){
        testDB test = new testDB();
        test.getConnection();
    }
}
