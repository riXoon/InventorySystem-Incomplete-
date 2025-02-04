/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LogIn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.awt.Color;
import java.awt.Toolkit;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.security.MessageDigest;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Erickson Guhilde
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        setUndecorated(true);
        initComponents();
        
        //setAlwaysOnTop(true);
        setResizable(false);
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        
        int x = (int) tk.getScreenSize().getWidth();
        int y = (int) tk.getScreenSize().getHeight();
        
        setSize(x,y);
        
        /*try {
            Connection();
        } catch(SQLException ex){
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE,null,ex);
        } 
        
        Connection con;
        Statement st;
        
        private static final*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        signup = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        unameTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        signupBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        passTxtField = new javax.swing.JPasswordField();
        confPassTxtField = new javax.swing.JPasswordField();
        passCheckbox = new javax.swing.JCheckBox();
        confPassCheckbox = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(1550, 871));
        setSize(new java.awt.Dimension(1550, 871));
        getContentPane().setLayout(null);

        jPanel2.setPreferredSize(new java.awt.Dimension(1550, 871));

        jPanel1.setBackground(new java.awt.Color(246, 232, 250,100));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setMinimumSize(new java.awt.Dimension(324, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(324, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signup.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        signup.setText("Sign Up");
        jPanel1.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 27, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Already registered? Log in");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("here.");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 37, -1));

        username.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        username.setText("Username*");
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        unameTxtField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        unameTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                unameTxtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                unameTxtFieldFocusLost(evt);
            }
        });
        jPanel1.add(unameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 370, 50));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Password*");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Confirm Password*");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jCheckBox3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCheckBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("I agree with");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        signupBtn.setBackground(new java.awt.Color(0, 10, 173));
        signupBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        signupBtn.setForeground(new java.awt.Color(255, 255, 255));
        signupBtn.setText("Sign Up");
        signupBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupBtnMouseClicked(evt);
            }
        });
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });
        jPanel1.add(signupBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 268, 45));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Terms and Conditions.");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, -1, -1));

        passTxtField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel1.add(passTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 370, 40));

        confPassTxtField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel1.add(confPassTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 370, 40));

        passCheckbox.setText("show password");
        passCheckbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        passCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passCheckboxActionPerformed(evt);
            }
        });
        jPanel1.add(passCheckbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        confPassCheckbox.setText("show password");
        confPassCheckbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confPassCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confPassCheckboxActionPerformed(evt);
            }
        });
        jPanel1.add(confPassCheckbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Erickson Guhilde\\OneDrive\\Documents\\NetBeansProjects\\InventorySyst\\src\\LogIn\\bgmain.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(577, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(546, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1550, 871);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        
        Login login = new Login();
        login.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void signupBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupBtnMouseClicked
        // TODO add your handling code here:
        
       /*Login login = new Login();
        
       login.setVisible(true);
       dispose();*/
    }//GEN-LAST:event_signupBtnMouseClicked

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        // TODO add your handling code here:
           String Username = unameTxtField.getText();
           String Password = passTxtField.getText();
           String ConfirmPassword = confPassTxtField.getText();
            insertData(Username, Password, ConfirmPassword);
}
    
    private void insertData(String userName, String pword, String CPassword)
    {
        
        String Username, Password, ConfirmPassword, query;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://127.0.0.1:3306/inventory_system";
           SUser = "root";
           SPass = "";

        
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
           
           Statement st = con.createStatement();
           if("".equals(unameTxtField.getText())){
           JOptionPane.showMessageDialog(new JFrame(), "Username is required", "Error", JOptionPane.ERROR_MESSAGE);
           } else if("".equals(passTxtField.getText())){
            JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Error", JOptionPane.ERROR_MESSAGE);
        }  else if("".equals(confPassTxtField.getText())){
            JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Username = unameTxtField.getText();
            Password = passTxtField.getText();
            ConfirmPassword = confPassTxtField.getText();
            
               System.out.println(Password);
               
               query = "INSERT INTO user_info(username, password, confirm_password)" +
                       "VALUES('"+userName+"', '"+pword+"', '"+CPassword+"')";
               
               
               st.execute(query);
               unameTxtField.setText("");
               passTxtField.setText("");
               confPassTxtField.setText("");
               JOptionPane.showMessageDialog(null, "Account has been created successfully!");
               
            
        }
               
           
        }catch (Exception e){
            System.out.println("Error!" + e.getMessage());
        }
    }//GEN-LAST:event_signupBtnActionPerformed

   /* public static String passwordHash(String password)
    {
        
        try {
            
            MessageDigest md = MessageDigest.getInstance("SHA");
            md.update(password.getBytes());
            byte[] rbt=md.digest();
            StringBuilder sb=new StringBuilder();
            
            for(byte b: rbt)
            {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
                    
         } catch (Exception e) {
        }
        return null;
    } */
    
    
    private void unameTxtFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unameTxtFieldFocusGained
        // TODO add your handling code here:
         if(unameTxtField.getText().equals("Enter Username")) {
            
            unameTxtField.setText("");
            unameTxtField.setForeground(new Color(153,153,153));
            
        }
    }//GEN-LAST:event_unameTxtFieldFocusGained

    private void unameTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unameTxtFieldFocusLost
        // TODO add your handling code here:
        
        if(unameTxtField.getText().equals("")) {
            
            unameTxtField.setText("Enter Username");
            unameTxtField.setForeground(new Color(153,153,153));
            
        }
    }//GEN-LAST:event_unameTxtFieldFocusLost

    private void passCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passCheckboxActionPerformed
        // TODO add your handling code here:
        
        if(passCheckbox.isSelected()){
            passTxtField.setEchoChar((char)0);
        } else {
            passTxtField.setEchoChar('*');
        }
    }//GEN-LAST:event_passCheckboxActionPerformed

    private void confPassCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confPassCheckboxActionPerformed
        // TODO add your handling code here:
        
        if(passCheckbox.isSelected()){
            confPassTxtField.setEchoChar((char)0);
        } else {
            confPassTxtField.setEchoChar('*');
        }
    }//GEN-LAST:event_confPassCheckboxActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox confPassCheckbox;
    private javax.swing.JPasswordField confPassTxtField;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JCheckBox passCheckbox;
    private javax.swing.JPasswordField passTxtField;
    private javax.swing.JLabel signup;
    private javax.swing.JButton signupBtn;
    private javax.swing.JTextField unameTxtField;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
