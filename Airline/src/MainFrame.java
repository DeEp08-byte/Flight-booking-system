
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.*;
import org.jdesktop.swingx.JXDatePicker;


public class MainFrame extends javax.swing.JFrame 
{

    /** Creates new form MainFrame */
    public MainFrame() {
        initComponents();
        new abc().execute();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Hompage = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        LoginPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        AdminHome = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        createEMP = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        charges = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        flights = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        EmpLoginPanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel33 = new javax.swing.JLabel();
        EmpHome = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jTextField17 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jButton32 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        res = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        ReservationPanel = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel52 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jButton33 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton34 = new javax.swing.JButton();
        AboutUs = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton35 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        Hompage.setBackground(new java.awt.Color(255, 255, 255));
        Hompage.setLayout(null);
        Hompage.add(jLabel2);
        jLabel2.setBounds(0, 0, 680, 460);

        getContentPane().add(Hompage, "card12");

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setLayout(null);

        jButton2.setBackground(new java.awt.Color(0, 51, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("Admin");
        jButton2.setMaximumSize(new java.awt.Dimension(200, 45));
        jButton2.setMinimumSize(new java.awt.Dimension(200, 45));
        jButton2.setPreferredSize(new java.awt.Dimension(200, 45));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        MainPanel.add(jButton2);
        jButton2.setBounds(400, 170, 200, 50);

        jButton3.setBackground(new java.awt.Color(0, 51, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(240, 240, 240));
        jButton3.setText("Employee");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        MainPanel.add(jButton3);
        jButton3.setBounds(400, 230, 200, 50);

        jButton4.setBackground(new java.awt.Color(0, 51, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(240, 240, 240));
        jButton4.setText("Get INfo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        MainPanel.add(jButton4);
        jButton4.setBounds(400, 290, 200, 50);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/How-to-Become-a-Air-Hostess-1.jpg"))); // NOI18N
        MainPanel.add(jLabel10);
        jLabel10.setBounds(-60, -10, 700, 450);

        getContentPane().add(MainPanel, "card3");

        LoginPanel.setBackground(new java.awt.Color(255, 255, 255));
        LoginPanel.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 51)));

        jLabel3.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Enter ID");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("Enter Password");

        jButton5.setBackground(new java.awt.Color(0, 255, 204));
        jButton5.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 51, 51));
        jButton5.setText("Login");
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton22.setText("Back");
        jButton22.setOpaque(false);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton22)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        LoginPanel.add(jPanel1);
        jPanel1.setBounds(410, 90, 220, 330);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        LoginPanel.add(jLabel1);
        jLabel1.setBounds(10, 0, 630, 440);

        getContentPane().add(LoginPanel, "card2");

        AdminHome.setBackground(new java.awt.Color(255, 255, 255));
        AdminHome.setPreferredSize(new java.awt.Dimension(640, 460));
        AdminHome.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                AdminHomeAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        AdminHome.setLayout(null);

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.setLayout(null);

