package project;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class Connectionprovider {
    public static Connection getCon() 
    {
        Connection con;
        con = null;
        try{
            String user = "root";
            String pass ="Nirmal@99526";
            String url ="jdbc:mysql://localhost:3306/cpi";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
//            if(con != null)
//                System.out.print("Success");
//            else
//                System.out.print("fail");
        }  
        
        
        catch (SQLException  ex) {
            Logger.getLogger(Connectionprovider.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connectionprovider.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
        
    }
    public static void main (String args[])
    {
        getCon();
    }
    
}
