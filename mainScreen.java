package proje;
import java.awt.Container;
import java.sql.*;
import javax.swing.*;
public class mainScreen extends javax.swing.JFrame {

   
    
   
    
    Connection connection = null;
    
    public mainScreen() {
        initComponents();
        connection=databasee.dbConnector();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchButton = new javax.swing.JButton();
        eklemebutonu = new javax.swing.JButton();
        exitbutonu = new javax.swing.JButton();
        tableButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchButton.setText("SEARCH");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        eklemebutonu.setText("ADD");
        eklemebutonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eklemebutonuMouseClicked(evt);
            }
        });
        eklemebutonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eklemebutonuActionPerformed(evt);
            }
        });

        exitbutonu.setText("EXIT");
        exitbutonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitbutonuMouseClicked(evt);
            }
        });

        tableButton.setText("CREATE TABLE");
        tableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("IMPORTANT :  IF YOU ARE RUNNING FOR THE FIRST TIME , YOU NEED TO CREATE TABLE FIRST OF ALL !!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(eklemebutonu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(tableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(exitbutonu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eklemebutonu)
                    .addComponent(searchButton)
                    .addComponent(exitbutonu)
                    .addComponent(tableButton))
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eklemebutonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eklemebutonuActionPerformed

        eklemeEkrani ek = new eklemeEkrani();
        ek.setVisible(true);
    }//GEN-LAST:event_eklemebutonuActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        aramaEkrani ar = new aramaEkrani();
        ar.setVisible(true);
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void exitbutonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbutonuMouseClicked
        System.exit(1);
    }//GEN-LAST:event_exitbutonuMouseClicked

    private void eklemebutonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eklemebutonuMouseClicked

  
    }//GEN-LAST:event_eklemebutonuMouseClicked

    private void tableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableButtonActionPerformed

        tableScreen table = new tableScreen();
        table.setVisible(true);
    }//GEN-LAST:event_tableButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JButton eklemebutonu;
    private javax.swing.JButton exitbutonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton searchButton;
    protected static javax.swing.JButton tableButton;
    // End of variables declaration//GEN-END:variables
}