        jButton12.setText("Employee");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12);
        jButton12.setBounds(50, 40, 120, 40);

        jButton13.setText("Flights");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13);
        jButton13.setBounds(50, 90, 120, 40);

        jButton14.setText("Change Password");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14);
        jButton14.setBounds(50, 140, 140, 40);

        jButton15.setText("Logout");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15);
        jButton15.setBounds(50, 190, 120, 40);

        AdminHome.add(jPanel2);
        jPanel2.setBounds(390, 130, 210, 280);

        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("Admin Home");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(10, 20, 200, 36);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/header_plane.jpg"))); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(0, 0, 620, 100);

        AdminHome.add(jPanel3);
        jPanel3.setBounds(10, 8, 620, 100);

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel4AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.setLayout(null);

        jButton1.setText("Create Employee");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(90, 60, 140, 36);

        jButton10.setText("Delete Employee");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton10);
        jButton10.setBounds(89, 122, 140, 35);

        jButton11.setText("view Employee");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton11);
        jButton11.setBounds(89, 184, 140, 38);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/wel.jpg"))); // NOI18N
        jPanel4.add(jLabel12);
        jLabel12.setBounds(0, -6, 350, 290);

        jButton6.setText("Add Flight");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6);
        jButton6.setBounds(110, 50, 120, 40);

        jButton7.setText("Delete Flight");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7);
        jButton7.setBounds(110, 100, 120, 40);

        jButton8.setText("Set Price");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8);
        jButton8.setBounds(110, 160, 120, 40);

        jLabel14.setFont(new java.awt.Font("Bauhaus 93", 1, 14)); // NOI18N
        jLabel14.setText("Enter Password");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(30, 80, 120, 21);
        jPanel4.add(jTextField3);
        jTextField3.setBounds(180, 80, 100, 30);

        jButton9.setText("Change");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton9);
        jButton9.setBounds(180, 130, 80, 30);

        AdminHome.add(jPanel4);
        jPanel4.setBounds(10, 130, 350, 280);

        getContentPane().add(AdminHome, "card4");

        createEMP.setBackground(new java.awt.Color(255, 255, 255));
        createEMP.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel16.setText("Employee Creation Form");
        createEMP.add(jLabel16);
        jLabel16.setBounds(189, 19, 246, 21);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel5.setLayout(null);

        jLabel8.setText("Employee Name");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(30, 30, 140, 16);

        jLabel7.setText("Employee Password");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(30, 60, 130, 16);

        jLabel5.setText("Date of Birth");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(31, 90, 110, 16);

        jLabel9.setText("Employee Address");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(30, 130, 130, 16);

        jLabel15.setText("Enter Contact No.");
        jPanel5.add(jLabel15);
        jLabel15.setBounds(40, 220, 140, 16);

        jLabel17.setText("Email ID");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(40, 250, 90, 16);

        jButton16.setText("Create");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton16);
        jButton16.setBounds(140, 290, 90, 30);
        jPanel5.add(jTextField2);
        jTextField2.setBounds(212, 30, 200, 22);
        jPanel5.add(jPasswordField2);
        jPasswordField2.setBounds(212, 60, 200, 22);

        jXDatePicker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePicker1ActionPerformed(evt);
            }
        });
        jPanel5.add(jXDatePicker1);
        jXDatePicker1.setBounds(212, 90, 200, 24);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(212, 120, 200, 83);
        jPanel5.add(jTextField4);
        jTextField4.setBounds(212, 220, 200, 22);
        jPanel5.add(jTextField5);
        jTextField5.setBounds(212, 250, 200, 22);

        jButton21.setText("Back");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton21);
        jButton21.setBounds(270, 290, 90, 30);

        createEMP.add(jPanel5);
        jPanel5.setBounds(50, 60, 530, 350);

        getContentPane().add(createEMP, "card5");

        charges.setBackground(new java.awt.Color(255, 255, 255));
        charges.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                chargesAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        charges.setLayout(null);

        jLabel24.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        jLabel24.setText("Set Flight Charges");
        charges.add(jLabel24);
        jLabel24.setBounds(220, 20, 164, 28);

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));
        jPanel6.setBorder(new javax.swing.border.MatteBorder(null));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel25.setText("Select Flight ID");

        jLabel26.setText("Flight Name");

        jLabel27.setText("Charges");

        jButton18.setText("Set");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel28.setText("From");

        jLabel29.setText("To");

        jButton19.setText("Back");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel26)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBox1, 0, 142, Short.MAX_VALUE)
                        .addComponent(jTextField12)
                        .addComponent(jTextField13)
                        .addComponent(jTextField14)
                        .addComponent(jTextField15))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton18)
                            .addComponent(jButton19)))
                    .addComponent(jLabel27))
                .addGap(39, 39, 39))
        );

        charges.add(jPanel6);
        jPanel6.setBounds(160, 110, 290, 310);

        getContentPane().add(charges, "card7");

        flights.setBackground(new java.awt.Color(255, 255, 255));
        flights.setLayout(null);

        jLabel6.setText("Add New Flight");
        flights.add(jLabel6);
        jLabel6.setBounds(290, 30, 90, 16);

        jPanel7.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel7.setLayout(null);
        jPanel7.add(jTextField6);
        jTextField6.setBounds(140, 20, 140, 22);

        jLabel18.setText("Flight ID");
        jPanel7.add(jLabel18);
        jLabel18.setBounds(30, 20, 47, 16);
        jPanel7.add(jTextField7);
        jTextField7.setBounds(140, 50, 140, 22);

        jLabel19.setText("Flight Name");
        jPanel7.add(jLabel19);
        jLabel19.setBounds(10, 50, 70, 16);

        jLabel20.setText("From");
        jPanel7.add(jLabel20);
        jLabel20.setBounds(30, 90, 30, 16);

        jLabel21.setText("To");
        jPanel7.add(jLabel21);
        jLabel21.setBounds(30, 120, 30, 16);
        jPanel7.add(jTextField8);
        jTextField8.setBounds(140, 150, 140, 22);

        jLabel22.setText("Seats");
        jPanel7.add(jLabel22);
        jLabel22.setBounds(30, 150, 32, 16);
        jPanel7.add(jTextField9);
        jTextField9.setBounds(140, 180, 140, 22);

        jLabel23.setText("Flight Type");
        jPanel7.add(jLabel23);
        jLabel23.setBounds(10, 180, 70, 16);

        jButton17.setText("Add");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton17);
        jButton17.setBounds(140, 230, 70, 30);
        jPanel7.add(jTextField10);
        jTextField10.setBounds(140, 80, 140, 22);
        jPanel7.add(jTextField11);
        jTextField11.setBounds(140, 110, 140, 22);

        jButton20.setText("Back");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton20);
        jButton20.setBounds(220, 230, 70, 30);

        flights.add(jPanel7);
        jPanel7.setBounds(130, 70, 360, 330);

        getContentPane().add(flights, "card6");

        EmpLoginPanel.setLayout(null);

        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));

        jLabel31.setBackground(new java.awt.Color(255, 0, 0));
        jLabel31.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 0, 0));
        jLabel31.setText("Enter ID");

        jLabel32.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 0, 0));
        jLabel32.setText("Enter Password");

        jButton23.setBackground(new java.awt.Color(255, 255, 255));
        jButton23.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 0, 0));
        jButton23.setText("Login");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setText("Back");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField16, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPasswordField3))
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        EmpLoginPanel.add(jPanel8);
        jPanel8.setBounds(400, 60, 220, 330);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login.png"))); // NOI18N
        jLabel33.setText("jLabel33");
        EmpLoginPanel.add(jLabel33);
        jLabel33.setBounds(0, -6, 640, 440);

        getContentPane().add(EmpLoginPanel, "card8");

        EmpHome.setBackground(new java.awt.Color(255, 255, 255));
        EmpHome.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                EmpHomeAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        EmpHome.setLayout(null);

        jPanel10.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel10.setLayout(null);

        jLabel34.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 51, 0));
        jLabel34.setText("Employee Home");
        jPanel10.add(jLabel34);
        jLabel34.setBounds(20, 30, 170, 28);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/header_plane.jpg"))); // NOI18N
        jPanel10.add(jLabel35);
        jLabel35.setBounds(0, 4, 600, 100);

        EmpHome.add(jPanel10);
        jPanel10.setBounds(20, 0, 600, 110);

        jPanel9.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel9.setLayout(null);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/wel.jpg"))); // NOI18N
        jLabel30.setText("jLabel30");
        jPanel9.add(jLabel30);
        jLabel30.setBounds(0, 20, 320, 280);

        jButton29.setText("New Reservation");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton29);
        jButton29.setBounds(70, 60, 140, 30);

        jButton30.setText("Cancel Reservation");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton30);
        jButton30.setBounds(70, 110, 140, 30);

        jButton31.setText("View Reservation");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton31);
        jButton31.setBounds(69, 160, 140, 30);

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField17);
        jTextField17.setBounds(170, 100, 120, 22);

        jLabel36.setText("Enter Password");
        jPanel9.add(jLabel36);
        jLabel36.setBounds(0, 100, 140, 16);

        jButton32.setText("change Password");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton32);
        jButton32.setBounds(110, 140, 120, 25);

        EmpHome.add(jPanel9);
        jPanel9.setBounds(30, 130, 320, 300);

        jPanel11.setBackground(new java.awt.Color(204, 255, 204));
        jPanel11.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel11.setLayout(null);

        jButton25.setText("view Flight");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton25);
        jButton25.setBounds(40, 40, 120, 30);

        jButton26.setText("Reservation");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton26);
        jButton26.setBounds(40, 100, 120, 30);

        jButton27.setText("change Password");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton27);
        jButton27.setBounds(40, 160, 140, 30);

        jButton28.setText("Logout");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton28);
        jButton28.setBounds(40, 210, 120, 30);

        EmpHome.add(jPanel11);
        jPanel11.setBounds(400, 130, 220, 290);

        getContentPane().add(EmpHome, "card9");

        res.setBackground(new java.awt.Color(255, 255, 255));
        res.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                resAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        res.setLayout(null);

        jLabel37.setText("Reservation");
        res.add(jLabel37);
        jLabel37.setBounds(280, 0, 90, 16);

        jPanel12.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel12.setLayout(null);

        ReservationPanel.setBorder(new javax.swing.border.MatteBorder(null));
        ReservationPanel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ReservationPanelAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        ReservationPanel.setLayout(null);

        jLabel38.setText("select FID");
        ReservationPanel.add(jLabel38);
        jLabel38.setBounds(18, 10, 80, 16);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        ReservationPanel.add(jComboBox2);
        jComboBox2.setBounds(190, 10, 60, 22);

        jLabel39.setText("Flight Name");
        ReservationPanel.add(jLabel39);
        jLabel39.setBounds(20, 40, 80, 16);

        jLabel40.setText("jLabel40");
        ReservationPanel.add(jLabel40);
        jLabel40.setBounds(190, 40, 80, 16);

        jLabel41.setText("From");
        ReservationPanel.add(jLabel41);
        jLabel41.setBounds(20, 70, 50, 16);

        jLabel42.setText("jLabel42");
        ReservationPanel.add(jLabel42);
        jLabel42.setBounds(200, 80, 48, 16);

        jLabel43.setText("To");
        ReservationPanel.add(jLabel43);
        jLabel43.setBounds(320, 80, 40, 16);

        jLabel44.setText("Destination");
        ReservationPanel.add(jLabel44);
        jLabel44.setBounds(410, 80, 63, 16);

        jLabel45.setText("Total seats");
        ReservationPanel.add(jLabel45);
        jLabel45.setBounds(20, 100, 70, 16);

        jLabel46.setText("jLabel46");
        ReservationPanel.add(jLabel46);
        jLabel46.setBounds(200, 120, 48, 16);

        jLabel47.setText("Available seats");
        ReservationPanel.add(jLabel47);
        jLabel47.setBounds(20, 160, 90, 20);

        jLabel48.setText("jLabel48");
        ReservationPanel.add(jLabel48);
        jLabel48.setBounds(200, 160, 48, 16);

        jPanel12.add(ReservationPanel);
        ReservationPanel.setBounds(10, 40, 530, 220);

        jPanel13.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel13.setLayout(null);

        jLabel50.setText("Individual charges");
        jPanel13.add(jLabel50);
        jLabel50.setBounds(38, 12, 103, 16);

        jLabel51.setText("jLabel51");
        jPanel13.add(jLabel51);
        jLabel51.setBounds(210, 10, 48, 16);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No. of Passengers", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel13.add(jComboBox3);
        jComboBox3.setBounds(30, 40, 140, 22);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select a class", "Business", "Economy" }));
        jPanel13.add(jComboBox4);
        jComboBox4.setBounds(320, 10, 130, 22);

        jLabel52.setText("Total Amount");
        jPanel13.add(jLabel52);
        jLabel52.setBounds(320, 50, 80, 16);

        jLabel49.setText("jLabel49");
        jPanel13.add(jLabel49);
        jLabel49.setBounds(410, 40, 80, 20);

        jPanel12.add(jPanel13);
        jPanel13.setBounds(10, 270, 530, 100);

        jButton33.setText("Next");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton33);
        jButton33.setBounds(460, 370, 79, 25);

        res.add(jPanel12);
        jPanel12.setBounds(30, 20, 580, 400);

        jPanel14.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel14.setLayout(null);

        jLabel53.setText("Name");
        jPanel14.add(jLabel53);
        jLabel53.setBounds(50, 20, 40, 16);

        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        jPanel14.add(jTextField18);
        jTextField18.setBounds(150, 20, 190, 22);

        jLabel54.setText("contact no");
        jPanel14.add(jLabel54);
        jLabel54.setBounds(30, 70, 70, 16);
        jPanel14.add(jTextField19);
        jTextField19.setBounds(150, 70, 190, 22);

        jLabel55.setText("Email ID");
        jPanel14.add(jLabel55);
        jLabel55.setBounds(30, 110, 50, 16);
        jPanel14.add(jTextField20);
        jTextField20.setBounds(150, 110, 190, 22);

        jLabel56.setText("Address");
        jPanel14.add(jLabel56);
        jLabel56.setBounds(30, 150, 46, 16);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel14.add(jScrollPane2);
        jScrollPane2.setBounds(150, 140, 200, 80);

        jButton34.setText("Reserve");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton34);
        jButton34.setBounds(150, 260, 79, 25);

        res.add(jPanel14);
        jPanel14.setBounds(30, 20, 580, 410);

        getContentPane().add(res, "card10");

        AboutUs.setBackground(new java.awt.Color(255, 255, 255));
        AboutUs.setLayout(null);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel58.setBackground(new java.awt.Color(255, 255, 255));
        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.png"))); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        AboutUs.add(jPanel16);
        jPanel16.setBounds(0, 0, 626, 132);

        jPanel17.setBorder(new javax.swing.border.MatteBorder(null));

        jTextPane2.setEditable(false);
        jTextPane2.setText("This Project was successfully \ncompleted under the guidance of \n\nMr. Sharad Pandey\n\n Project By:\nDEEPAK SINGH(322)\nGOURAV(330)                  \n");
        jScrollPane4.setViewportView(jTextPane2);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AboutUs.add(jPanel17);
        jPanel17.setBounds(470, 185, 160, 245);

        jPanel18.setBorder(new javax.swing.border.MatteBorder(null));

        jTextPane1.setEditable(false);
        jTextPane1.setText("GITSTEIN Technologies pvt ltd was set up in 2015 by young Indian \nentrepreneurs. It has pioneered the concept of high\nquality IT education in North India and has trained\n over 10,000 plus networking, embedded systems & software\nprofessionals in the country.\n\nIt has been in the forefront of higher education in North India and\n boasts of a learning environment that represents a\nunique blend of distinguished faculty, brilliant students with strong\n industry collaborations.");
        jScrollPane3.setViewportView(jTextPane1);

        jButton35.setText("Back To Home");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jButton35)
                .addContainerGap(191, Short.MAX_VALUE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton35)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        AboutUs.add(jPanel18);
        jPanel18.setBounds(0, 184, 457, 250);

        getContentPane().add(AboutUs, "card11");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        MainPanel.setVisible(false);
        
        EmpLoginPanel.setVisible(true);
        
        MainPanel.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        MainPanel.setVisible(false);
        AboutUs.setVisible(true);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LoginPanel.setVisible(true);
        MainPanel.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        
        String name=jTextField1.getText();
        String password=jPasswordField1.getText();
        try{
            boolean valid=false;
            Connection con= NewClass.getConnection();
             Statement stmt= con.createStatement();
             ResultSet rs= stmt.executeQuery("select * from admin");
            while(rs.next())
            {
            if(name.equals(rs.getString(1)) && password.equals(rs.getString(2)))
            {
            valid=true;
            }
            
            }
            if(valid==true)
            {
            LoginPanel.setVisible(false);
            MainPanel.setVisible(false);
            AdminHome.setVisible(true);
            }
             else
            {
            JOptionPane.showMessageDialog(null, "Invalid User");
           // jTextField1.setText("");
jPasswordField1.setText("");

            }
            
        }
        catch(Exception e)
        {
        System.out.println(e);
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void AdminHomeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_AdminHomeAncestorAdded

         jLabel14.setVisible(false);
        jTextField3.setVisible(false);
        jButton9.setVisible(false);
        jLabel14.setVisible(false);
        jTextField3.setVisible(false);
        jButton9.setVisible(false);
          jButton6.setVisible(false);
            jButton7.setVisible(false);
            jButton8.setVisible(false);
            
        jButton1.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminHomeAncestorAdded

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        
         jLabel14.setVisible(false);
        jTextField3.setVisible(false);
        jButton9.setVisible(false);
            jButton6.setVisible(false);
            jButton7.setVisible(false);
            jButton8.setVisible(false);
            
        jLabel12.setVisible(false);
           jButton1.setVisible(true);
        jButton10.setVisible(true);
        jButton11.setVisible(true);
       
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

         jLabel14.setVisible(false);
        jTextField3.setVisible(false);
        jButton9.setVisible(false);
        jLabel12.setVisible(false);
          jButton1.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
           jButton6.setVisible(true);
            jButton7.setVisible(true);
            jButton8.setVisible(true);
            
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jPanel4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel4AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4AncestorAdded

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
jLabel12.setVisible(false);
           jLabel14.setVisible(true);
        jTextField3.setVisible(true);
        jButton9.setVisible(true);
       
        jLabel14.setVisible(false);
        jTextField3.setVisible(false);
        jButton9.setVisible(false);
          jButton6.setVisible(false);
            jButton7.setVisible(false);
            jButton8.setVisible(false);
            
        jButton1.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
           jLabel14.setVisible(true);
        jTextField3.setVisible(true);
        jButton9.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         LoginPanel.setVisible(false);
            MainPanel.setVisible(false);
            AdminHome.setVisible(false);
            createEMP.setVisible(true);
        
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
jLabel12.setVisible(true);
        jTextField1.setText("");
jPasswordField1.setText("");
        LoginPanel.setVisible(false);
            MainPanel.setVisible(true);
            AdminHome.setVisible(false);
            createEMP.setVisible(false); 
        



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        try{
            String pass=jTextField3.getText();
        String name="admin";
        
            Connection con= NewClass.getConnection();
             Statement stmt= con.createStatement();
             stmt.executeUpdate("update admin set password='"+pass+"' where username='"+name+"'");
        JOptionPane.showMessageDialog(null, "password Changed");
        jTextField3.setText("");
        }
        catch(Exception e)
        {
            System.out.println(e);
        
        }
        
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

        String name=jTextField2.getText();
        String password=jPasswordField2.getText();
        Date d=jXDatePicker1.getDate();
        String dob=d.getDay()+"/"+d.getMonth()+"/"+d.getYear();
        String address=jTextArea1.getText();
        String contact=jTextField4.getText();
        String email=jTextField5.getText();
        
          try{
           
          
            Connection con= NewClass.getConnection();
             Statement stmt= con.createStatement();
             stmt.executeUpdate("insert into empreg (name,password,dob,address,contact,email) values('"+name+"','"+password+"','"+dob+"','"+address+"','"+contact+"','"+email+"')");

      jLabel12.setVisible(true);
           LoginPanel.setVisible(false);
            MainPanel.setVisible(false);
            AdminHome.setVisible(true);
            createEMP.setVisible(false);
    
        }
        catch(Exception e)
        {
            System.out.println(e);
        
        }
          String id="";
try{

            Connection con= NewClass.getConnection();
             Statement stmt= con.createStatement();
              ResultSet rs= stmt.executeQuery("select empid from empreg where name='"+name+"'");
             while(rs.next())
             {
             
             id=rs.getString(1);
             }
             JOptionPane.showMessageDialog(null, "Employee Account Create EmpID id='"+id+"'");
}
catch(Exception e)
{}
          final String username = "ds8360680715@gmail.com";
		final String passw = "8360680715";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, passw);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("deepaky1246@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(email));
			message.setSubject("Auth Info");
			message.setText("Dear '"+name+"', \n"+
                                "Your Username ID '"+id+"' and Password is '"+password+"'+"
                                + "Regards,"
                                
                                + "Airline xyz");

			Transport.send(message);
            JOptionPane.showMessageDialog(null," mail sent");
           

			

		}
        catch (MessagingException e) {

		}


        
        
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
try{
         String id= JOptionPane.showInputDialog("Enter Employee ID");
          Connection con= NewClass.getConnection();
             Statement stmt= con.createStatement();
             stmt.executeUpdate("delete from empreg where empid='"+id+"'");
        JOptionPane.showMessageDialog(null, "Employee Deleted");
}
catch(Exception e)
{}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed

           String fid=jTextField6.getText();
        String fname=jTextField7.getText();
        String ffrom=jTextField10.getText();
        String fto=jTextField11.getText();
        String tseats=jTextField8.getText();
        String ftype=jTextField9.getText();
        
        String aseats=tseats;
        
        try{
          Connection con= NewClass.getConnection();
             Statement stmt= con.createStatement();
             stmt.executeUpdate("insert into flight (fid,fname,ffrom,fto,tseats,aseats,ftupe) values('"+fid+"','"+fname+"','"+ffrom+"','"+fto+"','"+tseats+"','"+aseats+"','"+ftype+"')");
             
             
        JOptionPane.showMessageDialog(null, "Flight Added");
        jLabel12.setVisible(true);  
        LoginPanel.setVisible(false);
            MainPanel.setVisible(false);
            flights.setVisible(false);
            AdminHome.setVisible(true);
            createEMP.setVisible(false);
}
catch(Exception e)
{
System.out.println(e);
}
        
     
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        
         LoginPanel.setVisible(false);
            MainPanel.setVisible(false);
            flights.setVisible(true);
            AdminHome.setVisible(false);
            createEMP.setVisible(false);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        
        String fid=JOptionPane.showInputDialog("Enter Flight Id");
        
               
        try{
          Connection con= NewClass.getConnection();
             Statement stmt= con.createStatement();
             stmt.executeUpdate("delete from flight where fid='"+fid+"'");
             
             
        JOptionPane.showMessageDialog(null, "Flight Deleted");

}
catch(Exception e)
{
System.out.println(e);
}
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void chargesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_chargesAncestorAdded

        
       
          try{
          Connection con= NewClass.getConnection();
             Statement stmt= con.createStatement();
             ResultSet rs=stmt.executeQuery("select fid from flight");
              while (rs.next()) {
                  jComboBox1.addItem(rs.getString(1));
                  
              }
             
             
             
}
catch(Exception e)
{
System.out.println(e);
}
        
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_chargesAncestorAdded

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        
        
         LoginPanel.setVisible(false);
            MainPanel.setVisible(false);
            flights.setVisible(false);
            AdminHome.setVisible(false);
            createEMP.setVisible(false);
        
        charges.setVisible(true);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        
          try{
              String id=(String)jComboBox1.getSelectedItem();
          Connection con= NewClass.getConnection();
             Statement stmt= con.createStatement();
             ResultSet rs=stmt.executeQuery("select fname,ffrom,fto from flight where fid='"+id+"'");
              while (rs.next()) {
                
                  jTextField12.setText(rs.getString(1));
                  jTextField14.setText(rs.getString(2));
                  jTextField15.setText(rs.getString(3));
              }
             
             
             
}
catch(Exception e)
{
System.out.println(e);
}
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed

          try{
              
              
              String fid=(String)jComboBox1.getSelectedItem();
              String fname=jTextField12.getText();
              String ffrom=jTextField14.getText();
              String fto=jTextField15.getText();
              String charge=jTextField13.getText();
          Connection con= NewClass.getConnection();
             Statement stmt= con.createStatement();
            stmt.executeUpdate("insert into charges values('"+fid+"','"+fname+"','"+ffrom+"','"+fto+"','"+charge+"')");
             
             JOptionPane.showMessageDialog(null, "change Updated");
             
             jComboBox1.removeAllItems();
             jTextField12.setText("");
             jTextField14.setText("");
             jTextField15.setText("");
              jTextField13.setText("");
              
             jLabel12.setVisible(true);
              LoginPanel.setVisible(false);
            MainPanel.setVisible(false);
            flights.setVisible(false);
            AdminHome.setVisible(true);
            createEMP.setVisible(false);
        
       charges.setVisible(false);
}
catch(Exception e)
{
System.out.println(e);
}
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed

         jComboBox1.removeAllItems();
             jTextField12.setText("");
             jTextField14.setText("");
             jTextField15.setText("");
              jTextField13.setText("");
              
             jLabel12.setVisible(true);
              LoginPanel.setVisible(false);
            MainPanel.setVisible(false);
            flights.setVisible(false);
            AdminHome.setVisible(true);
            createEMP.setVisible(false);
        
       charges.setVisible(false);
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed

    
              
             jLabel12.setVisible(true);
              LoginPanel.setVisible(false);
            MainPanel.setVisible(false);
            flights.setVisible(false);
            AdminHome.setVisible(true);
            createEMP.setVisible(false);
        
       charges.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed

         jComboBox1.removeAllItems();
             jTextField12.setText("");
             jTextField14.setText("");
             jTextField15.setText("");
              jTextField13.setText("");
              
             jLabel12.setVisible(true);
              LoginPanel.setVisible(false);
            MainPanel.setVisible(false);
            flights.setVisible(false);
            AdminHome.setVisible(true);
            createEMP.setVisible(false);
        
       charges.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed

         
              
              LoginPanel.setVisible(false);
            MainPanel.setVisible(true);
            flights.setVisible(false);
            AdminHome.setVisible(false);
            createEMP.setVisible(false);
        
       charges.setVisible(false);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
