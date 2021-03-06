/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_UI;

import Login_Registration.LoginSession;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author NEK PC
 */
public class StudentViewProfileUI extends javax.swing.JFrame {

    /**
     * Creates new form AdminUI
     */
    public StudentViewProfileUI() {
        initComponents();
        loadData();
        
    }
    public void loadData(){
        PreparedStatement pst;
        ResultSet rs;
        String username = LoginSession.username;
        String query = "SELECT student_info.student_fname, student_info.student_lname, student_info.student_address, "
                     + "student_info.student_gender, student_info.fathers_name, student_info.mothers_name, student_info.age, "
                     + "student_info.gradelvl, student_info.section, user_info.fname, user_info.lname, user_info.username\n" +
                       "FROM student_info INNER JOIN user_info\n" +
                       "on student_info.student_fname = user_info.fname AND student_info.student_lname = user_info.lname WHERE username = ?";
        try {
            pst = MySQL_Connection.getConnection().prepareStatement(query);
            pst.setString(1, username);
            rs = pst.executeQuery();
            
            if (rs.next()){
                txt_fname.setText(rs.getString("student_fname"));
                txt_lname.setText(rs.getString("student_lname"));
                txt_address.setText(rs.getString("student_address"));
                txt_gender.setText(rs.getString("student_gender"));
                txt_age.setText(rs.getString("age"));
                txt_father.setText(rs.getString("fathers_name"));
                txt_mother.setText(rs.getString("mothers_name"));
                txt_grade.setText(rs.getString("gradelvl"));
                txt_section.setText(rs.getString("section"));

                
            } else{
                txt_fname.setText("");
                txt_lname.setText("");
                txt_address.setText("");
                txt_gender.setText("");
                txt_age.setText("");
                txt_father.setText("");
                txt_mother.setText("");
                txt_grade.setText("");
                txt_section.setText("");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TeacherViewProfileUI.class.getName()).log(Level.SEVERE, null, ex);
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

        bg = new javax.swing.JPanel();
        sidepanel = new javax.swing.JPanel();
        home_btn = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        profile_btn = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        attendance_btn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        logout_btn = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        teachermanagement_lbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_mother = new javax.swing.JTextField();
        txt_fname = new javax.swing.JTextField();
        txt_lname = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        txt_gender = new javax.swing.JTextField();
        txt_father = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_age = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_section = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_grade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(getPreferredSize());

        bg.setBackground(new java.awt.Color(51, 153, 255));
        bg.setMinimumSize(new java.awt.Dimension(1000, 720));
        bg.setPreferredSize(new java.awt.Dimension(1200, 720));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepanel.setBackground(new java.awt.Color(0, 0, 204));
        sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home_btn.setBackground(new java.awt.Color(0, 51, 204));
        home_btn.setToolTipText("");
        home_btn.setMinimumSize(new java.awt.Dimension(260, 0));
        home_btn.setPreferredSize(new java.awt.Dimension(261, 70));
        home_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                home_btnMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Home");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User_UI/images/icons8_home_32px.png"))); // NOI18N
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout home_btnLayout = new javax.swing.GroupLayout(home_btn);
        home_btn.setLayout(home_btnLayout);
        home_btnLayout.setHorizontalGroup(
            home_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, home_btnLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        home_btnLayout.setVerticalGroup(
            home_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, home_btnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(home_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        sidepanel.add(home_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 300, 70));

        profile_btn.setBackground(new java.awt.Color(0, 102, 255));
        profile_btn.setToolTipText("");
        profile_btn.setMinimumSize(new java.awt.Dimension(260, 0));
        profile_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                profile_btnMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("View Profile");
        jLabel5.setMaximumSize(new java.awt.Dimension(51, 25));
        jLabel5.setMinimumSize(new java.awt.Dimension(51, 25));
        jLabel5.setPreferredSize(new java.awt.Dimension(51, 25));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User_UI/images/icons8_account_32px.png"))); // NOI18N
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout profile_btnLayout = new javax.swing.GroupLayout(profile_btn);
        profile_btn.setLayout(profile_btnLayout);
        profile_btnLayout.setHorizontalGroup(
            profile_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profile_btnLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        profile_btnLayout.setVerticalGroup(
            profile_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profile_btnLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(profile_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        sidepanel.add(profile_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 300, 70));

        attendance_btn.setBackground(new java.awt.Color(0, 51, 204));
        attendance_btn.setToolTipText("");
        attendance_btn.setMinimumSize(new java.awt.Dimension(260, 0));
        attendance_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                attendance_btnMousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("View Attendance");
        jLabel4.setMaximumSize(new java.awt.Dimension(51, 25));
        jLabel4.setMinimumSize(new java.awt.Dimension(51, 25));
        jLabel4.setPreferredSize(new java.awt.Dimension(51, 25));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User_UI/images/icons8_view_32px.png"))); // NOI18N

        javax.swing.GroupLayout attendance_btnLayout = new javax.swing.GroupLayout(attendance_btn);
        attendance_btn.setLayout(attendance_btnLayout);
        attendance_btnLayout.setHorizontalGroup(
            attendance_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendance_btnLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        attendance_btnLayout.setVerticalGroup(
            attendance_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendance_btnLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(attendance_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        sidepanel.add(attendance_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 300, 70));

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 15));
        sidepanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 122, 260, 10));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome"+" "+LoginSession.fname);
        sidepanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, 40));

        logout_btn.setBackground(new java.awt.Color(0, 51, 204));
        logout_btn.setToolTipText("");
        logout_btn.setMinimumSize(new java.awt.Dimension(260, 0));
        logout_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logout_btnMousePressed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Logout");
        jLabel9.setMaximumSize(new java.awt.Dimension(51, 25));
        jLabel9.setMinimumSize(new java.awt.Dimension(51, 25));
        jLabel9.setPreferredSize(new java.awt.Dimension(51, 25));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User_UI/images/icons8_logout_rounded_down_32px.png"))); // NOI18N

        javax.swing.GroupLayout logout_btnLayout = new javax.swing.GroupLayout(logout_btn);
        logout_btn.setLayout(logout_btnLayout);
        logout_btnLayout.setHorizontalGroup(
            logout_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logout_btnLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logout_btnLayout.setVerticalGroup(
            logout_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logout_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logout_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        sidepanel.add(logout_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 300, 50));

        bg.add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 720));

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        teachermanagement_lbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        teachermanagement_lbl.setForeground(new java.awt.Color(255, 255, 255));
        teachermanagement_lbl.setText("Your Profile");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(teachermanagement_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(618, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(teachermanagement_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 900, 60));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel13.setText("Section:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, -1, 32));

        jLabel14.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel14.setText("First Name:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 86, 32));

        jLabel15.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel15.setText("Last Name:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 86, 32));

        jLabel16.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel16.setText("Address:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 86, 32));

        jLabel17.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel17.setText("Age:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 86, 32));

        jLabel18.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel18.setText("Father's Name: ");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 120, 32));

        txt_mother.setEditable(false);
        jPanel2.add(txt_mother, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 190, 30));

        txt_fname.setEditable(false);
        jPanel2.add(txt_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 190, 30));

        txt_lname.setEditable(false);
        jPanel2.add(txt_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 190, 30));

        txt_address.setEditable(false);
        jPanel2.add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 190, 30));

        txt_gender.setEditable(false);
        jPanel2.add(txt_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 190, 30));

        txt_father.setEditable(false);
        jPanel2.add(txt_father, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 190, 30));

        jLabel19.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel19.setText("Gender:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 86, 32));

        txt_age.setEditable(false);
        jPanel2.add(txt_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 190, 30));

        jLabel20.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel20.setText("Mother's Name:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, 32));

        txt_section.setEditable(false);
        jPanel2.add(txt_section, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 100, 30));

        jLabel21.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel21.setText("Grade Level:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, 32));

        txt_grade.setEditable(false);
        jPanel2.add(txt_grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 40, 30));

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 840, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void home_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btnMousePressed
        // TODO add your handling code here:
        setColor(home_btn);
        resetColor(profile_btn);
        resetColor(attendance_btn);
        StudentHomeUI home = new StudentHomeUI();
        home.setVisible(true);
        home.setLocationRelativeTo(null);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_home_btnMousePressed

    private void profile_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profile_btnMousePressed
        // TODO add your handling code here:
        setColor(profile_btn);
        resetColor(home_btn);
        resetColor(attendance_btn);
        StudentViewProfileUI view = new StudentViewProfileUI();
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_profile_btnMousePressed

    private void attendance_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendance_btnMousePressed
        // TODO add your handling code here:
        setColor(attendance_btn);
        resetColor(home_btn);
        resetColor(profile_btn);
        StudentViewAttendanceUI attend = new StudentViewAttendanceUI();
        attend.setVisible(true);
        attend.setLocationRelativeTo(null);
        attend.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_attendance_btnMousePressed

    private void logout_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_btnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_logout_btnMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentViewProfileUI().setVisible(true);
            }
        });
    }
    
    void setColor(JPanel panel){
        panel.setBackground(new Color(0, 102, 255));
    }
    
    void resetColor(JPanel panel){
        panel.setBackground(new Color(0, 51, 204));
        
    }
    
    
    


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel attendance_btn;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel home_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel logout_btn;
    private javax.swing.JPanel profile_btn;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JLabel teachermanagement_lbl;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_father;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_gender;
    private javax.swing.JTextField txt_grade;
    private javax.swing.JTextField txt_lname;
    private javax.swing.JTextField txt_mother;
    private javax.swing.JTextField txt_section;
    // End of variables declaration//GEN-END:variables
}
