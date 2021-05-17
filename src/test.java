import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class test {
    private static List<String> listOfFirstName;
    private static List<String> names;
    private static void testInsert(){
        Connection cnt = null;
        Statement stm = null;
        ResultSet res = null;

        try {
            //String sql = "select first_name from actor;";
            String sql = "insert into \"STUDENT\" " + "values ('19120484', 'Thới Hải Đức', '19CTT3', 23)";
            cnt = DatabaseConnection.getConnection();
            stm = cnt.createStatement();
            stm.executeUpdate(sql);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        } finally {
            try{
                if(cnt != null)
                    cnt.close();
                if(stm != null)
                    stm.close();
                if(res != null)
                    res.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    private static void getData() throws SQLException {
        Connection cnt = null;
        Statement stm = null;
        ResultSet res = null;
        try{
            cnt = DatabaseConnection.getConnection();
            String sql = "select * from \"STUDENT\" ";
            stm = cnt.createStatement();
            res = stm.executeQuery(sql);
            while(res.next()){
                //System.out.println(res.getString("student_name"));
                names.add(res.getString("student_name"));
                //System.out.println(res.getString("student_id"));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(cnt != null){
                cnt.close();
            }
        }
    }

    public static void main(String[] args) throws java.lang.NullPointerException, SQLException {
        names = new ArrayList<>();
        getData();

        //testInsert();
        for(String name: names){
            System.out.println(name);
        }
    }
}
