/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm_green_uni;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class StudentManagementCom extends javax.swing.JFrame {

    com.mysql.jdbc.Connection con=null;
    PreparedStatement pst=null;
    ArrayList<Student> stList;
    ArrayList<Student2> stList2;
    ArrayList<Lecturer> lecList;
    ArrayList<Instructor> insList;
    MySqlConnect sql=new MySqlConnect();
    Student s=new Student();
    Lecturer l=new Lecturer();
    Instructor i=new Instructor();
    ResultSet rs=null;
    
    public StudentManagementCom() {
        initComponents();
        loadStudents();
        loadLecturer();
        loadInstructor();
        
    }
    
    void loadStudents(){
        stList=sql.getStudentUC();
        stList2=sql.getStudentPC();
        StudentDetails stDetails=new StudentDetails(stList);
        StudentDetails2 stDetails2=new StudentDetails2(stList2);
        und_Com.setModel(stDetails);
        Pos_Com.setModel(stDetails2);
        
    }
    void loadLecturer(){
        lecList=sql.getLecturerB();
        LecturerDetails lecDetails=new LecturerDetails(lecList);
        lec_Bus.setModel(lecDetails);
    }
    void loadInstructor(){
        insList=sql.getInstructorB();
        InstructorDetails insDetails=new InstructorDetails(insList);
        ins_bus.setModel(insDetails);
    }
      

   void f_clearData(){
        s_id.setText("");
        s_name.setText("");
        
        subj1.setSelectedItem("");
        subj2.setSelectedItem("");
        subj3.setSelectedItem("");
        subj4.setSelectedItem("");
        subj5.setSelectedItem("");
        subj6.setSelectedItem("");
        subj7.setSelectedItem("");
        subj8.setSelectedItem("");

    }
    void j_clearData(){
        j_id.setText("");
        j_name.setText("");
        
        j_sub1.setSelectedItem("");
        j_sub2.setSelectedItem("");
        j_sub3.setSelectedItem("");
        j_sub4.setSelectedItem("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        update_u = new javax.swing.JButton();
        delete_u = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        und_Com = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        view_u = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        update_p = new javax.swing.JButton();
        delete_p = new javax.swing.JButton();
        view_p = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Pos_Com = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        lec_Bus = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        ins_bus = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        j_id = new javax.swing.JTextField();
        j_name = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        j_sub1 = new javax.swing.JComboBox<>();
        j_sub2 = new javax.swing.JComboBox<>();
        j_sub3 = new javax.swing.JComboBox<>();
        j_sub4 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        f1 = new javax.swing.JLabel();
        f2 = new javax.swing.JLabel();
        f3 = new javax.swing.JLabel();
        f4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        s_id = new javax.swing.JTextField();
        s_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        subj7 = new javax.swing.JComboBox<>();
        subj8 = new javax.swing.JComboBox<>();
        subj6 = new javax.swing.JComboBox<>();
        subj1 = new javax.swing.JComboBox<>();
        subj2 = new javax.swing.JComboBox<>();
        subj5 = new javax.swing.JComboBox<>();
        subj4 = new javax.swing.JComboBox<>();
        subj3 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        fc1 = new javax.swing.JLabel();
        fc2 = new javax.swing.JLabel();
        fc3 = new javax.swing.JLabel();
        fc4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ff1 = new javax.swing.JLabel();
        ff2 = new javax.swing.JLabel();
        ff3 = new javax.swing.JLabel();
        ff4 = new javax.swing.JLabel();
        fc8 = new javax.swing.JLabel();
        fc6 = new javax.swing.JLabel();
        fc7 = new javax.swing.JLabel();
        fc5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        ff5 = new javax.swing.JLabel();
        ff6 = new javax.swing.JLabel();
        ff7 = new javax.swing.JLabel();
        ff8 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        sName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        month = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Stu_ID", "Name", "Sex", "ContactNo", "Email", " Year", "Qualification", "Institute"
            }
        ));
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable2KeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(jTable2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Stu_ID", "Name", "Sex", "contact No", "Email", "Year", "Z-score", "Rank"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("School of Computing");

        update_u.setText("Update Students");
        update_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_uActionPerformed(evt);
            }
        });

        delete_u.setText("Delete Students");
        delete_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_uActionPerformed(evt);
            }
        });

        und_Com.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        und_Com.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                und_ComMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(und_Com);

        jButton2.setText("Add Students");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        view_u.setText("View Students");
        view_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_uActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(view_u)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(view_u)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(update_u)
                .addGap(64, 64, 64)
                .addComponent(delete_u)
                .addGap(283, 283, 283))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(update_u)
                            .addComponent(delete_u)
                            .addComponent(jButton2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Undergraduate", jPanel2);

        update_p.setText("Update Students");
        update_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_pActionPerformed(evt);
            }
        });

        delete_p.setText("Delete Students");
        delete_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_pActionPerformed(evt);
            }
        });

        view_p.setText("View Students");
        view_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_pActionPerformed(evt);
            }
        });

        jButton3.setText("Add Students");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Pos_Com.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane2.setViewportView(Pos_Com);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jButton3)
                .addGap(57, 57, 57)
                .addComponent(view_p)
                .addGap(80, 80, 80)
                .addComponent(update_p)
                .addGap(70, 70, 70)
                .addComponent(delete_p)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(306, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_p)
                    .addComponent(update_p)
                    .addComponent(view_p)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );

        jTabbedPane4.addTab("Postgraduate", jPanel1);

        lec_Bus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane5.setViewportView(lec_Bus);

        jButton5.setText("Add Lecturer");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setText("Update Lecturer");

        jButton8.setText("Delete Lecturer");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jButton5)
                        .addGap(116, 116, 116)
                        .addComponent(jButton7)
                        .addGap(111, 111, 111)
                        .addComponent(jButton8)))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        jTabbedPane4.addTab("Lecturer", jPanel4);

        ins_bus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane6.setViewportView(ins_bus);

        jButton9.setText("Add Instructor");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton11.setText("Update Instructor");

        jButton12.setText("Delete Instructor");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jButton9)
                        .addGap(93, 93, 93)
                        .addComponent(jButton11)
                        .addGap(141, 141, 141)
                        .addComponent(jButton12)))
                .addContainerGap(251, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Instructor", jPanel5);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText(" Selecte Optional Subjects");

        jLabel8.setText("Student ID");

        jLabel9.setText("Student Name");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Semester 2");

        jButton14.setText("SUBMIT");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        j_sub1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Management IS", "Marketing" }));
        j_sub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_sub1ActionPerformed(evt);
            }
        });

        j_sub2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Econ", "Enhancement" }));
        j_sub2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_sub2ActionPerformed(evt);
            }
        });

        j_sub3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maths 2", "Econ 2" }));
        j_sub3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_sub3ActionPerformed(evt);
            }
        });

        j_sub4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marketing 2" }));
        j_sub4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_sub4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("credits");

        c1.setText("c");

        c2.setText("c");

        c3.setText("c");

        c4.setText("c");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("fees");

        f1.setText("$");

        f2.setText("$");

        f3.setText("$");

        f4.setText("$");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(j_id, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(j_name)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(j_sub4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j_sub1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(j_sub2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(j_sub3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(226, 226, 226)
                        .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(182, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(f1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(f2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(f3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton14)
                .addGap(77, 77, 77))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(j_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(j_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addGap(30, 30, 30)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j_sub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c1)
                    .addComponent(f1))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j_sub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c2)
                    .addComponent(f2))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(j_sub3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c3)
                        .addComponent(f3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j_sub4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c4)
                    .addComponent(f4))
                .addGap(4, 4, 4)
                .addComponent(jButton14)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("July", jPanel9);

        jLabel3.setText("Student ID");

        jLabel4.setText("Student Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Semester 1");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Semester 2");

        jButton13.setText("SUBMIT");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        subj7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maths 2", "Econ 2" }));
        subj7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subj7ActionPerformed(evt);
            }
        });

        subj8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marketing 2" }));
        subj8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subj8ActionPerformed(evt);
            }
        });

        subj6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Econ", "Enhancement" }));
        subj6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subj6ActionPerformed(evt);
            }
        });

        subj1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Business Communication", "Business English" }));
        subj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subj1ActionPerformed(evt);
            }
        });

        subj2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Financial Accounting", "Economics" }));
        subj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subj2ActionPerformed(evt);
            }
        });

        subj5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Management IS", "Marketing" }));
        subj5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subj5ActionPerformed(evt);
            }
        });

        subj4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quality Management", "strategic management" }));
        subj4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subj4ActionPerformed(evt);
            }
        });

        subj3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Management Process", "Logistics Management" }));
        subj3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subj3ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("credits");

        fc1.setText("c");

        fc2.setText("c");

        fc3.setText("c");

        fc4.setText("c");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("fees");

        ff1.setText("$");

        ff2.setText("$");

        ff3.setText("$");

        ff4.setText("$");

        fc8.setText("c");

        fc6.setText("c");

        fc7.setText("c");

        fc5.setText("c");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("credits");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("fees");

        ff5.setText("$");

        ff6.setText("$");

        ff7.setText("$");

        ff8.setText("$");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(108, 108, 108)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(s_id, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(s_name))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subj2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(subj4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(subj3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(subj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(199, 199, 199)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ff2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ff3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ff4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(151, 151, 151)
                                        .addComponent(subj8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(ff1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(151, 151, 151)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(subj5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(subj6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(subj7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(57, 57, 57)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fc5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fc6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fc7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fc8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(74, 74, 74)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ff8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ff5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ff6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ff7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton13))
                                        .addGap(0, 37, Short.MAX_VALUE)))
                                .addGap(1, 1, Short.MAX_VALUE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(267, 267, 267))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fc3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fc4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(87, 87, 87)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(77, 77, 77))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subj5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(subj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fc1)
                                .addComponent(ff1)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subj2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fc2)
                            .addComponent(ff2)
                            .addComponent(subj6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fc6))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subj3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fc3)
                            .addComponent(ff3)
                            .addComponent(subj7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fc7)
                            .addComponent(ff7))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subj8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(subj4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fc4)
                                .addComponent(ff4)
                                .addComponent(fc8)
                                .addComponent(ff8))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(s_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(s_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fc5)
                            .addComponent(ff5))
                        .addGap(18, 18, 18)
                        .addComponent(ff6)))
                .addGap(18, 18, 18)
                .addComponent(jButton13)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("February", jPanel8);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Subject Registration", jPanel6);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Enter Student Name");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Enter Results");

        jButton4.setText("Enter");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Select Enrollment");

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "February", "July" }));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(566, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel14)
                .addGap(68, 68, 68)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(sName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton4)
                .addContainerGap(271, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Enter Results", jPanel15);

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm_green_uni/images/39821246_236678563694395_6441847496799944704_n.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel1)
                        .addGap(154, 154, 154)
                        .addComponent(jLabel19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(767, 767, 767)
                        .addComponent(jButton1)))
                .addContainerGap(868, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel19)))
                .addGap(33, 33, 33)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jButton1)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed
        
    }//GEN-LAST:event_jTable2KeyPressed

    private void update_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_pActionPerformed
        UpdatePostgraduate up=new UpdatePostgraduate();
        up.setVisible(true);
        up.setFields(stList2.get(Pos_Com.getSelectedRow()));
    }//GEN-LAST:event_update_pActionPerformed

    private void update_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_uActionPerformed
        UpdateUndergraduate uu=new UpdateUndergraduate();
        uu.setVisible(true);
        uu.setFields(stList.get(und_Com.getSelectedRow()));

    }//GEN-LAST:event_update_uActionPerformed

    private void und_ComMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_und_ComMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_und_ComMouseClicked

    private void delete_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_uActionPerformed
        DeleteUndergraduateC du=new DeleteUndergraduateC();
        du.setVisible(true);
        du.setFields(stList.get(und_Com.getSelectedRow()));
    }//GEN-LAST:event_delete_uActionPerformed

    private void view_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_pActionPerformed
        ViewPostgraduate vu=new ViewPostgraduate();
        vu.setVisible(true);
        vu.setFields(stList2.get(Pos_Com.getSelectedRow()));
        vu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_view_pActionPerformed

    private void delete_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_pActionPerformed
        DeletePostgraduateC dp=new DeletePostgraduateC();
        dp.setVisible(true);
        dp.setFields(stList2.get(Pos_Com.getSelectedRow()));
    }//GEN-LAST:event_delete_pActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        MainFrame mf=new MainFrame();
        mf.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        AddStudentComputing asb=new AddStudentComputing();
        asb.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        AddStudentComputing asb=new AddStudentComputing();
        asb.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.dispose();
        AddStaff as=new AddStaff();
        as.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
        AddStaff as=new AddStaff();
        as.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void view_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_uActionPerformed
       
        ViewUndergraduate vu=new ViewUndergraduate();
        vu.setVisible(true);
        vu.setFields(stList.get(und_Com.getSelectedRow()));
        vu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_view_uActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        String id=s_id.getText();
        String name=s_name.getText();
        
        
        String sub1=subj1.getSelectedItem().toString();
        String sub2=subj2.getSelectedItem().toString();
        String sub3=subj3.getSelectedItem().toString();
        String sub4=subj4.getSelectedItem().toString();
        String sub5=subj5.getSelectedItem().toString();
        String sub6=subj6.getSelectedItem().toString();
        String sub7=subj7.getSelectedItem().toString();
        String sub8=subj8.getSelectedItem().toString();
        try {
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
            String sql = "INSERT INTO `february_subjects` VALUES (?,?,?,?,?,?,?,?,?,?)";
            pst=con.prepareStatement(sql);

            pst.setString(1,id);
            pst.setString(2,name);
            
            pst.setString(3,sub1);
            pst.setString(4,sub2);
            pst.setString(5,sub3);
            pst.setString(6,sub4);
            pst.setString(7,sub5);
            pst.setString(8,sub6);
            pst.setString(9,sub7);
            pst.setString(10,sub8);
            pst.executeUpdate();
        }
        catch (Exception e){
            System.err.print(e);
        }

        JOptionPane.showMessageDialog(this, "Successfully saved");
        f_clearData();

    }//GEN-LAST:event_jButton13ActionPerformed

    private void subj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subj1ActionPerformed
        java.sql.Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
            String sql = "SELECT subjectName,Fees,Credit FROM subjects";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
            String sub = rs.getString("subjectName");
            String f = rs.getString("Fees");
            String cred = rs.getString("Credit");

            if (sub.equals(subj1.getSelectedItem().toString())) {
                fc1.setText(cred);
                ff1.setText(f);
            }
        }

        } catch (SQLException ex) {
            Logger.getLogger(StudentManagementCom.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_subj1ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        String id=j_id.getText();
        String name=j_name.getText();
        
        String sub1=j_sub1.getSelectedItem().toString();
        String sub2=j_sub2.getSelectedItem().toString();
        String sub3=j_sub3.getSelectedItem().toString();
        String sub4=j_sub4.getSelectedItem().toString();
        try {
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
            String sql = "INSERT INTO `july_subjects` VALUES (?,?,?,?,?,?)";
            pst=con.prepareStatement(sql);

            pst.setString(1,id);
            pst.setString(2,name);
            
            pst.setString(3,sub1);
            pst.setString(4,sub2);
            pst.setString(5,sub3);
            pst.setString(6,sub4);
            pst.executeUpdate();
        }
        catch (Exception e){
            System.err.print(e);
        }
        JOptionPane.showMessageDialog(this, "Successfully saved");
        j_clearData();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void subj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subj2ActionPerformed
        java.sql.Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
            String sql = "SELECT subjectName,Fees,Credit FROM subjects";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
            String sub = rs.getString("subjectName");
            String f = rs.getString("Fees");
            String cred = rs.getString("Credit");

            if (sub.equals(subj2.getSelectedItem().toString())) {
                fc2.setText(cred);
                ff2.setText(f);
            }
        }

        } catch (SQLException ex) {
            Logger.getLogger(StudentManagementCom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_subj2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String sname=sName.getText();
        String enr=month.getSelectedItem().toString();
        try{
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
            if(enr=="February"){
               String sql="SELECT name,subject1,subject2,subject3,subject4,subject5,subject6,subject7,subject8 FROM february_subjects";
               pst=con.prepareStatement(sql);
               rs=pst.executeQuery();
               while(rs.next()){
                   String mname=rs.getString("name");
                   String s1=rs.getString("subject1");
                   String s2=rs.getString("subject2");
                   String s3=rs.getString("subject3");
                   String s4=rs.getString("subject4");
                   String s5=rs.getString("subject5");
                   String s6=rs.getString("subject6");
                   String s7=rs.getString("subject7");
                   String s8=rs.getString("subject8");
                   if(sname.equals(mname)){
                       Results r=new Results(sname,s1,s2,s3,s4,s5,s6,s7,s8);
                        r.setVisible(true);
                        this.dispose();
                   }
                   
               }
            }
            else{
                    String sql="SELECT name,subject1,subject2,subject3,subject4 FROM july_subjects";
                    pst=con.prepareStatement(sql);
                    rs=pst.executeQuery();
               while(rs.next()){
                   String jname=rs.getString("name");
                   String s1=rs.getString("subject1");
                   String s2=rs.getString("subject2");
                   String s3=rs.getString("subject3");
                   String s4=rs.getString("subject4");
                   
                   if(sname.equals(jname)){
                   Results2 r=new Results2(sname,s1,s2,s3,s4);
                   r.setVisible(true);
                   this.dispose();  
               }
                       }
               
               
            }
            
        }
        catch (Exception e){
            System.err.print(e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void j_sub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_sub1ActionPerformed
       java.sql.Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
            String sql = "SELECT subjectName,Fees,Credit FROM subjects";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
            String sub = rs.getString("subjectName");
            String f = rs.getString("Fees");
            String cred = rs.getString("Credit");

            if (sub.equals(j_sub1.getSelectedItem().toString())) {
                c1.setText(cred);
                f1.setText(f);
            }
        }

        } catch (SQLException ex) {
            Logger.getLogger(StudentManagementCom.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_j_sub1ActionPerformed

    private void j_sub2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_sub2ActionPerformed
        java.sql.Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
            String sql = "SELECT subjectName,Fees,Credit FROM subjects";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
            String sub = rs.getString("subjectName");
            String f = rs.getString("Fees");
            String cred = rs.getString("Credit");

            if (sub.equals(j_sub2.getSelectedItem().toString())) {
                c2.setText(cred);
                f2.setText(f);
            }
        }

        } catch (SQLException ex) {
            Logger.getLogger(StudentManagementCom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_j_sub2ActionPerformed

    private void j_sub3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_sub3ActionPerformed
        java.sql.Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
            String sql = "SELECT subjectName,Fees,Credit FROM subjects";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
            String sub = rs.getString("subjectName");
            String f = rs.getString("Fees");
            String cred = rs.getString("Credit");

            if (sub.equals(j_sub3.getSelectedItem().toString())) {
                c3.setText(cred);
                f3.setText(f);
            }
        }

        } catch (SQLException ex) {
            Logger.getLogger(StudentManagementCom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_j_sub3ActionPerformed

    private void j_sub4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_sub4ActionPerformed
        java.sql.Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
            String sql = "SELECT subjectName,Fees,Credit FROM subjects";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
            String sub = rs.getString("subjectName");
            String f = rs.getString("Fees");
            String cred = rs.getString("Credit");

            if (sub.equals(j_sub4.getSelectedItem().toString())) {
                c4.setText(cred);
                f4.setText(f);
            }
        }

        } catch (SQLException ex) {
            Logger.getLogger(StudentManagementCom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_j_sub4ActionPerformed

    private void subj3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subj3ActionPerformed
        java.sql.Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
            String sql = "SELECT subjectName,Fees,Credit FROM subjects";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
            String sub = rs.getString("subjectName");
            String f = rs.getString("Fees");
            String cred = rs.getString("Credit");

            if (sub.equals(subj3.getSelectedItem().toString())) {
                fc3.setText(cred);
                ff3.setText(f);
            }
        }

        } catch (SQLException ex) {
            Logger.getLogger(StudentManagementCom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_subj3ActionPerformed

    private void subj4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subj4ActionPerformed
        java.sql.Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
            String sql = "SELECT subjectName,Fees,Credit FROM subjects";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
            String sub = rs.getString("subjectName");
            String f = rs.getString("Fees");
            String cred = rs.getString("Credit");

            if (sub.equals(subj4.getSelectedItem().toString())) {
                fc4.setText(cred);
                ff4.setText(f);
            }
        }

        } catch (SQLException ex) {
            Logger.getLogger(StudentManagementCom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_subj4ActionPerformed

    private void subj5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subj5ActionPerformed
        java.sql.Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
            String sql = "SELECT subjectName,Fees,Credit FROM subjects";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
            String sub = rs.getString("subjectName");
            String f = rs.getString("Fees");
            String cred = rs.getString("Credit");

            if (sub.equals(subj5.getSelectedItem().toString())) {
                fc5.setText(cred);
                ff5.setText(f);
            }
        }

        } catch (SQLException ex) {
            Logger.getLogger(StudentManagementCom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_subj5ActionPerformed

    private void subj6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subj6ActionPerformed
        java.sql.Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
            String sql = "SELECT subjectName,Fees,Credit FROM subjects";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
            String sub = rs.getString("subjectName");
            String f = rs.getString("Fees");
            String cred = rs.getString("Credit");

            if (sub.equals(subj6.getSelectedItem().toString())) {
                fc6.setText(cred);
                ff6.setText(f);
            }
        }

        } catch (SQLException ex) {
            Logger.getLogger(StudentManagementCom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_subj6ActionPerformed

    private void subj7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subj7ActionPerformed
        java.sql.Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
            String sql = "SELECT subjectName,Fees,Credit FROM subjects";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
            String sub = rs.getString("subjectName");
            String f = rs.getString("Fees");
            String cred = rs.getString("Credit");

            if (sub.equals(subj7.getSelectedItem().toString())) {
                fc7.setText(cred);
                ff7.setText(f);
            }
        }

        } catch (SQLException ex) {
            Logger.getLogger(StudentManagementCom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_subj7ActionPerformed

    private void subj8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subj8ActionPerformed
        java.sql.Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
            String sql = "SELECT subjectName,Fees,Credit FROM subjects";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
            String sub = rs.getString("subjectName");
            String f = rs.getString("Fees");
            String cred = rs.getString("Credit");

            if (sub.equals(subj8.getSelectedItem().toString())) {
                fc8.setText(cred);
                ff8.setText(f);
            }
        }

        } catch (SQLException ex) {
            Logger.getLogger(StudentManagementCom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_subj8ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentManagementCom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentManagementCom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentManagementCom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentManagementCom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentManagementCom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Pos_Com;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JButton delete_p;
    private javax.swing.JButton delete_u;
    private javax.swing.JLabel f1;
    private javax.swing.JLabel f2;
    private javax.swing.JLabel f3;
    private javax.swing.JLabel f4;
    private javax.swing.JLabel fc1;
    private javax.swing.JLabel fc2;
    private javax.swing.JLabel fc3;
    private javax.swing.JLabel fc4;
    private javax.swing.JLabel fc5;
    private javax.swing.JLabel fc6;
    private javax.swing.JLabel fc7;
    private javax.swing.JLabel fc8;
    private javax.swing.JLabel ff1;
    private javax.swing.JLabel ff2;
    private javax.swing.JLabel ff3;
    private javax.swing.JLabel ff4;
    private javax.swing.JLabel ff5;
    private javax.swing.JLabel ff6;
    private javax.swing.JLabel ff7;
    private javax.swing.JLabel ff8;
    private javax.swing.JTable ins_bus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField j_id;
    private javax.swing.JTextField j_name;
    private javax.swing.JComboBox<String> j_sub1;
    private javax.swing.JComboBox<String> j_sub2;
    private javax.swing.JComboBox<String> j_sub3;
    private javax.swing.JComboBox<String> j_sub4;
    private javax.swing.JTable lec_Bus;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JTextField sName;
    private javax.swing.JTextField s_id;
    private javax.swing.JTextField s_name;
    private javax.swing.JComboBox<String> subj1;
    private javax.swing.JComboBox<String> subj2;
    private javax.swing.JComboBox<String> subj3;
    private javax.swing.JComboBox<String> subj4;
    private javax.swing.JComboBox<String> subj5;
    private javax.swing.JComboBox<String> subj6;
    private javax.swing.JComboBox<String> subj7;
    private javax.swing.JComboBox<String> subj8;
    private javax.swing.JTable und_Com;
    private javax.swing.JButton update_p;
    private javax.swing.JButton update_u;
    private javax.swing.JButton view_p;
    private javax.swing.JButton view_u;
    // End of variables declaration//GEN-END:variables
}
