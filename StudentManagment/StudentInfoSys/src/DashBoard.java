/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OJD-Student
 */
public class DashBoard extends javax.swing.JFrame {

    /**
     * Creates new form DashBoard
     */
    public DashBoard() {
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

        jLabel1 = new javax.swing.JLabel();
        addFee = new javax.swing.JButton();
        oneRecord = new javax.swing.JButton();
        allRecord = new javax.swing.JButton();
        printRecord = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText(" DASHBOARD");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 2, 3, 2, new java.awt.Color(102, 102, 102)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 20, 140, 28);

        addFee.setBackground(new java.awt.Color(153, 153, 255));
        addFee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addFee.setForeground(new java.awt.Color(102, 51, 255));
        addFee.setText("Add Fee");
        addFee.setBorder(null);
        addFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFeeActionPerformed(evt);
            }
        });
        getContentPane().add(addFee);
        addFee.setBounds(260, 90, 150, 40);

        oneRecord.setBackground(new java.awt.Color(255, 204, 204));
        oneRecord.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        oneRecord.setForeground(new java.awt.Color(0, 102, 153));
        oneRecord.setText("One Record");
        oneRecord.setBorder(null);
        oneRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneRecordActionPerformed(evt);
            }
        });
        getContentPane().add(oneRecord);
        oneRecord.setBounds(260, 150, 150, 40);

        allRecord.setBackground(new java.awt.Color(255, 153, 102));
        allRecord.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        allRecord.setForeground(new java.awt.Color(0, 51, 51));
        allRecord.setText("All Record");
        allRecord.setBorder(null);
        allRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allRecordActionPerformed(evt);
            }
        });
        getContentPane().add(allRecord);
        allRecord.setBounds(260, 210, 150, 40);

        printRecord.setBackground(new java.awt.Color(153, 255, 51));
        printRecord.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        printRecord.setForeground(new java.awt.Color(102, 51, 0));
        printRecord.setText("Print Record");
        printRecord.setBorder(null);
        printRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printRecordActionPerformed(evt);
            }
        });
        getContentPane().add(printRecord);
        printRecord.setBounds(260, 270, 160, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFeeActionPerformed
 java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFeeForm().setVisible(true);
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_addFeeActionPerformed

    private void oneRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneRecordActionPerformed
/* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OneRecordForm().setVisible(true);
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_oneRecordActionPerformed

    private void allRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allRecordActionPerformed
 java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new All_Record_Form().setVisible(true);
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_allRecordActionPerformed

    private void printRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printRecordActionPerformed

        // TODO add your handling code here:
                 java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Print_Record_Form().setVisible(true);
            }
        });
                                         

    }//GEN-LAST:event_printRecordActionPerformed

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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFee;
    private javax.swing.JButton allRecord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton oneRecord;
    private javax.swing.JButton printRecord;
    // End of variables declaration//GEN-END:variables
}