/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_UI;

import Login_Registration.LoginLoginForm;
import java.awt.*;
import javax.swing.*;
import javax.swing.*;
import java.sql.SQLException;
import java.awt.event.*;
import java.sql.*;
import Login_Registration.MySQL_Connection;
import User_UI.TeacherAttendanceSheet;
import net.proteanit.sql.DbUtils;
import Login_Registration.LoginSession;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author NEK PC
 */
public class TeacherMarkAttendanceUI extends JFrame {
    /**
     * Creates new form AdminUI
     */
    public TeacherMarkAttendanceUI() {
        initComponents();
        this.retrieveInitialData();
        this.retrieveTxtfieldData();
    }

    public void retrieveInitialData () {
        PreparedStatement pst;
        ResultSet rs;

        String query =  "SELECT tagstudent.id, gradelvl, section FROM grade_section "
            + "INNER JOIN tagstudent ON grade_section.id = tagstudent.grade_section_id "
            + "INNER JOIN teacher_info ON teacher_info.user_idfk = tagstudent.teacher_info_user_idfk "
            + "WHERE teacher_info.teacher_fname = ? AND teacher_info.teacher_lname = ? ";

        try {
            pst = MySQL_Connection.getConnection().prepareStatement(query);
            pst.setString(1,LoginSession.fname);
            pst.setString(2,LoginSession.lname);

            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void retrieveTxtfieldData(){
        PreparedStatement pst;
        ResultSet rs;
        String username = LoginSession.username;
        String query = "SELECT teacher_info.teacher_fname, teacher_info.teacher_lname,"
                     + " teacher_info.subject, teacher_info.department, user_info.username \n" +
                       "FROM teacher_info INNER JOIN user_info\n" +
                       "on teacher_info.teacher_fname = user_info.fname AND teacher_info.teacher_lname = user_info.lname WHERE username = ?";
        try {
            pst = User_UI.MySQL_Connection.getConnection().prepareStatement(query);
            pst.setString(1, username);
            rs = pst.executeQuery();
            
            if (rs.next()){
                String fname = rs.getString("teacher_fname");
                String lname = rs.getString("teacher_lname");
                txt_teacher.setText(fname+" "+lname);
                txt_department.setText(rs.getString("department"));
                txt_subject.setText(rs.getString("subject"));

            } else{
                txt_teacher.setText("");
                txt_subject.setText("");
                txt_department.setText("");
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
        txt_subject = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        enter_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        sidepanel = new javax.swing.JPanel();
        home_btn = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        profile_btn = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mark_btn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        logout_btn = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        teachermanagement_lbl = new javax.swing.JLabel();
        txt_teacher = new javax.swing.JTextField();
        txt_department = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(getPreferredSize());

        bg.setBackground(new java.awt.Color(51, 153, 255));
        bg.setMinimumSize(new java.awt.Dimension(1000, 720));
        bg.setPreferredSize(new java.awt.Dimension(1200, 720));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bg.add(txt_subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 250, 30));

        jLabel14.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel14.setText("Subject Teacher:");
        bg.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 131, -1, 30));

        jLabel15.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel15.setText("Department:");
        bg.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 171, -1, 30));

        jLabel13.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel13.setText("Subject:");
        bg.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 208, -1, 30));

        enter_btn.setText("Enter");
        enter_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enter_btnMouseClicked(evt);
            }
        });
        bg.add(enter_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 660, 210, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Section"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 790, 360));

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

        profile_btn.setBackground(new java.awt.Color(0, 51, 204));
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

        mark_btn.setBackground(new java.awt.Color(0, 102, 255));
        mark_btn.setToolTipText("");
        mark_btn.setMinimumSize(new java.awt.Dimension(260, 0));
        mark_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mark_btnMousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mark Attendance");
        jLabel4.setMaximumSize(new java.awt.Dimension(51, 25));
        jLabel4.setMinimumSize(new java.awt.Dimension(51, 25));
        jLabel4.setPreferredSize(new java.awt.Dimension(51, 25));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User_UI/images/icons8_attendance_30px.png"))); // NOI18N

        javax.swing.GroupLayout mark_btnLayout = new javax.swing.GroupLayout(mark_btn);
        mark_btn.setLayout(mark_btnLayout);
        mark_btnLayout.setHorizontalGroup(
            mark_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mark_btnLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mark_btnLayout.setVerticalGroup(
            mark_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mark_btnLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(mark_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        sidepanel.add(mark_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 300, 70));

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
        teachermanagement_lbl.setText("Mark Attendance");

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
        bg.add(txt_teacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 250, 30));
        bg.add(txt_department, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 250, 30));

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

    private void NextScreenActionPerformed (ActionEvent ae) {
        int selectedRow = jTable1.getSelectedRow();
        String id = jTable1.getModel().getValueAt(selectedRow, 0).toString();

        // Adds a new section Id for later use for next frames 
        LoginSession.sectionId = id;

        TeacherAttendanceSheet new_screen = new TeacherAttendanceSheet() ;

        this.dispose();
        new_screen.setVisible(true);
    }
    private void home_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btnMousePressed
        // TODO add your handling code here:
        setColor(home_btn);
        resetColor(profile_btn);
        resetColor(mark_btn);
 
        TeacherHomeUI home = new TeacherHomeUI();
        home.setVisible(true);
        home.setLocationRelativeTo(null);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_home_btnMousePressed

    private void profile_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profile_btnMousePressed
        // TODO add your handling code here:
        setColor(profile_btn);
        resetColor(home_btn);
        resetColor(mark_btn);

        TeacherViewProfileUI view = new TeacherViewProfileUI();
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_profile_btnMousePressed

    private void mark_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mark_btnMousePressed
        // TODO add your handling code here:
        setColor(mark_btn);
        resetColor(home_btn);
        resetColor(profile_btn);

        TeacherMarkAttendanceUI mark = new TeacherMarkAttendanceUI();
        mark.setVisible(true);
        mark.setLocationRelativeTo(null);
        mark.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_mark_btnMousePressed

    private void logout_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_btnMousePressed
        // TODO add your handling code here:
        LoginLoginForm relogin = new LoginLoginForm();
        relogin.setVisible(true);
        relogin.pack();
        relogin.setLocationRelativeTo(null);
        relogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_logout_btnMousePressed

    private void enter_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enter_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_enter_btnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherMarkAttendanceUI().setVisible(true);
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
    private javax.swing.JPanel bg;
    private javax.swing.JButton enter_btn;
    private javax.swing.JPanel home_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel logout_btn;
    private javax.swing.JPanel mark_btn;
    private javax.swing.JPanel profile_btn;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JLabel teachermanagement_lbl;
    private javax.swing.JTextField txt_department;
    private javax.swing.JTextField txt_subject;
    private javax.swing.JTextField txt_teacher;
    // End of variables declaration//GEN-END:variables
}
