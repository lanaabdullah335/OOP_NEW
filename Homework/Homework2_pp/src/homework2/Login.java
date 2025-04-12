
package homework2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    
     Connection conn;
    PreparedStatement pre;
    ResultSet res;
    
    public Login() {
        initComponents();
         dbConnection();
    }
    void dbConnection(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/homework2_pp_1","root","");
            System.out.println("Connection Succesful");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lable1 = new javax.swing.JLabel();
        lable2 = new javax.swing.JLabel();
        lable3 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        cbox = new javax.swing.JComboBox<>();
        pf = new javax.swing.JPasswordField();
        but1 = new javax.swing.JButton();
        but2 = new javax.swing.JButton();
        but3 = new javax.swing.JButton();
        but4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lable1.setBackground(new java.awt.Color(0, 153, 153));
        lable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lable1.setForeground(new java.awt.Color(255, 255, 255));
        lable1.setText("Username");

        lable2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lable2.setForeground(new java.awt.Color(255, 255, 255));
        lable2.setText("Password");

        lable3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lable3.setForeground(new java.awt.Color(255, 255, 255));
        lable3.setText("Role Selection");

        tf1.setBackground(new java.awt.Color(0, 153, 153));
        tf1.setForeground(new java.awt.Color(255, 255, 255));
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });

        cbox.setBackground(new java.awt.Color(0, 153, 153));
        cbox.setForeground(new java.awt.Color(255, 255, 255));
        cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roles", "Admin", "User", " " }));

        pf.setBackground(new java.awt.Color(0, 153, 153));
        pf.setForeground(new java.awt.Color(255, 255, 255));

        but1.setBackground(new java.awt.Color(0, 153, 153));
        but1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        but1.setForeground(new java.awt.Color(255, 255, 255));
        but1.setText("Login");
        but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but1ActionPerformed(evt);
            }
        });

        but2.setBackground(new java.awt.Color(0, 153, 153));
        but2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        but2.setForeground(new java.awt.Color(255, 255, 255));
        but2.setText("Signup");
        but2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but2ActionPerformed(evt);
            }
        });

        but3.setBackground(new java.awt.Color(0, 153, 153));
        but3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        but3.setForeground(new java.awt.Color(255, 255, 255));
        but3.setText("Clear");
        but3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but3ActionPerformed(evt);
            }
        });

        but4.setBackground(new java.awt.Color(0, 153, 153));
        but4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        but4.setForeground(new java.awt.Color(255, 255, 255));
        but4.setText("Exit");
        but4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lable1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lable2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lable3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbox, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(353, 353, 353))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(but3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(but4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(but1)
                        .addGap(78, 78, 78)
                        .addComponent(but2)))
                .addGap(101, 101, 101))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lable1)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lable2)
                    .addComponent(pf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lable3)
                    .addComponent(cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(but1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(but2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but3)
                    .addComponent(but4))
                .addGap(102, 102, 102))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void but2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but2ActionPerformed
        signup su = new signup ();
        this.setVisible(false);//bo daxstnawayi page yakam
        su.setVisible(true);
    }//GEN-LAST:event_but2ActionPerformed

    private void but3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but3ActionPerformed
        tf1.setText("");
        pf.setText("");
        
        
    }//GEN-LAST:event_but3ActionPerformed

    private void but4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but4ActionPerformed
       this.dispose();
    }//GEN-LAST:event_but4ActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1ActionPerformed
          try {
              
            String sql = "SELECT * FROM `user` ";
            pre = conn.prepareStatement(sql);
            res = pre.executeQuery();
           if (tf1.getText().equals("")||
                    pf.getText().equals("")||
                    cbox.getSelectedItem().toString().equals("roles")){
                JOptionPane.showMessageDialog(null, "Error",
                          "warning" , JOptionPane.ERROR_MESSAGE);                
            }else{
            
               boolean match = false;
        while (res.next()){//res.next()...>bo awaya ka datae databaseka warbgrenawa
           //getstring waredagre la database w nawe colomaka danustre le 
           //naw dabll coteshnaka
                if (tf1.getText().equals(res.getString("Username")) && 
                   pf.getText().equals(res.getString("Password")) && 
                  cbox.getSelectedItem().
               toString().equals(res.getString("Role  Selection"))){
        
             match = true;
             
             if (cbox.getSelectedItem().toString().equals("User")){
             JOptionPane.showMessageDialog(null, 
               "Welcome to User Form", "information",
                JOptionPane.INFORMATION_MESSAGE);
                  dashboardUser user = new dashboardUser();
               user.setVisible(true);
                   this.setVisible(false);
                    }else{
               JOptionPane.showMessageDialog(null, "Welcome to Admin Form",
                         "information", JOptionPane.INFORMATION_MESSAGE);
                      dashboardAdmin admin = new dashboardAdmin();
                        admin.setVisible(true);
                        this.setVisible(false);
                    }                    
                }   
            }

            
            if (!match){
            JOptionPane.showMessageDialog(null, "Username or Password is wrong"
                      ,"warning" , JOptionPane.ERROR_MESSAGE);
        }
            }
            
        } catch (SQLException e) {
            System.out.println("e");
        }
    }//GEN-LAST:event_but1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but1;
    private javax.swing.JButton but2;
    private javax.swing.JButton but3;
    private javax.swing.JButton but4;
    private javax.swing.JComboBox<String> cbox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lable1;
    private javax.swing.JLabel lable2;
    private javax.swing.JLabel lable3;
    private javax.swing.JPasswordField pf;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}
