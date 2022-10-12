/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hawba
 */
public class MyConnection {
    
    
     Connection conn=null;
    
    public   Connection  connectionDB(){
        
        try{
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            String URL="jdbc:oracle:thin:@localhost:1521:XE";
            
            conn=DriverManager.getConnection(URL, "hawbash", "12345");
      
        }catch(ClassNotFoundException e){
            
            System.out.println("Error in Connection class"+e);
            
        }catch(SQLException ee){
            
                        System.out.println("Error in  URL"+ee);
        }
        
        return conn;
    }
    
}
