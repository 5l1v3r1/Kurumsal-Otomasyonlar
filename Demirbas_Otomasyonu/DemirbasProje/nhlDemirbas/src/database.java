
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;
public class database {
  
   public static Connection ConnecrDb(){
      try{
          
          
          Class.forName("com.mysql.jdbc.Driver");
            
          
          String url = "jdbc:mysql://localhost:3306/demirbas";
          
          
            String kullaniciad = "root";
            
           
            String sifre = "nihal123";
            
            
            Connection con = null; 
            
            
            con = DriverManager.getConnection(url, kullaniciad, sifre);
            
            
         return con;
         }
      
      catch(ClassNotFoundException | SQLException e){
         JOptionPane.showMessageDialog(null, e);
         return null;
         }
}
}
