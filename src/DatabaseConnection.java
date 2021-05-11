import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static String url = "jdbc:postgresql://localhost:5432/testDatabase";
    private static String user = "postgres";
    private static String password = "zxcvbnmA8";
    static Connection getConnection(){
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
