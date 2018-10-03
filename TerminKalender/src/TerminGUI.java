
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


public class TerminGUI extends javax.swing.JFrame
{
TerminBL model=new TerminBL();

  
    public TerminGUI()
    {
        initComponents();
        
        list.setModel(model);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        mItemHinzufügen = new javax.swing.JMenuItem();
        mItemLöschen = new javax.swing.JMenuItem();
        mItemÄndern = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        jMenu1.setText("Termin");

        mItemHinzufügen.setText("hinzufügen");
        mItemHinzufügen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemHinzufügenActionPerformed(evt);
            }
        });
        jMenu1.add(mItemHinzufügen);

        mItemLöschen.setText("löschen");
        mItemLöschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemLöschenActionPerformed(evt);
            }
        });
        jMenu1.add(mItemLöschen);

        mItemÄndern.setText("ändern");
        mItemÄndern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemÄndernActionPerformed(evt);
            }
        });
        jMenu1.add(mItemÄndern);

        jPopupMenu1.add(jMenu1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Termin-Kalender");

        list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        list.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(list);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Termine");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mItemHinzufügenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemHinzufügenActionPerformed
         JFrame frame= new JFrame();
        AppointmentDlg dialog=new AppointmentDlg(frame, true);
      dialog.setVisible(true);
      Termin t=null;
       if(dialog.isOK()){
        t=dialog.getTermin();
           model.add(t);
           System.out.println("Hinzugefügt");
           System.out.println(t.toString());
       }
    }//GEN-LAST:event_mItemHinzufügenActionPerformed

    private void mItemLöschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemLöschenActionPerformed
        model.delete(list.getSelectedIndex());
    }//GEN-LAST:event_mItemLöschenActionPerformed

    private void mItemÄndernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemÄndernActionPerformed
   
    try {
        model.save();
        model.load();
    } catch (Exception ex) {
        Logger.getLogger(TerminGUI.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_mItemÄndernActionPerformed

   
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(TerminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TerminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TerminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TerminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new TerminGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Termin> list;
    private javax.swing.JMenuItem mItemHinzufügen;
    private javax.swing.JMenuItem mItemLöschen;
    private javax.swing.JMenuItem mItemÄndern;
    // End of variables declaration//GEN-END:variables
}
