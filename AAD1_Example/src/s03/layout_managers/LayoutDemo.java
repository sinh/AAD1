/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package s03.layout_managers;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author sinhnx
 */
public class LayoutDemo extends javax.swing.JFrame {

    /**
     * Creates new form LayoutDemo
     */
    public LayoutDemo() {
        initComponents();

        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LayoutManager layout = pLayout.getLayout();
                if (layout instanceof CardLayout) {
                    ((CardLayout) layout).next(pLayout);
                }
            }
        };
        jButton1.addActionListener(action);
        jButton2.addActionListener(action);
        jButton3.addActionListener(action);
        jButton4.addActionListener(action);
        jButton5.addActionListener(action);
    }
    
    private void addShowComponents(){
        pLayout.removeAll();
        pLayout.add(jButton1);
        pLayout.add(jButton2);
        pLayout.add(jButton3);
        pLayout.add(jButton4);
        pLayout.add(jButton5);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        pLayout.doLayout();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pLayout = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnFlowLayout = new javax.swing.JButton();
        btnBorder = new javax.swing.JButton();
        btnGridLayout = new javax.swing.JButton();
        btnCardLayout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        jButton5.setText("jButton5");

        org.jdesktop.layout.GroupLayout pLayoutLayout = new org.jdesktop.layout.GroupLayout(pLayout);
        pLayout.setLayout(pLayoutLayout);
        pLayoutLayout.setHorizontalGroup(
            pLayoutLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pLayoutLayout.createSequentialGroup()
                .add(28, 28, 28)
                .add(jButton1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButton2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButton3)
                .add(18, 18, 18)
                .add(jButton4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton5)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pLayoutLayout.setVerticalGroup(
            pLayoutLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pLayoutLayout.createSequentialGroup()
                .add(30, 30, 30)
                .add(pLayoutLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1)
                    .add(jButton2)
                    .add(jButton3)
                    .add(jButton4)
                    .add(jButton5))
                .addContainerGap(280, Short.MAX_VALUE))
        );

        btnFlowLayout.setText("Flow Layout");
        btnFlowLayout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlowLayoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnFlowLayout);

        btnBorder.setText("Border Layout");
        btnBorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorderActionPerformed(evt);
            }
        });
        jPanel2.add(btnBorder);

        btnGridLayout.setText("Grid Layout");
        btnGridLayout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGridLayoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnGridLayout);

        btnCardLayout.setText("Card Layout");
        btnCardLayout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCardLayoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnCardLayout);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(pLayout, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(pLayout, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFlowLayoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlowLayoutActionPerformed
        // TODO add your handling code here:
        pLayout.setLayout(new FlowLayout(FlowLayout.LEFT));
        addShowComponents();
    }//GEN-LAST:event_btnFlowLayoutActionPerformed

    private void btnBorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorderActionPerformed
        // TODO add your handling code here:
        pLayout.setLayout(new BorderLayout());
        pLayout.removeAll();
        pLayout.add(jButton1, BorderLayout.NORTH);
        pLayout.add(jButton2, BorderLayout.WEST);
        pLayout.add(jButton3, BorderLayout.SOUTH);
        pLayout.add(jButton4, BorderLayout.EAST);
        pLayout.add(jButton5, BorderLayout.CENTER);
        pLayout.doLayout();
    }//GEN-LAST:event_btnBorderActionPerformed

    private void btnGridLayoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGridLayoutActionPerformed
        // TODO add your handling code here:
        pLayout.setLayout(new GridLayout(2, 3));
        addShowComponents();
    }//GEN-LAST:event_btnGridLayoutActionPerformed

    private void btnCardLayoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCardLayoutActionPerformed
        // TODO add your handling code here:
        pLayout.setLayout(new CardLayout());
        pLayout.doLayout();
    }//GEN-LAST:event_btnCardLayoutActionPerformed

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
            java.util.logging.Logger.getLogger(LayoutDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LayoutDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LayoutDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LayoutDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LayoutDemo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorder;
    private javax.swing.JButton btnCardLayout;
    private javax.swing.JButton btnFlowLayout;
    private javax.swing.JButton btnGridLayout;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pLayout;
    // End of variables declaration//GEN-END:variables
}
