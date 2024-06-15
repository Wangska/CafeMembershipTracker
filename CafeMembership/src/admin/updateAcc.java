/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnector;
import config.session;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import user.userdashboard;

/**
 *
 * @author Jean
 */
public class updateAcc extends javax.swing.JFrame {

    /**
     * Creates new form updateAcc
     */
    public updateAcc() {
        initComponents();
    }

    public static boolean checkEmail(String email, int ID){
        dbConnector dbc = new dbConnector();
        try{
            String sql = "SELECT * FROM tbl_user WHERE email = '"+email+"' AND u_id != '"+ID+"'";
            ResultSet rst = dbc.getData(sql);
            return rst.next();

        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    public static boolean checkUserName(String username, int ID){
        dbConnector dbc = new dbConnector();
        try{
            String sql = "SELECT * FROM tbl_user WHERE user_username = '"+username+"' AND u_id != '"+ID+"'";
            ResultSet rst = dbc.getData(sql);
            return rst.next();

        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    public void getdata(int id){
          dbConnector dbc = new dbConnector();

          try{
              String sql = "SELECT * FROM tbl_user WHERE u_id = '"+id+"'";
                ResultSet rs = dbc.getData(sql);
             if(rs.next()){
                session ss = session.getInstance();
                ss.setId(rs.getInt("u_id"));
                ss.setFname(rs.getString("u_fname"));
                ss.setLname(rs.getString("u_lname"));
                ss.setEmail(rs.getString("email"));
                ss.setUsername(rs.getString("u_username"));
                ss.setPosition(rs.getString("u_type"));
                ss.setStatus(rs.getString("stat"));
             }

          }catch(SQLException ex){
              System.out.println("Inavalid Connection"+ex.getMessage());
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
        id = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        un = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        stat = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pos = new javax.swing.JComboBox<>();
        fn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(219, 198, 172));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Update Account");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 30, 190, 28);

        jLabel2.setText("First Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 150, 55, 14);

        jLabel3.setText("Last Name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 200, 54, 14);

        jLabel4.setText("Email:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 250, 28, 14);

        jLabel5.setText("Username:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 300, 52, 14);

        id.setEditable(false);
        jPanel1.add(id);
        id.setBounds(130, 90, 215, 33);
        jPanel1.add(ln);
        ln.setBounds(130, 190, 215, 33);
        jPanel1.add(un);
        un.setBounds(130, 290, 215, 33);
        jPanel1.add(email);
        email.setBounds(130, 240, 215, 33);

        jLabel7.setText("Position:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 360, 60, 14);

        stat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "pending" }));
        jPanel1.add(stat);
        stat.setBounds(130, 400, 220, 30);

        jLabel9.setText("ID:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 100, 41, 14);

        jLabel10.setText("Status:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 410, 52, 14);

        pos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Cashier" }));
        jPanel1.add(pos);
        pos.setBounds(130, 350, 220, 30);
        jPanel1.add(fn);
        fn.setBounds(130, 140, 215, 33);

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Update");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 450, 100, 30);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cancel");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(240, 450, 100, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

        dbConnector dbc = new dbConnector();

        try{
            if (checkEmail(email.getText(),Integer.valueOf(id.getText()))){
                JOptionPane.showMessageDialog(null, "Email Already existed");
                return;
            }
            if (checkUserName(un.getText(),Integer.valueOf(id.getText()))){
                JOptionPane.showMessageDialog(null, "Username Already existed");
                return;
            }
            if(dbc.insertData("UPDATE tbl_user SET u_fname = '" + ln.getText() + "', "
                + "u_lname = '" + ln.getText() + "', "
                + "email = '" + email.getText() + "', "
                + "u_username = '" + un.getText() + "',"
                + "u_type = '" + pos.getSelectedItem() + "',"
                + "stat = '" + stat.getSelectedItem() + "' "
                + "WHERE u_id = '" +Integer.valueOf(id.getText())+"'")){
            JOptionPane.showMessageDialog(null, "Changes Saved!");
            Displaydata dd = new Displaydata();
            dd.setVisible(true);
            this.dispose();
            getdata(Integer.valueOf(id.getText()));
        }
        }catch(Exception ex){
            System.out.println(""+ex);

        }

    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(updateAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateAcc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField email;
    public javax.swing.JTextField fn;
    public javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField ln;
    public javax.swing.JComboBox<String> pos;
    public javax.swing.JComboBox<String> stat;
    public javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
}