jLabel30.setVisible(true);
         
        String id=jTextField16.getText();
        String password=jPasswordField3.getText();
        try{
            boolean valid=false;
            Connection con= NewClass.getConnection();
             Statement stmt= con.createStatement();
             ResultSet rs= stmt.executeQuery("select * from empreg");
            while(rs.next())
            {
            if(id.equals(rs.getString(1)) && password.equals(rs.getString(3)))
            {
            valid=true;
            }
           
           
            }
             if(valid==true)
            {
           EmpLoginPanel.setVisible(false);
            MainPanel.setVisible(false);
           EmpHome.setVisible(true);
            }
             else
            {
            JOptionPane.showMessageDialog(null, "Invalid User");
          //  jTextField16.setText("");
jPasswordField3.setText("");

            }
        }
        catch(Exception e)
        {
        System.out.println(e);
        } 
      
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed

        EmpLoginPanel.setVisible(false);
        MainPanel.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden

        
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void EmpHomeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_EmpHomeAncestorAdded
jTextField17.setVisible(false);
jButton32.setVisible(false);
jLabel36.setVisible(false);
        jButton29.setVisible(false);
        jButton30.setVisible(false);
        jButton31.setVisible(false);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpHomeAncestorAdded

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed

        
       jTextField17.setVisible(false);
       jButton32.setVisible(false);
       jLabel36.setVisible(false);
        jLabel30.setVisible(false);
          jButton29.setVisible(true);
        jButton30.setVisible(true);
        jButton31.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed

         try{
              Vector columnNames = new Vector();
            Vector data = new Vector();
       
          Connection con= NewClass.getConnection();
             Statement stmt= con.createStatement();
             ResultSet rs=stmt.executeQuery("select * from flight");
              ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();
            for (int i = 1; i <= columns; i++) {
                columnNames.addElement(md.getColumnName(i));
            }
               while (rs.next()) {
                Vector row = new Vector(columns);
                for (int i = 1; i <= columns; i++) {
                    row.addElement(rs.getObject(i));
                }
                data.addElement(row);
            }
            JTable table = new JTable(data, columnNames);
            System.out.println("good");
            JScrollPane js = new JScrollPane(table);
            JFrame jf = new JFrame("Result");
            jf.setLayout(new FlowLayout());

            jf.add(js);
            jf.pack();
            jf.setVisible(true);   
             
             
             
}
catch(Exception e)
{
System.out.println(e);
}
        
        
        
        
        
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        
         try{
              Vector columnNames = new Vector();
            Vector data = new Vector();
       
          Connection con= NewClass.getConnection();
             Statement stmt= con.createStatement();
             ResultSet rs=stmt.executeQuery("select * from empreg");
              ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();
            for (int i = 1; i <= columns; i++) {
                columnNames.addElement(md.getColumnName(i));
            }
               while (rs.next()) {
                Vector row = new Vector(columns);
                for (int i = 1; i <= columns; i++) {
                    row.addElement(rs.getObject(i));
                }
                data.addElement(row);
            }
            JTable table = new JTable(data, columnNames);
            System.out.println("good");
            JScrollPane js = new JScrollPane(table);
            JFrame jf = new JFrame("Result");
            jf.setLayout(new FlowLayout());

            jf.add(js);
            jf.pack();
            jf.setVisible(true);   
             
             
             
}
catch(Exception e)
{
System.out.println(e);
}
        
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed

        
        
        
       jTextField17.setVisible(true);
       jButton32.setVisible(true);
       jLabel36.setVisible(true);
        jButton29.setVisible(false);
        
        jButton30.setVisible(false);
        
        jButton31.setVisible(false);
        jLabel30.setVisible(false);
        
      
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed

        
          
        String pass=jTextField17.getText();
        String id=jTextField16.getText();
        try{
        
          Connection con= NewClass.getConnection();
             Statement stmt= con.createStatement();
             stmt.executeUpdate("update empreg set password='"+pass+"' where empid='"+id+"'");
             JOptionPane.showMessageDialog(null, "Password Changed");
        jTextField17.setText("");
        
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
    
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed

        
        jTextField16.setText("");
        jPasswordField3.setText("");
        
        
        EmpHome.setVisible(false);
         EmpLoginPanel.setVisible(false);
        MainPanel.setVisible(true);
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void ReservationPanelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ReservationPanelAncestorAdded

        try
        {
        
          Connection con= NewClass.getConnection();
             Statement stmt= con.createStatement();
             ResultSet rs=stmt.executeQuery("select fid from flight");
        while(rs.next())
        {
        
        jComboBox2.addItem(rs.getString(1));
        
        }
        
        
        
        
        }
        catch(Exception e)
        {}
        
        
      
        // TODO add your handling code here:
    }//GEN-LAST:event_ReservationPanelAncestorAdded

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed

        
         EmpHome.setVisible(false);
         EmpLoginPanel.setVisible(false);
        MainPanel.setVisible(false);
        res.setVisible(true);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed


