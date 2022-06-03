/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import com.mycompany.banka.Baglanti;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author malia
 */
public class ConnectionProvider {
    
    public static Connection baglan(){
        try 
        {            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=banka","ktp","ktp");
            return con;
        } 
        catch (Exception  ex) {
            return null;
        }
           
    }
}

