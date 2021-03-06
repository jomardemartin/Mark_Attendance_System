/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login_Registration;


import User_UI.AdminHomeUI;
import User_UI.StudentHomeUI;
import User_UI.TeacherHomeUI;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author John Mark
 */
public class LoginLoginForm extends javax.swing.JFrame {

    /**
     * Creates new form Login_form
     */
    public LoginLoginForm() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPasswordField2_password = new javax.swing.JPasswordField();
        jTextField1_username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        forget_password = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1_login = new javax.swing.JButton();
        exit = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        teacher_form = new javax.swing.JButton();
        jComboBox1_login_usertype = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        student_form = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Pic/Left_Image.jpg"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPasswordField2_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 307, 220, 30));

        jTextField1_username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(jTextField1_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 230, 220, 33));
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 274, -1, 15));
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 209, -1, 15));
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome!");
        jLabel3.setToolTipText("");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        forget_password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        forget_password.setText("Forget Password?");
        forget_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forget_passwordMouseClicked(evt);
            }
        });
        jPanel3.add(forget_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 343, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Username:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Password:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Usertype:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 376, -1, -1));

        jButton1_login.setBackground(new java.awt.Color(255, 51, 51));
        jButton1_login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1_login.setText("Login");
        jButton1_login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_loginActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 158, 35));

        exit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel3.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Register as:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 488, -1, -1));

        teacher_form.setBackground(new java.awt.Color(51, 153, 255));
        teacher_form.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        teacher_form.setText("Teacher");
        teacher_form.setToolTipText("");
        teacher_form.setBorder(null);
        teacher_form.setBorderPainted(false);
        teacher_form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacher_formActionPerformed(evt);
            }
        });
        jPanel3.add(teacher_form, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 486, -1, -1));

        jComboBox1_login_usertype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Admin", "Teacher", "Student" }));
        jComboBox1_login_usertype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_login_usertypeActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1_login_usertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 369, 158, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("or");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 488, -1, -1));

        student_form.setBackground(new java.awt.Color(51, 153, 255));
        student_form.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        student_form.setText("Student");
        student_form.setToolTipText("");
        student_form.setBorder(null);
        student_form.setBorderPainted(false);
        student_form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_formActionPerformed(evt);
            }
        });
        jPanel3.add(student_form, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 486, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Pic/logintop1.png"))); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Pic/password.png"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Pic/username.png"))); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 194, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void forget_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forget_passwordMouseClicked
        // TODO add your handling code here:
        forget_password forget = new forget_password();
                forget.setVisible(true);
                forget.pack();
                forget.setLocationRelativeTo(null);
                forget.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
    }//GEN-LAST:event_forget_passwordMouseClicked

    private void jButton1_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_loginActionPerformed
        // TODO add your handling code here:
        String usertype = jComboBox1_login_usertype.getSelectedItem().toString();
        System.out.println(usertype);
        
        //Student
        if(usertype == "Student"){
          
           PreparedStatement ps;
        
        ResultSet rs;
        String username = jTextField1_username.getText();
        String password = String.valueOf(jPasswordField2_password.getPassword());
        String studentusertype = "Student";
        
        
        String query = "SELECT * FROM user_info WHERE username = ? and password = ? and user_type = ?";
        
        try {
            
            ps = MySQL_Connection.getConnection().prepareStatement(query);
           
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, studentusertype);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                LoginSession.fname = rs.getString("fname"); //Additional Changes
                LoginSession.lname = rs.getString("lname"); //Additional Changes
                LoginSession.username = rs.getString("username"); //Additional Changes
                LoginSession.usertype = rs.getString("user_type"); //Additional Changes
                JOptionPane.showMessageDialog(null, "Succesfully Logged In!");
                StudentHomeUI student = new StudentHomeUI();
                student.setVisible(true);
                student.pack();
                student.setLocationRelativeTo(null);
                student.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "NO");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginLoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
       }
        
      //Teacher
        if(usertype == "Teacher"){
          
        PreparedStatement ps;
        
        ResultSet rs;
        String username = jTextField1_username.getText();
        String password = String.valueOf(jPasswordField2_password.getPassword());
        String teacherusertype = "Teacher";
        
        String query = "SELECT * FROM user_info where username = ? and password = ? and user_type = ?";
        
        try {
            
            ps = MySQL_Connection.getConnection().prepareStatement(query);
           
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, teacherusertype);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                LoginSession.fname = rs.getString("fname"); //Additional Changes
                LoginSession.lname = rs.getString("lname"); //Additional Changes
                LoginSession.username = rs.getString("username"); //Additional Changes 
                LoginSession.usertype = rs.getString("user_type"); //Additional Changes
                JOptionPane.showMessageDialog(null, "Succesfully Logged In!");
                TeacherHomeUI student = new TeacherHomeUI();
                student.setVisible(true);
                student.pack();
                student.setLocationRelativeTo(null);
                student.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "NO");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginLoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
       }
      
       //Admin
       if(usertype == "Admin"){
        PreparedStatement ps;
        
        ResultSet rs;
        String username = jTextField1_username.getText();
        String password = String.valueOf(jPasswordField2_password.getPassword());
        
        String query = "SELECT * FROM admin where username = ? and password = ?";
        
        try {
            
            ps = MySQL_Connection.getConnection().prepareStatement(query);
           
            ps.setString(1, username);
            ps.setString(2, password);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Succesfully Logged In!");
                AdminHomeUI admin = new AdminHomeUI();
                admin.setVisible(true);
                admin.pack();
                admin.setLocationRelativeTo(null);
                admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "NO");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginLoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    }//GEN-LAST:event_jButton1_loginActionPerformed

    private void teacher_formActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacher_formActionPerformed
        // TODO add your handling code here:
        LoginTeacherForm student = new LoginTeacherForm();
                student.setVisible(true);
                student.pack();
                student.setLocationRelativeTo(null);
                student.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
    }//GEN-LAST:event_teacher_formActionPerformed

    private void student_formActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_formActionPerformed
        // TODO add your handling code here:
        LoginStudentForm student = new LoginStudentForm();
                student.setVisible(true);
                student.pack();
                student.setLocationRelativeTo(null);
                student.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
    }//GEN-LAST:event_student_formActionPerformed

    private void jComboBox1_login_usertypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_login_usertypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1_login_usertypeActionPerformed

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
            java.util.logging.Logger.getLogger(LoginLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginLoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JLabel forget_password;
    private javax.swing.JButton jButton1_login;
    public javax.swing.JComboBox<String> jComboBox1_login_usertype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField2_password;
    public javax.swing.JTextField jTextField1_username;
    private javax.swing.JButton student_form;
    private javax.swing.JButton teacher_form;
    // End of variables declaration//GEN-END:variables
}
