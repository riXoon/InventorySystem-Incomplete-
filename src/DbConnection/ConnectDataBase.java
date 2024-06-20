/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Erickson Guhilde
 */
public class ConnectDataBase {
    
    public static Connection connect() throws SQLException{
        
        
        Connection con=null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/inventory_system","root","");
            
        }catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        return con;
    }

    
}
