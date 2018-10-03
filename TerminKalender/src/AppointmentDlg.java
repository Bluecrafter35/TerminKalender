
import java.time.LocalDate;
import java.time.LocalDateTime;
import javafx.util.converter.LocalDateTimeStringConverter;

public class AppointmentDlg extends javax.swing.JDialog
{

    private boolean ok = false;
    private Termin termin;

    public AppointmentDlg(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

    public boolean isOK()
    {
        return ok;
    }

    public Termin getTermin()
    {
        return termin;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfTag = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfMonat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfJahr = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfStunde = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfMinute = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfText = new javax.swing.JTextField();
        btÜbernehmen = new javax.swing.JButton();
        btAbbrechen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(7, 2));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Tag: ");
        getContentPane().add(jLabel1);

        tfTag.setText("5");
        getContentPane().add(tfTag);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Monat: ");
        getContentPane().add(jLabel2);

        tfMonat.setText("9");
        getContentPane().add(tfMonat);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Jahr: ");
        getContentPane().add(jLabel3);

        tfJahr.setText("2014");
        getContentPane().add(tfJahr);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Stunde: ");
        getContentPane().add(jLabel5);

        tfStunde.setText("8");
        getContentPane().add(tfStunde);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Minute: ");
        getContentPane().add(jLabel4);

        tfMinute.setText("45");
        getContentPane().add(tfMinute);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Text: ");
        getContentPane().add(jLabel6);

        tfText.setText("POS_ÜBUNG");
        getContentPane().add(tfText);

        btÜbernehmen.setText("übernehmen");
        btÜbernehmen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btÜbernehmenActionPerformed(evt);
            }
        });
        getContentPane().add(btÜbernehmen);

        btAbbrechen.setText("abbrechen");
        btAbbrechen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbbrechenActionPerformed(evt);
            }
        });
        getContentPane().add(btAbbrechen);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btÜbernehmenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btÜbernehmenActionPerformed
        try {
            LocalDateTime d = LocalDateTime.of(Integer.parseInt(tfJahr.getText()), Integer.parseInt(tfMonat.getText()), Integer.parseInt(tfTag.getText()), Integer.parseInt(tfStunde.getText()), Integer.parseInt(tfMinute.getText()));
            termin = new Termin(d, tfText.getText());

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        ok = true;
        this.dispose();
    }//GEN-LAST:event_btÜbernehmenActionPerformed

    private void btAbbrechenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbbrechenActionPerformed
        ok = false;
        this.dispose();
    }//GEN-LAST:event_btAbbrechenActionPerformed

    public static void main(String args[])
    {

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                AppointmentDlg dialog = new AppointmentDlg(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbbrechen;
    private javax.swing.JButton btÜbernehmen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tfJahr;
    private javax.swing.JTextField tfMinute;
    private javax.swing.JTextField tfMonat;
    private javax.swing.JTextField tfStunde;
    private javax.swing.JTextField tfTag;
    private javax.swing.JTextField tfText;
    // End of variables declaration//GEN-END:variables
}
