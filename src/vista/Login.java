package vista;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import bbdd.Conexion;
import modelo.Cuenta;
import controlador.CuentaBD;

public class Login extends javax.swing.JFrame {

    private CuentaBD cuentaBD = new CuentaBD();
  
    public Login() {
        initComponents();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        entrar2 = new javax.swing.JButton();
        recuerdame = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setBorder(new javax.swing.border.MatteBorder(null));
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 270, 50));

        txtContrasena.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        getContentPane().add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 270, 50));

        entrar2.setText("Entrar");
        entrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrar2ActionPerformed(evt);
            }
        });
        getContentPane().add(entrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, -1, -1));

        recuerdame.setText("Recuerdame");
        recuerdame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recuerdameActionPerformed(evt);
            }
        });
        getContentPane().add(recuerdame, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed

    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void recuerdameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recuerdameActionPerformed

     
    }//GEN-LAST:event_recuerdameActionPerformed

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
       
    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void entrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrar2ActionPerformed
        
        String usuario = txtUsuario.getText();
        String contrasena = new String(txtContrasena.getPassword());
      
        Cuenta cuenta = cuentaBD.getCuenta(usuario, contrasena);
        
        if(cuenta != null){
            cuentaBD.iniciarSesion(cuenta);
        }

    }//GEN-LAST:event_entrar2ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entrar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox recuerdame;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void usuario(String usuario, String contra, String string, String medico) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
