/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import MyContainers.TextPrompt;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.List;
import Funcionamiento.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
/**
 *
 * @author franc
 */
public class RecuperarClave extends javax.swing.JFrame {
    private List<Usuario> Usuario;
    private Timer timer;
    /**
     * Creates new form RecuperarClave
     */
    public RecuperarClave() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.CorreoValido.setVisible(false);
        this.CorreoNoValido.setVisible(false);
        
        
        //Lista Usuarios
        Usuario = new ArrayList<>();
        Usuario.add(new Usuario("franco.almerco@usil.pe","franco"));
        Usuario.add(new Usuario("alondra.gonzales@usil.pe","alondra"));
        Usuario.add(new Usuario("fabian.maquen@usil.pe","fabian"));
        Usuario.add(new Usuario("omar.morales@usil.pe","omar"));
        Usuario.add(new Usuario("nefi.valderrama@usil.pe","nefi"));
        
        TextPrompt txtCorreo = new TextPrompt("Email ID", txtUsuario);
       
            
         timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CorreoValido.setVisible(false);
                CorreoNoValido.setVisible(false);
                timer.stop();
            }
        });
    
        
        
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
        jButton1 = new javax.swing.JButton();
        logoUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        botonCustomLogin1 = new MyContainers.BotonCustomLogin();
        CorreoNoValido = new javax.swing.JLabel();
        CorreoValido = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        recordar = new javax.swing.JLabel();
        logoUsil = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        FondoLogin = new javax.swing.JLabel();
        background1 = new MyContainers.Background();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(440, 580));

        jPanel1.setMinimumSize(new java.awt.Dimension(440, 580));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(38, 65, 115));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackIcon.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 20, -1, -1));

        logoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoMuñueco.png"))); // NOI18N
        jPanel1.add(logoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(63, 108, 165));
        txtUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 180, 50));

        botonCustomLogin1.setText("RECORDAR");
        botonCustomLogin1.setFocusPainted(false);
        botonCustomLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCustomLogin1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonCustomLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 250, 50));

        CorreoNoValido.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        CorreoNoValido.setForeground(new java.awt.Color(255, 255, 255));
        CorreoNoValido.setText("Correo no válido");
        jPanel1.add(CorreoNoValido, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 450, 180, -1));

        CorreoValido.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        CorreoValido.setForeground(new java.awt.Color(255, 255, 255));
        CorreoValido.setText("Se enviaron las instrucciones al correo");
        jPanel1.add(CorreoValido, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 430, 240, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("las instrucciones. ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese su correo electrónico y le enviaremos ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 270, -1));

        recordar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        recordar.setForeground(new java.awt.Color(255, 255, 255));
        recordar.setText("Recordar Clave");
        jPanel1.add(recordar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 150, -1));

        logoUsil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usilLogo150x150.png"))); // NOI18N
        logoUsil.setText("jLabel1");
        jPanel1.add(logoUsil, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 85, 140, 130));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 353, 180, 0));

        FondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoLogin.png"))); // NOI18N
        jPanel1.add(FondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 150, -1, 360));

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jPanel1.add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login ventanaLogin = new Login();
        ventanaLogin.setVisible(true);
        this.setVisible(false);
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonCustomLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCustomLogin1ActionPerformed
        // TODO add your handling code here:
     String correo = txtUsuario.getText();  
       
    boolean confirmarCorreo = false;
    for(Usuario listaUsuario:Usuario){
     if (listaUsuario.getNombreUsuario().equals(correo) ) {
         confirmarCorreo = true;
         break;
        }
    }
      
       if(confirmarCorreo){   
          this.CorreoValido.setVisible(true);
      }else {
        this.CorreoNoValido.setVisible(true);
    
        }
         timer.restart();
         
    }//GEN-LAST:event_botonCustomLogin1ActionPerformed

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
            java.util.logging.Logger.getLogger(RecuperarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuperarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuperarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuperarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecuperarClave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CorreoNoValido;
    private javax.swing.JLabel CorreoValido;
    private javax.swing.JLabel FondoLogin;
    private MyContainers.Background background1;
    private MyContainers.BotonCustomLogin botonCustomLogin1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logoUsil;
    private javax.swing.JLabel logoUsuario;
    private javax.swing.JLabel recordar;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}