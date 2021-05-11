import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class test {
    private static List<String> listOfFirstName;
    private static void getAllFirstName(){
        Connection cnt = null;
        PreparedStatement stm = null;
        ResultSet res = null;

        try {
            String sql = "select first_name from actor;";
            cnt = DatabaseConnection.getConnection();
            stm = cnt.prepareStatement(sql);
            res = stm.executeQuery();
            while(res.next()){
                listOfFirstName.add(res.getString("first_name"));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        } finally {
            try{
                if(cnt != null)
                    cnt.close();
                if(stm != null)
                    cnt.close();
                if(res != null)
                    cnt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        listOfFirstName = new ArrayList<>();
        getAllFirstName();
        for(String firstname: listOfFirstName){
            System.out.println(firstname);
        }
    }
}
