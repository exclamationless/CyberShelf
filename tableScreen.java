package proje;

import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javax.swing.*;
import net.proteanit.sql.*;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

public class tableScreen extends javax.swing.JFrame {

    Connection connection = null;

    public tableScreen() {
        initComponents();
        connection=databasee.dbConnector();
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JTextField();
        a2 = new javax.swing.JTextField();
        a3 = new javax.swing.JTextField();
        a4 = new javax.swing.JTextField();
        a5 = new javax.swing.JTextField();
        a6 = new javax.swing.JTextField();
        a7 = new javax.swing.JTextField();
        a8 = new javax.swing.JTextField();
        a9 = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        c1 = new javax.swing.JComboBox<>();
        c2 = new javax.swing.JComboBox<>();
        c3 = new javax.swing.JComboBox<>();
        c4 = new javax.swing.JComboBox<>();
        c5 = new javax.swing.JComboBox<>();
        c6 = new javax.swing.JComboBox<>();
        c7 = new javax.swing.JComboBox<>();
        c8 = new javax.swing.JComboBox<>();
        c9 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        name.setText("TABLE NAME");

        a2.setText("a2");

        a3.setText("a3");

        a4.setText("a4");
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });

        a5.setText("a5");
        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });

        a6.setText("a6");
        a6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a6ActionPerformed(evt);
            }
        });

        a7.setText("a7");

        a8.setText("a8");
        a8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a8ActionPerformed(evt);
            }
        });

        a9.setText("a9");

        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TEXT"}));

        c2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TEXT","INTEGER","REAL" }));

        c3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TEXT","INTEGER","REAL" }));

        c4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TEXT","INTEGER","REAL" }));

        c5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TEXT","INTEGER","REAL" }));

        c6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TEXT","INTEGER","REAL" }));

        c7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TEXT","INTEGER","REAL" }));

        c8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TEXT","INTEGER","REAL" }));

        c9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TEXT","INTEGER","REAL" }));

        jLabel1.setText("NAME(Your Item must have name!)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(name)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(a9)
                                .addComponent(a8, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(a7)
                                .addComponent(a6)
                                .addComponent(a5)
                                .addComponent(a4)
                                .addComponent(a3)
                                .addComponent(a2))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c1, 0, 107, Short.MAX_VALUE)
                            .addComponent(c2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c4, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(saveButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a8ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a4ActionPerformed

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a5ActionPerformed

    private void a6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a6ActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        
        
        
        
        String tablename = name.getText();
        if(name.getText().isEmpty()==true){
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("You didn't give name to TABLE");
            alert.showAndWait();
        }
        
        if(a2.getText().isEmpty()==true){
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("You didn't give name to ATTRIBUTE-2");
            alert.showAndWait();
        }
        if(a3.getText().isEmpty()==true){
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("You didn't give name to ATTRIBUTE-3");
            alert.showAndWait();
        }
        if(a4.getText().isEmpty()==true){
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("You didn't give name to ATTRIBUTE-4");
            alert.showAndWait();
        }
        
        if(a5.getText().isEmpty()==true){
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("You didn't give name to ATTRIBUTE-5");
            alert.showAndWait();
        }
        if(a6.getText().isEmpty()==true){
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("You didn't give name to ATTRIBUTE-6");
            alert.showAndWait();
        }
        if(a7.getText().isEmpty()==true){
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("You didn't give name to ATTRIBUTE-7");
            alert.showAndWait();
        }
        if(a8.getText().isEmpty()==true){
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("You didn't give name to ATTRIBUTE-8");
            alert.showAndWait();
        }
        if(a9.getText().isEmpty()==true){
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("You didn't give name to ATTRIBUTE-9");
            alert.showAndWait();
        }
        String ac2 = a2.getText();
        String ac3 = a3.getText();
        String ac4 = a4.getText();
        String ac5 = a5.getText();
        String ac6 = a6.getText();
        String ac7 = a7.getText();
        String ac8 = a8.getText();
        String ac9 = a9.getText();
       
        String t1 = c1.getSelectedItem().toString();
        String t2 = c2.getSelectedItem().toString();
        String t3 = c3.getSelectedItem().toString();
        String t4 = c4.getSelectedItem().toString();
        String t5 = c5.getSelectedItem().toString();
        String t6 = c6.getSelectedItem().toString();
        String t7 = c7.getSelectedItem().toString();
        String t8 = c8.getSelectedItem().toString();
        String t9 = c9.getSelectedItem().toString();
        
        String sql = "CREATE TABLE " + tablename + "(\n"
                +"Name"+" " +t1 + "PRIMARY KEY NOT NULL ,\n"
                +ac2 +" " +t2 + ",\n"
                +ac3 +" " +t3 + ",\n"
                +ac4 +" " +t4 + ",\n"
                +ac5 +" " +t5 + ",\n"
                +ac6 +" " +t6 + ",\n"
                +ac7 +" " +t7 + ",\n"
                +ac8 +" " +t8 + ",\n"
                +ac9 +" " +t9 + "\n"
                +");";
        try(Statement stmnt = connection.createStatement()  ){
            stmnt.execute(sql);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        
        
        
        tna=tablename;
        type2=t2;
        type3=t3;
        type4=t4;
        type5=t5;
        type6=t6;
        type7=t7;
        type8=t8;
        type9=t9;
        
        ype2=ac2;
        ype3=ac3;
        ype4=ac4;
        ype5=ac5;
        ype6=ac6;
        ype7=ac7;
        ype8=ac8;
        ype9=ac9;
        
        
        
        
        
        
        
        
        
        
        
                
                
                
           
    }//GEN-LAST:event_saveButtonActionPerformed
    

    static String tna;
    static String type2;
    static String type3;
    static String type4;
    static String type5;
    static String type6;
    static String type7;
    static String type8;
    static String type9;
    
    
    
    static String ype2;
    static String ype3;
    static String ype4;
    static String ype5;
    static String ype6;
    static String ype7;
    static String ype8;
    static String ype9;
    
    
    
    
    
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a2;
    private javax.swing.JTextField a3;
    private javax.swing.JTextField a4;
    private javax.swing.JTextField a5;
    private javax.swing.JTextField a6;
    private javax.swing.JTextField a7;
    private javax.swing.JTextField a8;
    private javax.swing.JTextField a9;
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JComboBox<String> c2;
    private javax.swing.JComboBox<String> c3;
    private javax.swing.JComboBox<String> c4;
    private javax.swing.JComboBox<String> c5;
    private javax.swing.JComboBox<String> c6;
    private javax.swing.JComboBox<String> c7;
    private javax.swing.JComboBox<String> c8;
    private javax.swing.JComboBox<String> c9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField name;
    protected javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
