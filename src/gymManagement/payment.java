
package gymManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Michael
 */
public class payment extends javax.swing.JFrame {

    
    Connection cn;
    PreparedStatement pst,pst1;
    ResultSet rs,rs1;
    Statement st;
    
   public void tableDetails()
    {
        DefaultTableModel dtm=(DefaultTableModel)tablepayment.getModel();
        dtm.setRowCount(0);
        String id=txtmemberid.getText();
        try
        {
            cn= DriverManager.getConnection("jdbc:mysql://localhost/members","root",null);
            pst=cn.prepareStatement("select * from payment where MemberID='"+id+"'");
            rs=pst.executeQuery();
            
            while(rs.next())
            {
                dtm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
            
            }
        
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public payment() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mainpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnclose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablepayment = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        txtmemberid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtlname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtmnumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtamount = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        sidepanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        menupanel = new javax.swing.JPanel();
        btnnewMember = new javax.swing.JButton();
        btnupdateDelete = new javax.swing.JButton();
        btnlist = new javax.swing.JButton();
        btnpayment = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainpanel.setBackground(new java.awt.Color(87, 89, 112));
        mainpanel.setPreferredSize(new java.awt.Dimension(900, 600));
        mainpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gymImages/Admin profile.png"))); // NOI18N
        jLabel1.setText("ADMIN");
        mainpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, -1, -1));
        mainpanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 392, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Payment");
        mainpanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 80, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gymImages/icons8-salary-male-64.png"))); // NOI18N
        mainpanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mainpanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnclose.setBackground(new java.awt.Color(64, 66, 88));
        btnclose.setForeground(new java.awt.Color(255, 255, 255));
        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gymImages/close.png"))); // NOI18N
        btnclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncloseMouseClicked(evt);
            }
        });
        mainpanel.add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, -1, -1));

        tablepayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Member ID", "First Name", "Last Name", "Date", "Amount to pay"
            }
        ));
        jScrollPane1.setViewportView(tablepayment);

        mainpanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 740, 170));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Member ID");
        mainpanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));
        mainpanel.add(txtmemberid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 70, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name");
        mainpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));
        mainpanel.add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 150, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name ");
        mainpanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));
        mainpanel.add(txtlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 160, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mobile Number");
        mainpanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));
        mainpanel.add(txtmnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 160, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email");
        mainpanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));
        mainpanel.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 170, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Amount To Pay");
        mainpanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));
        mainpanel.add(txtamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 140, -1));

        btnsave.setBackground(new java.awt.Color(43, 43, 57));
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gymImages/Save.png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsaveMouseClicked(evt);
            }
        });
        mainpanel.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        btnReset.setBackground(new java.awt.Color(43, 43, 57));
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gymImages/reset.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        mainpanel.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        btnsearch.setBackground(new java.awt.Color(43, 43, 57));
        btnsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gymImages/search.png"))); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        mainpanel.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 90, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date");
        mainpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, -1));

        txtdate.setText("mm/dd/yy");
        mainpanel.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 90, -1));

        jPanel1.add(mainpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 920, 690));

        sidepanel.setBackground(new java.awt.Color(43, 43, 57));
        sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gymImages/gym logo 2.png"))); // NOI18N
        jLabel3.setText("GYM PARADISE");
        sidepanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 32, -1, -1));

        menupanel.setBackground(new java.awt.Color(43, 43, 59));

        btnnewMember.setBackground(new java.awt.Color(64, 66, 88));
        btnnewMember.setForeground(new java.awt.Color(255, 255, 255));
        btnnewMember.setText("New Member");
        btnnewMember.setBorderPainted(false);
        btnnewMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnewMemberMouseClicked(evt);
            }
        });

        btnupdateDelete.setBackground(new java.awt.Color(64, 66, 88));
        btnupdateDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnupdateDelete.setText("Update & Delete Member");
        btnupdateDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnupdateDeleteMouseClicked(evt);
            }
        });

        btnlist.setBackground(new java.awt.Color(64, 66, 88));
        btnlist.setForeground(new java.awt.Color(255, 255, 255));
        btnlist.setText("List of Members");
        btnlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlistMouseClicked(evt);
            }
        });

        btnpayment.setBackground(new java.awt.Color(255, 123, 0));
        btnpayment.setForeground(new java.awt.Color(255, 255, 255));
        btnpayment.setText("Payment ");
        btnpayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpaymentMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menupanelLayout = new javax.swing.GroupLayout(menupanel);
        menupanel.setLayout(menupanelLayout);
        menupanelLayout.setHorizontalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnnewMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnupdateDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnlist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnpayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menupanelLayout.setVerticalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnnewMember, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnupdateDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnlist, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnpayment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        sidepanel.add(menupanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        btnlogout.setBackground(new java.awt.Color(64, 66, 88));
        btnlogout.setForeground(new java.awt.Color(255, 255, 255));
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gymImages/log out 2.png"))); // NOI18N
        btnlogout.setText("Log out");
        btnlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlogoutMouseClicked(evt);
            }
        });
        sidepanel.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, -1, -1));

        jPanel1.add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btncloseMouseClicked

    private void btnlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseClicked
        // TODO add your handling code here:
        int a =JOptionPane.showConfirmDialog(null,"Do you really want to log out","select",JOptionPane.YES_NO_CANCEL_OPTION);

        if(a==0)
        {
            setVisible(false);
            new Login().setVisible(true);

        }
    }//GEN-LAST:event_btnlogoutMouseClicked

    private void btnnewMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnewMemberMouseClicked
        
        new payment().setVisible(false);
        new newMember().setVisible(true);
        
    }//GEN-LAST:event_btnnewMemberMouseClicked

    private void btnupdateDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupdateDeleteMouseClicked
        
        new payment().setVisible(false);
        new updateDelete().setVisible(true);
        
    }//GEN-LAST:event_btnupdateDeleteMouseClicked

    private void btnlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlistMouseClicked
        
        new payment().setVisible(false);
        new listMember().setVisible(true);
        
    }//GEN-LAST:event_btnlistMouseClicked

    private void btnpaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpaymentMouseClicked
        
        new payment().setVisible(true);
        
    }//GEN-LAST:event_btnpaymentMouseClicked

    private void btnsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMouseClicked
        // TODO add your handling code here:
        insertrecord();
    }//GEN-LAST:event_btnsaveMouseClicked

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        tableDetails();
        int checkid=0;
        
        

        try {
            cn= DriverManager.getConnection("jdbc:mysql://localhost/members","root",null);
            //st=cn.prepareStatement("select * from membersinfo where MemberID='"+txtmemberid+"'");
            st=cn.createStatement();
            rs1=st.executeQuery("select * from membersinfo where MemberID='"+txtmemberid.getText()+"'");

            while(rs1.next())
            {
                checkid=1;
                txtmemberid.setEditable(false);
                txtfname.setText(rs1.getString(2));
                txtlname.setText(rs1.getString(3));
                txtmnumber.setText(rs1.getString(4));
                txtemail.setText(rs1.getString(6));
                txtamount.setText(rs1.getString(9));

            }

            if(checkid==0)
            {
                JOptionPane.showMessageDialog(null,"Member ID does not Exist");

            }
            while(rs1.next())
            {
                btnsave.setVisible(false);
                JOptionPane.showMessageDialog(null, "Amount Payed for this month");
            }

        }

        catch(Exception  e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new payment().setVisible(true);
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnlist;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnnewMember;
    private javax.swing.JButton btnpayment;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdateDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JPanel menupanel;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JTable tablepayment;
    private javax.swing.JTextField txtamount;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtmemberid;
    private javax.swing.JTextField txtmnumber;
    // End of variables declaration//GEN-END:variables





 private void insertrecord() {
        try
        {
            pst1=cn.prepareStatement("Insert into payment values(?,?,?,?,?)");
            pst1.setString(1, txtmemberid.getText());
            pst1.setString(2, txtfname.getText());
            pst1.setString(3, txtlname.getText());
            pst1.setString(4, txtdate.getText());
            pst1.setString(5, txtamount.getText());
            
        
            pst1.executeUpdate();
            JOptionPane.showMessageDialog(null,"Payment Record Succesfuly added");
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    
}