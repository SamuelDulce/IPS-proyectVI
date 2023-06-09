/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.ImageIcon;



/**
 *
 * @author Millow
 */
public class frmHome extends javax.swing.JFrame {

    /**
     * Creates new form Into
     */
    public frmHome() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/LogosIMG/LogoWachi.png")).getImage());
        //setIconImage(getIconImage());
        //
        //setExtendedState(MAXIMIZED_BOTH);
        
    }
    
    // Icono
    //@Override
    //public Image getIconImage(){
        
    //    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("/LogosIMG/LogoMakr-6z7T8X.png"));
    //    return retValue;
    //}
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        MenuHome = new javax.swing.JMenuBar();
        MnProfile = new javax.swing.JMenu();
        MnAsis = new javax.swing.JMenuItem();
        MnAdmi = new javax.swing.JMenuItem();
        MnDoc = new javax.swing.JMenuItem();
        MnCliente = new javax.swing.JMenuItem();
        MnInfo = new javax.swing.JMenu();
        Info = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("I.P.S Wachitroco");
        setBackground(new java.awt.Color(0, 0, 0));
        setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        setForeground(new java.awt.Color(201, 238, 255));
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(236, 252, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(780, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Home.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 590));

        MenuHome.setBorder(null);
        MenuHome.setPreferredSize(new java.awt.Dimension(300, 30));

        MnProfile.setText("Profile");
        MnProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MnProfile.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        MnProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MnProfile.setPreferredSize(new java.awt.Dimension(75, 22));

        MnAsis.setText("Asistente");
        MnAsis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MnProfile.add(MnAsis);

        MnAdmi.setText("Administrado");
        MnAdmi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MnProfile.add(MnAdmi);

        MnDoc.setText("Doctor");
        MnDoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MnProfile.add(MnDoc);

        MnCliente.setText("Cliente");
        MnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MnProfile.add(MnCliente);

        MenuHome.add(MnProfile);

        MnInfo.setText("Info");
        MnInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MnInfo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        MnInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MnInfo.setPreferredSize(new java.awt.Dimension(75, 22));

        Info.setText("I.P.S Wachitroco");
        Info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MnInfo.add(Info);

        MenuHome.add(MnInfo);

        setJMenuBar(MenuHome);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem Info;
    public javax.swing.JMenuBar MenuHome;
    public javax.swing.JMenuItem MnAdmi;
    public javax.swing.JMenuItem MnAsis;
    public javax.swing.JMenuItem MnCliente;
    public javax.swing.JMenuItem MnDoc;
    public javax.swing.JMenu MnInfo;
    public javax.swing.JMenu MnProfile;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
