
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import project.connectionProvider;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Thilangi
 */
public class usersign extends javax.swing.JFrame {

    /**
     * Creates new form usersign
     */
    public usersign() {
        initComponents();

        //create a button group for radio button
        ButtonGroup bg = new ButtonGroup();
        bg.add(Radiomale);
        bg.add(Radiofemale);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        stuloginclosebtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        emailreg = new javax.swing.JTextField();
        conpasswordreg = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        passwordreg = new javax.swing.JPasswordField();
        usernamereg = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        usersignupbtn = new javax.swing.JButton();
        Radiomale = new javax.swing.JRadioButton();
        Radiofemale = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Curlz MT", 1, 65)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("QUICK QUIZ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Test your knowledge on math with this simple quiz ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image 1.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        stuloginclosebtn.setBackground(new java.awt.Color(255, 255, 255));
        stuloginclosebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_delete_40px_1.png"))); // NOI18N
        stuloginclosebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stuloginclosebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stuloginclosebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stuloginclosebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stuloginclosebtnMouseExited(evt);
            }
        });
        jPanel2.add(stuloginclosebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 500));

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));
        jPanel3.setForeground(new java.awt.Color(204, 255, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(450, 500));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emailreg.setBackground(new java.awt.Color(204, 0, 0));
        emailreg.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        emailreg.setForeground(new java.awt.Color(255, 255, 255));
        emailreg.setText("Email");
        emailreg.setBorder(null);
        emailreg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailregFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailregFocusLost(evt);
            }
        });
        jPanel3.add(emailreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 250, -1));

        conpasswordreg.setBackground(new java.awt.Color(204, 0, 0));
        conpasswordreg.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        conpasswordreg.setForeground(new java.awt.Color(255, 255, 255));
        conpasswordreg.setText("Password");
        conpasswordreg.setBorder(null);
        conpasswordreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conpasswordregActionPerformed(evt);
            }
        });
        conpasswordreg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                conpasswordregFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                conpasswordregFocusLost(evt);
            }
        });
        jPanel3.add(conpasswordreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 250, -1));

        jSeparator1.setBackground(new java.awt.Color(204, 255, 204));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 250, 20));

        jSeparator2.setBackground(new java.awt.Color(204, 255, 204));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 250, 20));

        jPanel5.setBackground(new java.awt.Color(0, 153, 0));
        jPanel5.setForeground(new java.awt.Color(204, 0, 0));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 204));
        jLabel3.setText("    Sign Up");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 204), 2, true));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("    Sign In");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 204), 2, true));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, 30));

        jSeparator3.setBackground(new java.awt.Color(204, 255, 204));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 250, 20));

        jPanel7.setBackground(new java.awt.Color(0, 153, 0));
        jPanel7.setForeground(new java.awt.Color(204, 0, 0));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 255, 204));
        jLabel10.setText("    Sign Up");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 204), 2, true));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        passwordreg.setBackground(new java.awt.Color(204, 0, 0));
        passwordreg.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        passwordreg.setForeground(new java.awt.Color(255, 255, 255));
        passwordreg.setText("Password");
        passwordreg.setBorder(null);
        passwordreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordregActionPerformed(evt);
            }
        });
        passwordreg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordregFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordregFocusLost(evt);
            }
        });
        jPanel3.add(passwordreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 250, -1));

        usernamereg.setBackground(new java.awt.Color(204, 0, 0));
        usernamereg.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        usernamereg.setForeground(new java.awt.Color(255, 255, 255));
        usernamereg.setText("User Name");
        usernamereg.setBorder(null);
        usernamereg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameregFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameregFocusLost(evt);
            }
        });
        jPanel3.add(usernamereg, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 250, -1));

        jSeparator5.setBackground(new java.awt.Color(204, 255, 204));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 250, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_collaboration_female_male_30px.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 30, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_username_30px_1.png"))); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 30, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_sign_in_form_password_30px.png"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 30, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_sign_in_form_password_30px.png"))); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 30, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_send_email_30px.png"))); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 30, 30));

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 255, 204));
        jLabel15.setText("Already have an account? Click to login...");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, -1));

        usersignupbtn.setBackground(new java.awt.Color(0, 153, 0));
        usersignupbtn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        usersignupbtn.setForeground(new java.awt.Color(204, 255, 204));
        usersignupbtn.setText("Sign Up");
        usersignupbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 204), 2, true));
        usersignupbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersignupbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usersignupbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usersignupbtnMouseExited(evt);
            }
        });
        usersignupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersignupbtnActionPerformed(evt);
            }
        });
        jPanel3.add(usersignupbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 100, 30));

        Radiomale.setBackground(new java.awt.Color(204, 0, 0));
        Radiomale.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Radiomale.setForeground(new java.awt.Color(255, 255, 255));
        Radiomale.setText("Male");
        jPanel3.add(Radiomale, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        Radiofemale.setBackground(new java.awt.Color(204, 0, 0));
        Radiofemale.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Radiofemale.setForeground(new java.awt.Color(255, 255, 255));
        Radiofemale.setText("Female ");
        jPanel3.add(Radiofemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 450, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void stuloginclosebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stuloginclosebtnMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new images().setVisible(true);
    }//GEN-LAST:event_stuloginclosebtnMouseClicked

    private void stuloginclosebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stuloginclosebtnMouseEntered
        // TODO add your handling code here:
        Border labelborder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        stuloginclosebtn.setBorder(labelborder);
        stuloginclosebtn.setForeground(Color.white);
    }//GEN-LAST:event_stuloginclosebtnMouseEntered

    private void stuloginclosebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stuloginclosebtnMouseExited
        // TODO add your handling code here:
        Border labelborder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
        stuloginclosebtn.setBorder(labelborder);
        stuloginclosebtn.setForeground(Color.red);
    }//GEN-LAST:event_stuloginclosebtnMouseExited

    private void emailregFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailregFocusGained
        // TODO add your handling code here:
        emailreg.setText("");
    }//GEN-LAST:event_emailregFocusGained

    private void emailregFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailregFocusLost
        // TODO add your handling code here:
        if (emailreg.getText().trim().equals("") || emailreg.getText().trim().toLowerCase().equals("Email")) {
            emailreg.setText("Email");
            emailreg.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_emailregFocusLost

    private void conpasswordregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conpasswordregActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conpasswordregActionPerformed

    private void conpasswordregFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_conpasswordregFocusGained
        // TODO add your handling code here:
        conpasswordreg.setText("");
    }//GEN-LAST:event_conpasswordregFocusGained

    private void conpasswordregFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_conpasswordregFocusLost
        // TODO add your handling code here:

        //get the password text
        String pass = String.valueOf(passwordreg.getPassword());
        if (pass.trim().toLowerCase().equals("Password")) {
            passwordreg.setText("Password");
            passwordreg.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_conpasswordregFocusLost

    private void passwordregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordregActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordregActionPerformed

    private void passwordregFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordregFocusGained
        // TODO add your handling code here:
        passwordreg.setText("");
    }//GEN-LAST:event_passwordregFocusGained

    private void passwordregFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordregFocusLost
        // TODO add your handling code here:

        //get the password text
        String pass = String.valueOf(passwordreg.getPassword());
        if (pass.trim().toLowerCase().equals("Password")) {
            passwordreg.setText("Password");
            passwordreg.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_passwordregFocusLost

    private void usernameregFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameregFocusGained
        // TODO add your handling code here:
        usernamereg.setText("");
    }//GEN-LAST:event_usernameregFocusGained

    private void usernameregFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameregFocusLost
        // TODO add your handling code here:
        if (usernamereg.getText().trim().equals("") || usernamereg.getText().trim().toLowerCase().equals("Username")) {
            usernamereg.setText("Username");
            usernamereg.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_usernameregFocusLost

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new userSignin().setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void usersignupbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersignupbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_usersignupbtnMouseClicked

    private void usersignupbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersignupbtnMouseEntered
        // TODO add your handling code here:
        usersignupbtn.setBackground(new Color(120, 100, 40));
    }//GEN-LAST:event_usersignupbtnMouseEntered

    private void usersignupbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersignupbtnMouseExited
        // TODO add your handling code here:
        usersignupbtn.setBackground(new Color(0, 153, 0));
    }//GEN-LAST:event_usersignupbtnMouseExited

    private void usersignupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersignupbtnActionPerformed
        // TODO add your handling code here:
        String Username = usernamereg.getText();
        String Password = String.valueOf(passwordreg.getPassword());
        String ConPassword = String.valueOf(conpasswordreg.getPassword());
        String Email = emailreg.getText();
        String Gender = "Male";

        if (Radiofemale.isSelected()) {
            Gender = "Female";
        }

        //check empty fields
        if (Username.isEmpty() || Password.isEmpty() || ConPassword.isEmpty() || Email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "One or more fields are empty, Please fill", "Empty Fields", 2);
        } else if (!Password.equals(ConPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords don't match", "Confirm Password", 2);
        } else if (Username.equals("User Name")) {
            JOptionPane.showMessageDialog(this, "Please add a username", "Empty Fields", 2);
        } else if (Email.equals("Email")) {
            JOptionPane.showMessageDialog(this, "Please add an email", "Empty Fields", 2);
        } else if (!Radiofemale.isSelected() && !Radiomale.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please select a gender", "Empty Fields", 2);
        } else {
            //start the process
            userRegister(Username, Password, ConPassword, Email, Gender);

        }
    }//GEN-LAST:event_usersignupbtnActionPerformed

    private void userRegister(String Username, String Password, String ConPassword, String Email, String Gender) {
        Connection con = connectionProvider.getCon();
        if (con != null) {
            try {
                PreparedStatement ps = (PreparedStatement) con.prepareStatement("insert into users (username, password, cpassword, email, gender) values (?,?,?,?,?)");
                ps.setString(1, Username);
                ps.setString(2, Password);
                ps.setString(3, ConPassword);
                ps.setString(4, Email);
                ps.setString(5, Gender);

                int rs = ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Your account has been created", "Success", 2);

            } catch (SQLException ex) {
                Logger.getLogger(usersign.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("The connection in not available");
        }
    }

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
            java.util.logging.Logger.getLogger(usersign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usersign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usersign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usersign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usersign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Radiofemale;
    private javax.swing.JRadioButton Radiomale;
    private javax.swing.JPasswordField conpasswordreg;
    private javax.swing.JTextField emailreg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPasswordField passwordreg;
    private javax.swing.JButton stuloginclosebtn;
    private javax.swing.JTextField usernamereg;
    private javax.swing.JButton usersignupbtn;
    // End of variables declaration//GEN-END:variables
}
