/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.CuentaBD;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 34685
 */
public class CreacionUsuario extends javax.swing.JFrame {

    /**
     * Creates new form CreacionUsuario
     */
    public CreacionUsuario() {
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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputMedicacion = new javax.swing.JTextArea();
        añadir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        inputUsuario = new javax.swing.JTextField();
        inputContrasena = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        inputMedicacion.setColumns(20);
        inputMedicacion.setRows(5);
        jScrollPane1.setViewportView(inputMedicacion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 450, 250));

        añadir.setText("Añadir");
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });
        getContentPane().add(añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        jLabel4.setText("medicacion/enfermedades");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));
        getContentPane().add(inputUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 160, -1));
        getContentPane().add(inputContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 160, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondomedico.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
    String usuario = inputUsuario.getText();
    String contraseña = contrasena.getText();
    String medicación = medicacion.getText();
    
   
    CuentaBD cuentaDB = new CuentaBD();
    
    // Llamar al método de la clase CuentaBD para insertar los datos en la tabla cuenta
    cuentaDB.insertarCuenta(usuario, contraseña, medicación);
    
    // Actualizar la tabla en la interfaz gráfica con los nuevos datos
    DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
    Object[] fila = new Object[3];
    fila[0] = cuentaDB.obtenerUltimoID(); // Obtener el último ID insertado en la tabla
    fila[1] = usuario;
    fila[2] = "rol"; // Reemplazar "rol" con el valor correspondiente
    modelo.addRow(fila);
    
    // Limpiar los campos de texto después de la inserción
    inputUsuario.setText("");
    jTextField2.setText("");
    jTextArea1.setText("");
}
    }//GEN-LAST:event_añadirActionPerformed

  
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadir;
    private javax.swing.JTextField inputContrasena;
    private javax.swing.JTextArea inputMedicacion;
    private javax.swing.JTextField inputUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
