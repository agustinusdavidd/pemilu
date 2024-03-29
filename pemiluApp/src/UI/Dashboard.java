package UI;

import Model.Remember;
import Model.User;
import Network.Database;
import org.mindrot.jbcrypt.BCrypt;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dashboard extends javax.swing.JFrame {
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        setLocationRelativeTo(null);
        setUserName();
        checkIsAdmin();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        PilihanLabel = new javax.swing.JLabel();
        WelcomeLabel = new javax.swing.JLabel();
        ResultButton = new javax.swing.JButton();
        VoteButton = new javax.swing.JButton();

        AdminButton = new javax.swing.JButton();
        TPSLabel = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();
        CekUndanganButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setSize(new java.awt.Dimension(1366, 768));

        PilihanLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PilihanLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PilihanLabel.setText("Anda belum menggunakan hak pilih anda");

        WelcomeLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        WelcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomeLabel.setText("Selamat Datang, David");

        ResultButton.setText("Result");
        ResultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultButtonActionPerformed(evt);
            }
        });

        VoteButton.setText("Vote");
        VoteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoteButtonActionPerformed(evt);
            }
        });

        AdminButton.setText("Admin Control");
        AdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminButtonActionPerformed(evt);
            }
        });

        TPSLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TPSLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TPSLabel.setText("Anda terdaftar pada TPS 01");

        LogoutButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        CekUndanganButton.setText("Cek Status Undangan");
        CekUndanganButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CekUndanganButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(CekUndanganButton)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(46, 46, 46))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(AdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(VoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(ResultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(539, 539, 539))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(WelcomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1354, Short.MAX_VALUE)
                                                        .addComponent(PilihanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(TPSLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addContainerGap())))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(LogoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                        .addComponent(CekUndanganButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(WelcomeLabel)
                                .addGap(18, 18, 18)
                                .addComponent(PilihanLabel)
                                .addGap(18, 18, 18)
                                .addComponent(TPSLabel)
                                .addGap(47, 47, 47)
                                .addComponent(VoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ResultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(714, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    Remember r = new Remember();
    String nama = r.getNama();
    String nik = r.getNikLogin();

    public void setUserName() {
        WelcomeLabel.setText("Selamat Datang, " + nama);
    }

    public void checkIsAdmin() {

        try {
            User user = User.getByNIK(nik);
            if(!user.isAdmin()){
                AdminButton.setVisible(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan pada database: " + e.getMessage());
        }
    }

//        try {
//            Connection conn = DriverManager.getConnection(Database.DB_URL, Database.DB_USER, Database.DB_PASSWORD);
//
//            String query = "SELECT isAdmin FROM users WHERE nik = ?";
//
//            try (PreparedStatement ps = conn.prepareStatement(query)) {
//                ps.setString(1, nik);
//                ResultSet rs = ps.executeQuery();
//
//                String isAdmin = rs.getString("isAdmin");
//
//                System.out.println(isAdmin);
//
//                if(isAdmin.equals("0")){
//                    AdminButton.setVisible(false);
//                }
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(this, "Terjadi kesalahan pada database: " + e.getMessage());
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Terjadi kesalahan pada database: " + e.getMessage());
//        }
//    }

    private void ResultButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Result r = new Result();

        dispose();
        r.setVisible(true);
        r.setLocationRelativeTo(null);
    }

    private void VoteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Vote v = new Vote();

        dispose();
        v.setVisible(true);
        v.setLocationRelativeTo(null);
    }

    private void AdminButtonActionPerformed(java.awt.event.ActionEvent evt) {
        AdminControl ac = new AdminControl();

        dispose();
        ac.setVisible(true);
        ac.setLocationRelativeTo(null);
    }

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Display a confirmation dialog before logging out
        int choice = JOptionPane.showConfirmDialog(Dashboard.this, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            // Redirect to the login frame
            dispose();  // Close the current frame

//            LoginFrame loginFrame = new LoginFrame();
//            loginFrame.setLocationRelativeTo(null);
//            loginFrame.setVisible(true);
        }
    }

    private void CekUndanganButtonActionPerformed(java.awt.event.ActionEvent evt) {
        StatusUndangan su = new StatusUndangan();

        dispose();
        su.setVisible(true);
        su.setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dashboard Dashboard = new Dashboard();
                Dashboard.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton AdminButton;
    private javax.swing.JButton CekUndanganButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JLabel PilihanLabel;
    private javax.swing.JButton ResultButton;
    private javax.swing.JLabel TPSLabel;
    private javax.swing.JButton VoteButton;
    private javax.swing.JLabel WelcomeLabel;
}
