/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import static cafemembership.regForm.hashPass;
import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import user.userProfileInfo;

/**
 *
 * @author Jean
 */
public class newAcc extends javax.swing.JFrame {

    /**
     * Creates new form newAcc
     */
    public newAcc() {
        initComponents();
    }
  



public static String eml, usname;

public boolean duplicateCheck(){
   
    dbConnector dbc = new dbConnector();
    try{
            String query = "SELECT * FROM tbl_user  WHERE u_username = '" + un.getText() + "' OR email = '" + em.getText() + "'";
            ResultSet resultSet = dbc.getData(query);
           
            if(resultSet.next()){                
              eml = resultSet.getString("email");      
              if(eml.equals(em.getText())){
               JOptionPane.showMessageDialog(null, "Email is Already Used!");
               em.setText("");
              }
              usname = resultSet.getString("u_username");
              if(usname.equals(un.getText())){
               JOptionPane.showMessageDialog(null, "Username is Already Used!");
               un.setText("");
              }
              return true;
            }else{
                return false;
            }
         
        }catch(SQLException ex) {
            System.out.println("" +ex);
            return false;
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        un = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        ps = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        ut = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(219, 198, 172));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Create an Account");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel2.setText("First Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel3.setText("Last Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel4.setText("Email:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel5.setText("Username:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel6.setText("Password:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 215, 33));
        jPanel1.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 215, 33));
        jPanel1.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 215, 33));
        jPanel1.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 215, 33));
        jPanel1.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 220, 30));

        jLabel7.setText("Position:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 60, -1));

        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Cashier" }));
        jPanel1.add(ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 342, 220, 30));

        jButton1.setText("Save");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 70, 30));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cancel");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    String pass = hashPass(ps.getText());
    if(fn.getText().isEmpty()|| ln.getText().isEmpty()||  em.getText().isEmpty()|| un.getText().isEmpty()
             ||ps.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "All fields are required!");
    }else if(ps.getText().length()<8){
        JOptionPane.showMessageDialog(null, "Password character should be 8 above!");
        ps.setText("");
    }else if(duplicateCheck()){
        System.out.println("Duplicate Exist");
    }else{
        dbConnector dbc = new dbConnector();
           
            if(dbc.insertData("INSERT INTO tbl_user (u_fname, u_lname, email, u_username, u_pass, u_type, stat) VALUES "
                    + "('"+fn.getText()+"',"
                    + " '"+ln.getText()+"',"
                    + " '"+em.getText()+"',"
                    + " '"+un.getText()+"',"
                    + " '"+pass+"', '"+ut.getSelectedItem()+"', 'Pending')")){                                        
                JOptionPane.showMessageDialog(null, "Registration Success!");
                Displaydata acc = new Displaydata();
                acc.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Connection Error!");
            }
    }   

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        Displaydata dd= new Displaydata();
        dd.setVisible(true);
        this.dispose();       
      
    }//GEN-LAST:event_jLabel8MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(newAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newAcc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField em;
    private javax.swing.JTextField fn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField ln;
    private javax.swing.JPasswordField ps;
    private javax.swing.JTextField un;
    private javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
