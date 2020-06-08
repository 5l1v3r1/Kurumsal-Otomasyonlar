package jtable.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;


public class DBUpdater {

    String conString = "jdbc:mysql://MYSQL5017.Smarterasp.net:3306/db_9fdd64_ramazan";
    String username = "9fdd64_ramazan";
    String password = "15591100rmz";

    //INSERT INTO DB
    public Boolean add(String name, String pos, String team) {
        //SQL STATEMENT
        String sql = "INSERT INTO siparis(Siparisler,Masa_No,Tutar,Musteri_Notu,Durum) VALUES('" + name + "','" + pos + "','" + team + "','','Hazirlaniyor...')";
        
        try {
            //GET COONECTION
            Connection con = DriverManager.getConnection(conString, username, password);

            // PREPARED STMT
            Statement s = con.prepareStatement(sql);

            s.execute(sql);

            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    //RETRIEVE DATA
    public DefaultTableModel getData() {
        //ADD COLUMNS TO TABLE MODEL
       
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("Sipariş No");
        dm.addColumn("Siparisler");
        dm.addColumn("Masa No");
        dm.addColumn("Tutar");
        dm.addColumn("Müşteri Notu");
        dm.addColumn("Sipariş Durumu");

       
        
        //SQL STATEMENT
        String sql = "SELECT * FROM siparis";

        try {
            Connection con = DriverManager.getConnection(conString, username, password);

            //PREPARED STMT
            Statement s = con.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
               
            //LOOP THRU GETTING ALL VALUES
            while (rs.next()) {
                //GET VALUES
                String id = rs.getString(1);
                String name = rs.getString(2);
                String pos = rs.getString(3);
                String team = rs.getString(4);
                String team2 = rs.getString(5);
                String team3 = rs.getString(6);
                
                
                

                dm.addRow(new String[]{id, name, pos, team, team2, team3});
            }

            return dm;

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;

    }

    //UPDATE DATA
    public Boolean update(String id, String name, String pos, String team) {
        //SQL STMT
        String sql = "UPDATE siparis SET Siparisler ='" + name + "',Masa_No='" + pos + "',Tutar='" + team + "' WHERE id='" + id + "'";

        try {
            //GET COONECTION
            Connection con = DriverManager.getConnection(conString, username, password);

            //STATEMENT
            Statement s = con.prepareStatement(sql);

            //EXECUTE
            s.execute(sql);

            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    //UPDATE2 DATA
    public Boolean update2(String degis, String id) {
        //SQL STMT
        String sql = "UPDATE siparis SET Durum ='" + degis + "' WHERE id='" + id + "'";

        try {
            //GET COONECTION
            Connection con = DriverManager.getConnection(conString, username, password);

            //STATEMENT
            Statement s = con.prepareStatement(sql);

            //EXECUTE
            s.execute(sql);

            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    //DELETE DATA
    public Boolean delete(String id)
    {
        //SQL STMT
        String sql="DELETE FROM siparis WHERE id ='"+id+"'";
        
        
        try
        {
            //GET COONECTION
            Connection con=DriverManager.getConnection(conString, username, password);
            
            //STATEMENT
            Statement s=con.prepareStatement(sql);
            
            //EXECUTE
            s.execute(sql);
            
            return true;
            
        }catch(Exception ex)
        {
            ex.printStackTrace();
            return false;
        }
    }

}
