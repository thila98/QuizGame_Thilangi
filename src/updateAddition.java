
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
public class updateAddition extends javax.swing.JFrame {

    /**
     * Creates new form updateQuestion
     */
    public updateAddition() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        uqquestion = new javax.swing.JTextField();
        uqopt1 = new javax.swing.JTextField();
        uqopt2 = new javax.swing.JTextField();
        uqopt3 = new javax.swing.JTextField();
        uqopt4 = new javax.swing.JTextField();
        uqanswer = new javax.swing.JTextField();
        uqsearch = new javax.swing.JTextField();
        uqbtnUpdate = new javax.swing.JButton();
        uqbtnClear = new javax.swing.JButton();
        uqclose = new javax.swing.JButton();
        qubtnsearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 2, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Update Question.png"))); // NOI18N
        jLabel1.setText("Update Question");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 253, -1));

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

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 0));
        jLabel9.setText("Option 4");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 0));
        jLabel8.setText("Answer");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        uqquestion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        uqquestion.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(uqquestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 380, -1));

        uqopt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        uqopt1.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(uqopt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 380, -1));

        uqopt2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        uqopt2.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(uqopt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 380, -1));

        uqopt3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        uqopt3.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(uqopt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 380, -1));

        uqopt4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        uqopt4.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(uqopt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 380, -1));

        uqanswer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        uqanswer.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(uqanswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 380, -1));

        uqsearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        uqsearch.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(uqsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 80, -1));

        uqbtnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        uqbtnUpdate.setForeground(new java.awt.Color(0, 153, 0));
        uqbtnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        uqbtnUpdate.setText("Update");
        uqbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uqbtnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(uqbtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, -1, -1));

        uqbtnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        uqbtnClear.setForeground(new java.awt.Color(0, 153, 0));
        uqbtnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clear.png"))); // NOI18N
        uqbtnClear.setText("Clear");
        uqbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uqbtnClearActionPerformed(evt);
            }
        });
        jPanel1.add(uqbtnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, -1, -1));

        uqclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        uqclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uqcloseActionPerformed(evt);
            }
        });
        jPanel1.add(uqclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 70, -1));

        qubtnsearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qubtnsearch.setForeground(new java.awt.Color(0, 153, 0));
        qubtnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        qubtnsearch.setText("Search");
        qubtnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qubtnsearchActionPerformed(evt);
            }
        });
        jPanel1.add(qubtnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Addition");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

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

    private void uqbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uqbtnUpdateActionPerformed
        // TODO add your handling code here:
        String id = uqsearch.getText();
        String name = uqquestion.getText();
        String opt1 = uqopt1.getText();
        String opt2 = uqopt2.getText();
        String opt3 = uqopt3.getText();
        String opt4 = uqopt4.getText();
        String answer = uqanswer.getText();

        try {
            Connection con = connectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("update question set name=?,opt1=?,opt2=?,opt3=?,opt4=?,answer=? where id=?");
            ps.setString(1, name);
            ps.setString(2, opt1);
            ps.setString(3, opt2);
            ps.setString(4, opt3);
            ps.setString(5, opt4);
            ps.setString(6, answer);
            ps.setString(7, id);
            ps.executeUpdate();
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "Successfully Updated");
            setVisible(false);
            new updateAddition().setVisible(true);
        } catch (Exception e) {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, e);
        }
    }//GEN-LAST:event_uqbtnUpdateActionPerformed

    private void uqbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uqbtnClearActionPerformed
        // TODO add your handling code here:
        uqsearch.setText("");
        uqquestion.setText("");
        uqopt1.setText("");
        uqopt2.setText("");
        uqopt3.setText("");
        uqopt4.setText("");
        uqanswer.setText("");
        uqsearch.setEditable(true);

    }//GEN-LAST:event_uqbtnClearActionPerformed

    private void uqcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uqcloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new updateNew().setVisible(true);
    }//GEN-LAST:event_uqcloseActionPerformed

    private void qubtnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qubtnsearchActionPerformed
        // TODO add your handling code here:
        String id = uqsearch.getText();

        try {
            Connection con = connectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from question where id='" + id + "'");
            if (rs.first()) {
                uqquestion.setText(rs.getString(2));
                uqopt1.setText(rs.getString(3));
                uqopt2.setText(rs.getString(4));
                uqopt3.setText(rs.getString(5));
                uqopt4.setText(rs.getString(6));
                uqanswer.setText(rs.getString(7));
                uqsearch.setEditable(false);
            } else {
                JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf, "Qustion Id does not exist");
            }
        } catch (Exception e) {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, e);
        }
    }//GEN-LAST:event_qubtnsearchActionPerformed

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
            java.util.logging.Logger.getLogger(updateAddition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateAddition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateAddition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateAddition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateAddition().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton qubtnsearch;
    private javax.swing.JTextField uqanswer;
    private javax.swing.JButton uqbtnClear;
    private javax.swing.JButton uqbtnUpdate;
    private javax.swing.JButton uqclose;
    private javax.swing.JTextField uqopt1;
    private javax.swing.JTextField uqopt2;
    private javax.swing.JTextField uqopt3;
    private javax.swing.JTextField uqopt4;
    private javax.swing.JTextField uqquestion;
    private javax.swing.JTextField uqsearch;
    // End of variables declaration//GEN-END:variables
}

// references
//https://youtu.be/jMgWl-0-JaY