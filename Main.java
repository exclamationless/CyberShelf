package proje;
import java.sql.*;
import javax.swing.*;

public class Main {
    
    Connection connection = null;
    
    public Main(){
            connection=databasee.dbConnector();
    }
    public static void main(String[]args){
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainScreen().setVisible(true);
               
            }
        });
        }
            
}
