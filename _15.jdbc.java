import java.sql.*;
 
public class GFG {
    public static void main(String[] args)
    {
        Connection con = null;
        PreparedStatement p = null;
        ResultSet rs = null;
 
        con = connection.connectDB();
 
        // Try block to catch exception/s
        try {
            String sql = "select * from cuslogin";
            p = con.prepareStatement(sql);
            rs = p.executeQuery();
            System.out.println("id\t\tname\t\temail");
            while (rs.next()) {
 
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.println(id + "\t\t" + name
                                   + "\t\t" + email);
            }
        }
        catch (SQLException e) {
            System.out.println(e);
        }
    }
}
