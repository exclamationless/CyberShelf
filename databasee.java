package proje;
import java.sql.*;
import javax.swing.*;

public class databasee {
    Connection conn=null;
    public static Connection dbConnector()
        {
            try{
                Class.forName("org.sqlite.JDBC");
                Connection conn = DriverManager.getConnection("jdbc:sqlite:Cybershelf.db");
                return conn;
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
                return null;
            }
        }
}
