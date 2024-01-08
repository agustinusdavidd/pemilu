package UI;

public class StatusUndangan extends javax.swing.JFrame {

    /**
     * Creates new form StatusUndangan
     */
    public StatusUndangan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Tujuan = new javax.swing.JLabel();
        Undangan = new javax.swing.JLabel();
        HariTanggalLabel = new javax.swing.JLabel();
        JamLabel = new javax.swing.JLabel();
        HariTanggal = new javax.swing.JLabel();
        Jam = new javax.swing.JLabel();
        TPSLabel = new javax.swing.JLabel();
        TPS = new javax.swing.JLabel();
        Body = new javax.swing.JLabel();
        Closing = new javax.swing.JLabel();
        CloseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tujuan.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Tujuan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tujuan.setText("Yth, Agustinus David");

        Undangan.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Undangan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Undangan.setText("Anda diundang untuk melaksanakan pemilihan umum pada :");

        HariTanggalLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HariTanggalLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        HariTanggalLabel.setText("Hari/Tanggal :");

        JamLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JamLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        JamLabel.setText("Jam :");

        HariTanggal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HariTanggal.setText("Kamis, 14 Februari 2024");

        Jam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Jam.setText("09.00 - 18.00");

        TPSLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TPSLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        TPSLabel.setText("TPS :");

        TPS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TPS.setText("01");

        Body.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Body.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Body.setText("Gunakan hak pilih anda sebaik mungkin.");

        Closing.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Closing.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Closing.setText("Pilihan anda, menentukan nasib bangsa 5 tahun kedepan.");

        CloseButton.setText("Tutup");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(549, 549, 549)
                                                                .addComponent(HariTanggalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(HariTanggal))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(608, 608, 608)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(TPSLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(TPS))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(JamLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(Jam)))))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Tujuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(Undangan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1356, Short.MAX_VALUE)
                                                        .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, 1356, Short.MAX_VALUE)))
                                        .addComponent(Closing, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1362, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(644, 644, 644)
                                .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addComponent(Tujuan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Undangan)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(HariTanggalLabel)
                                        .addComponent(HariTanggal))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(JamLabel)
                                        .addComponent(Jam))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TPSLabel)
                                        .addComponent(TPS))
                                .addGap(18, 18, 18)
                                .addComponent(Body)
                                .addGap(18, 18, 18)
                                .addComponent(Closing)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                                .addComponent(CloseButton)
                                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>                        

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Dashboard d = new Dashboard();

        dispose();
        d.setVisible(true);
        d.setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(StatusUndangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatusUndangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatusUndangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatusUndangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatusUndangan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Body;
    private javax.swing.JButton CloseButton;
    private javax.swing.JLabel Closing;
    private javax.swing.JLabel HariTanggal;
    private javax.swing.JLabel HariTanggalLabel;
    private javax.swing.JLabel Jam;
    private javax.swing.JLabel JamLabel;
    private javax.swing.JLabel TPS;
    private javax.swing.JLabel TPSLabel;
    private javax.swing.JLabel Tujuan;
    private javax.swing.JLabel Undangan;
    // End of variables declaration        
    
}