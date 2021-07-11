/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author LoiDinh
 */
public class DatabaseHelper {
    public static Connection openConnection() throws Exception
    {
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         String connectionURL="jdbc:sqlserver://localhost:1433;databaseName=ProjectJava1;";
         String username="sa";
         String password="123456";
         Connection con= DriverManager.getConnection(connectionURL, username, password);
         return con;
    }
}
