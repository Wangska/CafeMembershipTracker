/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import user.userdashboard;


/**
 *
 * @author Jean
 */
public class Displaydata extends javax.swing.JFrame {

    /**
     * Creates new form Displaydata
     */
    public Displaydata() {
        initComponents();
        Displaydata();
    }
    
     public void Displaydata(){
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT u_id, u_fname, u_lname, email, u_username, u_type, stat FROM tbl_user");
            USER.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        
        }
        
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        USER = new javax.swing.JTable();
        search = new javax.swing.JLabel();
        searchText = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nnew = new javax.swing.JLabel();
        refresh = new javax.swing.JLabel();
        updateAcc = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(219, 198, 172));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(219, 198, 172));
        jPanel1.setLayout(null);

        USER.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(USER);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 230, 570, 270);

        search.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search.setText("Search");
        search.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        jPanel1.add(search);
        search.setBounds(10, 110, 80, 30);

        searchText.setBackground(new java.awt.Color(219, 198, 172));
        searchText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });
        searchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextKeyReleased(evt);
            }
        });
        jPanel1.add(searchText);
        searchText.setBounds(110, 110, 234, 30);

        jPanel3.setBackground(new java.awt.Color(236, 214, 173));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-cafe-67.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("LIST OF ACCOUNT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(374, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(22, 22, 22))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 690, 70);

        nnew.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nnew.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nnew.setText("New");
        nnew.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nnew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nnewMouseClicked(evt);
            }
        });
        jPanel1.add(nnew);
        nnew.setBounds(100, 171, 90, 30);

        refresh.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        refresh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refresh.setText("Refresh");
        refresh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });
        jPanel1.add(refresh);
        refresh.setBounds(230, 171, 90, 30);

        updateAcc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        updateAcc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateAcc.setText("Update");
        updateAcc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateAccMouseClicked(evt);
            }
        });
        jPanel1.add(updateAcc);
        updateAcc.setBounds(360, 171, 90, 30);

        delete.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete.setText("Delete");
        delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(490, 170, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-back-30.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(620, 70, 30, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed
      
    }//GEN-LAST:event_searchTextActionPerformed

    private void nnewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nnewMouseClicked
         newAcc acc = new newAcc();
        acc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nnewMouseClicked

    private void updateAccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateAccMouseClicked


        int rowindex = USER.getSelectedRow();
        
        if(rowindex < 0){
            JOptionPane.showMessageDialog(null, "Please select an Account");
        }else{
            TableModel model = USER.getModel();
            updateAcc ua = new updateAcc();
            ua.id.setText(""+model.getValueAt(rowindex, 0));
            ua.fn.setText(""+model.getValueAt(rowindex, 1));
            ua.ln.setText(""+model.getValueAt(rowindex, 2));
            ua.email.setText(""+model.getValueAt(rowindex, 3));
            ua.un.setText(""+model.getValueAt(rowindex, 4));
            ua.pos.setSelectedItem(model.getValueAt(rowindex, 5));
            ua.stat.setSelectedItem(model.getValueAt(rowindex, 6));
            ua.setVisible(true);
            
        }
    }//GEN-LAST:event_updateAccMouseClicked

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        Displaydata();
    }//GEN-LAST:event_refreshMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        
        int rowIndex = USER.getSelectedRow();
        if(rowIndex<0){
            JOptionPane.showMessageDialog(null, "Please Select an Account");
        }else{
            TableModel model = USER.getModel();
            Object ide = model.getValueAt(rowIndex, 0);
            Object finame = model.getValueAt(rowIndex, 1);
            Object laname = model.getValueAt(rowIndex, 2);
            
            String id = ide.toString();
            int a = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this account?"+finame+" "+laname);
            if(a == JOptionPane.YES_OPTION){
                dbConnector dbc = new dbConnector();
                int l_id = Integer.parseInt(id);
                dbc.deleteData(l_id, "tbl_user");
                Displaydata();
            }
        }

    }//GEN-LAST:event_deleteMouseClicked

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
       TableModel search = USER.getModel();
        TableRowSorter<TableModel> srch = new TableRowSorter<>(search);
        USER.setRowSorter(srch);
        srch.setRowFilter(RowFilter.regexFilter("(?i)" +searchText.getText()));

    }//GEN-LAST:event_searchMouseClicked

    private void searchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextKeyReleased
        TableModel search = USER.getModel();
        TableRowSorter<TableModel> srch = new TableRowSorter<>(search);
        USER.setRowSorter(srch);
        srch.setRowFilter(RowFilter.regexFilter("(?i)" +searchText.getText()));
    }//GEN-LAST:event_searchTextKeyReleased

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        admindashboard dd = new admindashboard();
        dd.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(Displaydata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Displaydata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Displaydata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Displaydata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Displaydata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable USER;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel nnew;
    private javax.swing.JLabel refresh;
    private javax.swing.JLabel search;
    private javax.swing.JTextField searchText;
    private javax.swing.JLabel updateAcc;
    // End of variables declaration//GEN-END:variables
}