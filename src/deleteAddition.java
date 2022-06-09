
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
public class deleteAddition extends javax.swing.JFrame {

    /**
     * Creates new form deleteQuestion
     */
    public deleteAddition() {
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
        dqclose = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dqsearch = new javax.swing.JTextField();
        dubtnsearch = new javax.swing.JButton();
        dqquestion = new javax.swing.JTextField();
        dqopt1 = new javax.swing.JTextField();
        dqopt2 = new javax.swing.JTextField();
        dqopt3 = new javax.swing.JTextField();
        dqopt4 = new javax.swing.JTextField();
        dqanswer = new javax.swing.JTextField();
        dqbtnUpdate = new javax.swing.JButton();
        dqbtnClear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 2, true));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete Question.png"))); // NOI18N
        jLabel1.setText("Delete Question\n");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 247, -1));

        dqclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        dqclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dqcloseActionPerformed(evt);
            }
        });
        jPanel1.add(dqclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 70, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 900, 10));

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

        dqsearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dqsearch.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(dqsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 80, -1));

        dubtnsearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dubtnsearch.setForeground(new java.awt.Color(0, 153, 0));
        dubtnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        dubtnsearch.setText("Search");
        dubtnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dubtnsearchActionPerformed(evt);
            }
        });
        jPanel1.add(dubtnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        dqquestion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dqquestion.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(dqquestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 380, -1));

        dqopt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dqopt1.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(dqopt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 380, -1));

        dqopt2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dqopt2.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(dqopt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 380, -1));

        dqopt3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dqopt3.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(dqopt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 380, -1));

        dqopt4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dqopt4.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(dqopt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 380, -1));

        dqanswer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dqanswer.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(dqanswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 380, -1));

        dqbtnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dqbtnUpdate.setForeground(new java.awt.Color(0, 153, 0));
        dqbtnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        dqbtnUpdate.setText("Delete");
        dqbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dqbtnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(dqbtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, -1, -1));

        dqbtnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dqbtnClear.setForeground(new java.awt.Color(0, 153, 0));
        dqbtnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clear.png"))); // NOI18N
        dqbtnClear.setText("Clear");
        dqbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dqbtnClearActionPerformed(evt);
            }
        });
        jPanel1.add(dqbtnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, -1, -1));

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

    private void dqcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dqcloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new dltquestion().setVisible(true);
    }//GEN-LAST:event_dqcloseActionPerformed

    private void dubtnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dubtnsearchActionPerformed
        // TODO add your handling code here:
        String id = dqsearch.getText();

        try {
            Connection con = connectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from question where id='"+id+"'");
            if (rs.first()) {
                dqquestion.setText(rs.getString(2));
                dqopt1.setText(rs.getString(3));
                dqopt2.setText(rs.getString(4));
                dqopt3.setText(rs.getString(5));
                dqopt4.setText(rs.getString(6));
                dqanswer.setText(rs.getString(7));
                dqsearch.setEditable(false);
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
    }//GEN-LAST:event_dubtnsearchActionPerformed

    private void dqbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dqbtnUpdateActionPerformed
        // TODO add your handling code here:
        String id = dqsearch.getText();
        String name = dqquestion.getText();
        String opt1 = dqopt1.getText();
        String opt2 = dqopt2.getText();
        String opt3 = dqopt3.getText();
        String opt4 = dqopt4.getText();
        String answer = dqanswer.getText();

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
    }//GEN-LAST:event_dqbtnUpdateActionPerformed

    private void dqbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dqbtnClearActionPerformed
        // TODO add your handling code here:
        dqsearch.setText("");
        dqquestion.setText("");
        dqopt1.setText("");
        dqopt2.setText("");
        dqopt3.setText("");
        dqopt4.setText("");
        dqanswer.setText("");
        dqsearch.setEditable(true);
    }//GEN-LAST:event_dqbtnClearActionPerformed

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
            java.util.logging.Logger.getLogger(deleteAddition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deleteAddition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deleteAddition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deleteAddition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deleteAddition().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dqanswer;
    private javax.swing.JButton dqbtnClear;
    private javax.swing.JButton dqbtnUpdate;
    private javax.swing.JButton dqclose;
    private javax.swing.JTextField dqopt1;
    private javax.swing.JTextField dqopt2;
    private javax.swing.JTextField dqopt3;
    private javax.swing.JTextField dqopt4;
    private javax.swing.JTextField dqquestion;
    private javax.swing.JTextField dqsearch;
    private javax.swing.JButton dubtnsearch;
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
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

// references
//https://youtu.be/jMgWl-0-JaY