try{
String id=(String)jComboBox2.getSelectedItem();

          Connection con= NewClass.getConnection();
             Statement stmt= con.createStatement();
             ResultSet rs=stmt.executeQuery("select * from flight where fid='"+id+"'");
        while(rs.next())
        {
        
        jLabel40.setText(rs.getString(2));
        jLabel42.setText(rs.getString(3));
        jLabel44.setText(rs.getString(4));
        jLabel46.setText(rs.getString(5));
        jLabel48.setText(rs.getString(6));
          
        }




}
catch(Exception e)
{

System.out.println(e);
}
try{
String id=(String)jComboBox2.getSelectedItem();

          Connection con= NewClass.getConnection();
             Statement stmt= con.createStatement();
             ResultSet rs=stmt.executeQuery("select charges from charges  where fid='"+id+"'");
        while(rs.next())
        {
    jLabel51.setText(rs.getString(1));
          
        }




}
catch(Exception e)
{

System.out.println(e);
}










     // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
 int ic= Integer.parseInt(jLabel51.getText());
           String temp=(String) jComboBox3.getSelectedItem();
     int nop= Integer.parseInt(temp);
        try{
         boolean available=false;
         int seats;
          Connection con= NewClass.getConnection();
             Statement stmt= con.createStatement();
             String id=(String) jComboBox2.getSelectedItem();
             ResultSet rs=stmt.executeQuery("select aseats from flight where fid='"+id+"'");
       while(rs.next())
       {
          if(rs.getInt(1)>=nop)
          {
          available=true;
          }
     }
      
   if(available==false)
   {
   JOptionPane.showMessageDialog(null, "seats not Available");
   }
   else     
        
   {  
        
           if(temp.equals("No. of Passengers"))
           {
            jLabel49.setText("0");
        
           }
           else{
       
        int ta=ic*nop;
        String r=Integer.toString(ta);
        jLabel49.setText(r);
           }    
       
           }
        }
        catch(Exception e)
        {}
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
String daseats="";
        String fname=jLabel40.getText();
           String ffrom= jLabel42.getText();
        String fto=jLabel44.getText();
        String aseats=jLabel48.getText();
        String icharges=jLabel51.getText();
        String fclass=(String)jComboBox4.getSelectedItem();
        String nop=(String) jComboBox3.getSelectedItem();
        String tamount=jLabel49.getText();
        
        String pname=jTextField18.getText();
        String contact =jTextField19.getText();
        String email=jTextField20.getText();
        String address=jTextArea2.getText();
        
