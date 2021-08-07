/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_UI;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NEK PC
 */
public class TeacherAttendanceStudentList extends javax.swing.JFrame {

    /**
     * Creates new form AdminUI
     */
    public TeacherAttendanceStudentList() {
        initComponents();
        getStudentList();
    }
    
    //Arraylist for table
    public ArrayList<StudentListTable> StudentListTableArray(){
        ArrayList<StudentListTable> studentlist = new ArrayList<StudentListTable>();

        PreparedStatement pst;
        ResultSet rs;
        String query = "SELECT * FROM student_info";
        
        
        try {
            pst = MySQL_Connection.getConnection().prepareStatement(query);
            rs = pst.executeQuery();
            
            while(rs.next()){
                StudentListTable students;
                students = new StudentListTable(rs.getString("student_fname"),rs.getString("student_lname"));
                studentlist.add(students);
                

            }
        } catch (SQLException ex) {
            Logger.getLogger(TeacherAttendanceStudentList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return studentlist;
    }
    
    public void getStudentList(){
        ArrayList<StudentListTable> list = StudentListTableArray();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object [] obj = new Object[2];
        for (int i=0; i <list.size(); i++){
            obj[0] = list.get(i).getName();
            model.addRow(obj);
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
        jPanel1 = new javax.swing.JPanel();
        teachermanagement_lbl = new javax.swing.JLabel();
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
        select_all_box = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(getPreferredSize());

        bg.setBackground(new java.awt.Color(51, 153, 255));
        bg.setMinimumSize(new java.awt.Dimension(1000, 720));
        bg.setPreferredSize(new java.awt.Dimension(1200, 720));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel1.setText("Welcome Teacher");
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

        select_all_box.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        select_all_box.setText("Select All");
        select_all_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_all_boxActionPerformed(evt);
            }
        });
        bg.add(select_all_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 150, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        bg.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 770, 450));

        jButton1.setText("Print Record");
        bg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 153, -1, 20));

        jButton2.setText("Submit");
        bg.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 660, 150, 30));

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
        
        TeacherAttendanceStudentList view = new TeacherAttendanceStudentList();
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
    }//GEN-LAST:event_logout_btnMousePressed

    private void select_all_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_all_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_all_boxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherAttendanceStudentList().setVisible(true);
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
    private javax.swing.JPanel home_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel logout_btn;
    private javax.swing.JPanel mark_btn;
    private javax.swing.JPanel profile_btn;
    private javax.swing.JCheckBox select_all_box;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JLabel teachermanagement_lbl;
    // End of variables declaration//GEN-END:variables
}
