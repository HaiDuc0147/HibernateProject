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
            String sql = "insert into \"SINHVIEN\" " + "values ('19120483', 'Thoi Hai Duc', '19CTT3', '23')";
            cnt = DatabaseConnection.getConnection();
            stm = cnt.createStatement();
            stm.executeUpdate(sql);
            /*while(res.next()){
                listOfFirstName.add(res.getString("first_name"));
            }*/
            //System.out.println(res);
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
            String sql = "select * from \"SINHVIEN\" ";
            stm = cnt.createStatement();
            res = stm.executeQuery(sql);
            while(res.next()){
                names.add(res.getString("TenSinhVien"));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(cnt != null){
                cnt.close();
            }
        }
    }

    public static void main(String[] args) throws java.lang.NullPointerException{
        //listOfFirstName = new ArrayList<>();
        //getAllFirstName();

        try {
            names = new ArrayList<>();

            getData();
            for(String name: names)
                System.out.println(name);
        }catch(SQLException e){
            e.printStackTrace();
        }
        /*for(String firstname: listOfFirstName){
            System.out.println(firstname);
        }*/
    }
}
