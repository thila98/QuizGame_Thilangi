
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
public class newdivision extends javax.swing.JFrame {

    /**
     * Creates new form newdivision
     */
    public newdivision() {
        initComponents();
        try {
            Connection con = connectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select count(id) from division");
            if (rs.first()) {
                int id = rs.getInt(1);
                id = id + 1;
                String str = String.valueOf(id);
                ancount.setText(str);
            } else {
                ancount.setText("1");
            }
        } catch (Exception e) {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, e);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ancount = new javax.swing.JLabel();
        ananswer = new javax.swing.JTextField();
        anquestion = new javax.swing.JTextField();
        anopt1 = new javax.swing.JTextField();
        anopt2 = new javax.swing.JTextField();
        anopt3 = new javax.swing.JTextField();
        anopt4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        anbtnSave = new javax.swing.JButton();
        anbtnClear = new javax.swing.JButton();
        anclose = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 2, true));
        jPanel1.setForeground(new java.awt.Color(0, 102, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add new question.png"))); // NOI18N
        jLabel1.setText("Add New Question");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 272, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Answer");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Question ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("Question");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("Option 1");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 0));
        jLabel6.setText("Option 2");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 0));
        jLabel7.setText("Option 3");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        ancount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ancount.setForeground(new java.awt.Color(0, 153, 0));
        ancount.setText("00");
        jPanel1.add(ancount, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        ananswer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ananswer.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(ananswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 380, -1));

        anquestion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        anquestion.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(anquestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 380, -1));

        anopt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        anopt1.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(anopt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 380, -1));

        anopt2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        anopt2.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(anopt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 380, -1));

        anopt3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        anopt3.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(anopt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 380, -1));

        anopt4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        anopt4.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(anopt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 380, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 0));
        jLabel9.setText("Option 4");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        anbtnSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        anbtnSave.setForeground(new java.awt.Color(0, 153, 0));
        anbtnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        anbtnSave.setText("Save");
        anbtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anbtnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(anbtnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, -1, -1));

        anbtnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        anbtnClear.setForeground(new java.awt.Color(0, 153, 0));
        anbtnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clear.png"))); // NOI18N
        anbtnClear.setText("Clear");
        anbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anbtnClearActionPerformed(evt);
            }
        });
        jPanel1.add(anbtnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, -1, -1));

        anclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        anclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ancloseActionPerformed(evt);
            }
        });
        jPanel1.add(anclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 70, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 0));
        jLabel8.setText("Division");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

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

    private void anbtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anbtnSaveActionPerformed
        // TODO add your handling code here:
        String id = ancount.getText();
        String name = anquestion.getText();
        String opt1 = anopt1.getText();
        String opt2 = anopt2.getText();
        String opt3 = anopt3.getText();
        String opt4 = anopt4.getText();
        String answer = ananswer.getText();

        try {
            Connection con = connectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("insert into division values(?,?,?,?,?,?,?)");
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, opt1);
            ps.setString(4, opt2);
            ps.setString(5, opt3);
            ps.setString(6, opt4);
            ps.setString(7, answer);
            ps.executeUpdate();
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "Successfully Saved");
            setVisible(false);
            new newdivision().setVisible(true);
        } catch (Exception e) {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, e);
        }
    }//GEN-LAST:event_anbtnSaveActionPerformed

    private void anbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anbtnClearActionPerformed
        // TODO add your handling code here:
        anquestion.setText("");
        anopt1.setText("");
        anopt2.setText("");
        anopt3.setText("");
        anopt4.setText("");
        ananswer.setText("");
    }//GEN-LAST:event_anbtnClearActionPerformed

    private void ancloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ancloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new adddnew().setVisible(true);
    }//GEN-LAST:event_ancloseActionPerformed

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
            java.util.logging.Logger.getLogger(newdivision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newdivision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newdivision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newdivision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newdivision().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ananswer;
    private javax.swing.JButton anbtnClear;
    private javax.swing.JButton anbtnSave;
    private javax.swing.JButton anclose;
    private javax.swing.JLabel ancount;
    private javax.swing.JTextField anopt1;
    private javax.swing.JTextField anopt2;
    private javax.swing.JTextField anopt3;
    private javax.swing.JTextField anopt4;
    private javax.swing.JTextField anquestion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

// references
//https://youtu.be/jMgWl-0-JaY