try{

      Connection con= NewClass.getConnection();
      String q="insert into res (fname,ffrom,fto,aseats,icharges,class,nop,tamount,pname,pcontact,pemail,paddress) values(?,?,?,?,?,?,?,?,?,?,?,?) ";
      
         PreparedStatement ps=  con.prepareStatement(q);
ps.setString(1, fname);
ps.setString(2, ffrom);
ps.setString(3, fto);
ps.setString(4, aseats);
ps.setString(5,icharges);
ps.setString(6,fclass );
ps.setString(7, nop);
ps.setString(8, tamount);
ps.setString(9, pname);
ps.setString(10, contact);
ps.setString(11, email);
ps.setString(12, address);
ps.executeUpdate();
}           



catch(Exception e)
{


}

try{
String fid=(String) jComboBox2.getSelectedItem();
 Connection con= NewClass.getConnection();
        Statement stmt= con.createStatement();
   ResultSet rs=   stmt.executeQuery("select aseats from flight where fid='"+fid+"'");
      while(rs.next())
      {
      daseats=rs.getString(1);
      System.out.println(aseats);
      }
      System.out.println(nop);
      
  int newaseats= Integer.parseInt(daseats)-Integer.parseInt(nop);
stmt.executeUpdate("update flight set aseats='"+newaseats+"' where fid='"+fid+"'");
System.out.println(newaseats);
    } 
