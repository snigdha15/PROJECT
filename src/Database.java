import java.awt.HeadlessException;
import java.sql.*;
public class Database 
{
    static Connection ConnectDB()
    {      
        try
        {

         Class.forName("com.mysql.jdbc.Driver");
         //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines" ,"root","");
         Connection con=DriverManager.getConnection("jdbc:mysql://sql12.freesqldatabase.com/sql12205181" ,"sql12205181","kWhZiP3PEh");
       
        return con;
        
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
            return null;
        }
        
    }
}
