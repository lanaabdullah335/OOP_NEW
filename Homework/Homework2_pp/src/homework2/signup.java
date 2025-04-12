
package homework2;


import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class signup extends javax.swing.JFrame {
   
     Connection conn;
    PreparedStatement pre;//am objecta bakarde bo 
    ResultSet res;//variavle pre
    
    public signup() {
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
        lable4 = new javax.swing.JLabel();
        lable5 = new javax.swing.JLabel();
        lable6 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        pf1 = new javax.swing.JPasswordField();
        pf2 = new javax.swing.JPasswordField();
        tf3 = new javax.swing.JTextField();
        cbox = new javax.swing.JComboBox<>();
        but1 = new javax.swing.JButton();
        but2 = new javax.swing.JButton();
        but3 = new javax.swing.JButton();
        but4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        lable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lable1.setForeground(new java.awt.Color(255, 255, 255));
        lable1.setText("Full name");

        lable2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lable2.setForeground(new java.awt.Color(255, 255, 255));
        lable2.setText("Usename");

        lable3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lable3.setForeground(new java.awt.Color(255, 255, 255));
        lable3.setText("Password");

        lable4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lable4.setForeground(new java.awt.Color(255, 255, 255));
        lable4.setText("Re-type Password");

        lable5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lable5.setForeground(new java.awt.Color(255, 255, 255));
        lable5.setText("Email");

        lable6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lable6.setForeground(new java.awt.Color(255, 255, 255));
        lable6.setText("Role Selelction");

        tf1.setBackground(new java.awt.Color(0, 153, 153));
        tf1.setForeground(new java.awt.Color(255, 255, 255));

        tf2.setBackground(new java.awt.Color(0, 153, 153));
        tf2.setForeground(new java.awt.Color(255, 255, 255));

        pf1.setBackground(new java.awt.Color(0, 153, 153));
        pf1.setForeground(new java.awt.Color(255, 255, 255));

        pf2.setBackground(new java.awt.Color(0, 153, 153));
        pf2.setForeground(new java.awt.Color(255, 255, 255));

        tf3.setBackground(new java.awt.Color(0, 153, 153));
        tf3.setForeground(new java.awt.Color(255, 255, 255));

        cbox.setBackground(new java.awt.Color(0, 153, 153));
        cbox.setForeground(new java.awt.Color(255, 255, 255));
        cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roles", "Admin", "User" }));
        cbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxActionPerformed(evt);
            }
        });

        but1.setBackground(new java.awt.Color(0, 153, 153));
        but1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        but1.setForeground(new java.awt.Color(255, 255, 255));
        but1.setText("Create account");
        but1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                but1MouseClicked(evt);
            }
        });
        but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but1ActionPerformed(evt);
            }
        });

        but2.setBackground(new java.awt.Color(0, 153, 153));
        but2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        but2.setForeground(new java.awt.Color(255, 255, 255));
        but2.setText("clear");
        but2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but2ActionPerformed(evt);
            }
        });

        but3.setBackground(new java.awt.Color(0, 153, 153));
        but3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        but3.setForeground(new java.awt.Color(255, 255, 255));
        but3.setText("login");
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lable2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lable3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lable4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lable5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lable6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf2)
                    .addComponent(pf2)
                    .addComponent(tf3)
                    .addComponent(pf1)
                    .addComponent(tf1)
                    .addComponent(cbox, 0, 169, Short.MAX_VALUE))
                .addGap(249, 249, 249))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(but1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(but4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lable1)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lable2)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lable3)
                    .addComponent(pf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lable4)
                    .addComponent(pf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lable5)
                    .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lable6)
                    .addComponent(cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but1)
                    .addComponent(but2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but3)
                    .addComponent(but4))
                .addGap(54, 54, 54))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void but2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but2ActionPerformed
         tf1.setText("");
          tf2.setText("");
           pf1.setText("");
           pf2.setText("");
          tf3.setText("");

    }//GEN-LAST:event_but2ActionPerformed

    private void but3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but3ActionPerformed
      Login li = new Login ();
        this.setVisible(false);//bo daxstnawayi page yakam
        li.setVisible(true);
    }//GEN-LAST:event_but3ActionPerformed

    private void but4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_but4ActionPerformed

    private void but1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but1MouseClicked
    
  
    }//GEN-LAST:event_but1MouseClicked

    private void but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1ActionPerformed
          try {
            if (tf1.getText().equals("")||tf2.getText().equals("")||
            pf1.getText().equals("")||pf2.getText().equals("")||
            tf3.getText().equals("")||cbox.getSelectedItem().toString().equals("roles")){
             JOptionPane.showMessageDialog(null, "Error","warning" , 
                       JOptionPane.ERROR_MESSAGE);                
            }else{
            if (pf1.getText().equals(pf2.getText())){
                String sql = "INSERT INTO `user`(`Full name`, `Username`, "
                          + "`Password`, `Email`, `Role  Selection`) VALUES"
                          + " (?,?,?,?,?)";
                pre = conn.prepareStatement(sql);
                pre.setString(1, tf1.getText());
                pre.setString(2, tf2.getText());
                pre.setString(3, pf1.getText());
                pre.setString(4, tf3.getText());
                pre.setString(5, cbox.getSelectedItem().toString());
                pre.executeUpdate();
                JOptionPane.showMessageDialog(null, "Account Created successfully",
                          "Confirmation", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Password is wrong","warning" ,
                          JOptionPane.ERROR_MESSAGE);
            }
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
     
    }//GEN-LAST:event_but1ActionPerformed

    private void cboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
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
    private javax.swing.JLabel lable4;
    private javax.swing.JLabel lable5;
    private javax.swing.JLabel lable6;
    private javax.swing.JPasswordField pf1;
    private javax.swing.JPasswordField pf2;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    // End of variables declaration//GEN-END:variables
}
