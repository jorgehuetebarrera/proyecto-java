
package vista;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import modelo.Usuario;
import bbdd.conexion;

public class Login extends javax.swing.JFrame {

  
    public Login() {
        initComponents();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuario = new javax.swing.JTextField();
        contrasenia = new javax.swing.JPasswordField();
        entrar2 = new javax.swing.JButton();
        recuerdame = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setBorder(new javax.swing.border.MatteBorder(null));
        usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 270, 50));

        contrasenia.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        contrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseniaActionPerformed(evt);
            }
        });
        getContentPane().add(contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 270, 50));

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

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
       
  
  
    
  
    }//GEN-LAST:event_usuarioActionPerformed

    private void recuerdameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recuerdameActionPerformed

   
    }//GEN-LAST:event_recuerdameActionPerformed

    private void contraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseniaActionPerformed
       
    }//GEN-LAST:event_contraseniaActionPerformed

    private void entrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrar2ActionPerformed
    
    }//GEN-LAST:event_entrar2ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contrasenia;
    private javax.swing.JButton entrar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox recuerdame;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

    private void usuario(String usuario, String contra, String string, String medico) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
