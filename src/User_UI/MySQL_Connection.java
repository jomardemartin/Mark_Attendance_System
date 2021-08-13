package User_UI;

import Login_Registration.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author John Mark
 */
public class MySQL_Connection {
        public static Connection getConnection(){
        
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_att_system", "root","root");
        }
        catch(Exception ex){  
        }
        return conn;
    }
    
}