catch(Exception e)
{

System.out.println(e);
}




JOptionPane.showMessageDialog(null, "Reservation Done");
jPanel12.setVisible(true);
        jPanel14.setVisible(true);
        jLabel30.setVisible(true);
            EmpHome.setVisible(true);
         EmpLoginPanel.setVisible(false);
        MainPanel.setVisible(false);
     res.setVisible(false);

     
     
     

        
        
        
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed

        jPanel12.setVisible(false);
        jPanel14.setVisible(true);
        
            EmpHome.setVisible(false);
         EmpLoginPanel.setVisible(false);
        MainPanel.setVisible(false);
     
        
        
        
    
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed

    private void resAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_resAncestorAdded

        
         jPanel12.setVisible(true);
        jPanel14.setVisible(false);
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_resAncestorAdded

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed

        String fid=JOptionPane.showInputDialog("Enter FID");
        String resID=JOptionPane.showInputDialog("Enter Reservation ID");
       String raseats="";
        try{
        Connection con= NewClass.getConnection();
        Statement stmt= con.createStatement();
         ResultSet rs=  stmt.executeQuery("select aseats from res where rid='"+resID+"'");
        while(rs.next())
        {
        raseats=rs.getString(1);
        }
        
  stmt.executeUpdate("delete from res where rid='"+resID+"'");
        
      
        }
        catch(Exception e)
        {}
        try{
        String das="";
Connection con= NewClass.getConnection();
        Statement stmt= con.createStatement();
      ResultSet rs= stmt.executeQuery("select aseats from flight where fid='"+fid+"'");
     while(rs.next())
     {
       das= rs.getString(1);
     
     }
        int naseats= Integer.parseInt(das)+ Integer.parseInt(raseats);
        stmt.executeUpdate("update flight set aseats='"+naseats+"' where fid='"+fid+"'");
        JOptionPane.showMessageDialog(null, "Reservation cancelled");
        }
        catch(Exception e)
        {
        System.out.println(e);
        System.out.println(e);
        }
        
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed

         try{
              Vector columnNames = new Vector();
            Vector data = new Vector();
       
          Connection con= NewClass.getConnection();
             Statement stmt= con.createStatement();
             ResultSet rs=stmt.executeQuery("select * from res");
              ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();
            for (int i = 1; i <= columns; i++) {
                columnNames.addElement(md.getColumnName(i));
            }
               while (rs.next()) {
                Vector row = new Vector(columns);
                for (int i = 1; i <= columns; i++) {
                    row.addElement(rs.getObject(i));
                }
                data.addElement(row);
            }
            JTable table = new JTable(data, columnNames);
            System.out.println("good");
            JScrollPane js = new JScrollPane(table);
            JFrame jf = new JFrame("Result");
            jf.setLayout(new FlowLayout());

            jf.add(js);
            jf.pack();
            jf.setVisible(true);   
             
             
             
}
catch(Exception e)
{
System.out.println(e);
} 
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed

          MainPanel.setVisible(true);
        AboutUs.setVisible(false);
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jXDatePicker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXDatePicker1ActionPerformed

    /**
    * @param args the command line arguments

     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AboutUs;
    private javax.swing.JPanel AdminHome;
    private javax.swing.JPanel EmpHome;
    private javax.swing.JPanel EmpLoginPanel;
    private javax.swing.JPanel Hompage;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel ReservationPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel charges;
    private javax.swing.JPanel createEMP;
    private javax.swing.JPanel flights;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JPanel res;
    // End of variables declaration//GEN-END:variables

    
    
    class abc extends SwingWorker<Object, Object>
    {

        @Override
        protected Object doInBackground() throws Exception {
           int i=1;
            while (i<4) {                
                
                try {
                    
                   BufferedImage bim = ImageIO.read(new File("C:\\Users\\DEEPAK YADAV\\Documents\\image"+i+".jpg"));
               Image img =      bim.getScaledInstance( jLabel2.getWidth(), jLabel2.getHeight(),Image.SCALE_DEFAULT);
               jLabel2.setIcon(new ImageIcon(img));
               i++;
                    Thread.sleep(2000);
               
               if(i==4)
                MainPanel.setVisible(true);
               Hompage.setVisible(false);
                   
                   
                } catch (Exception e) {
                }
                
                
            }
   
            
            
            return null;
         
        }
        
    }
    
}
