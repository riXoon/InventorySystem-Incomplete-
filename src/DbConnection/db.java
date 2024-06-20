
package LogIn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
    
    public static Connection mycon() throws SQLException{
        
        Connection con = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/inventory_system","root","");
            
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        
        return con;
    }
    
}
