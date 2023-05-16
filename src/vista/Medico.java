
package vista;

import bbdd.Conexion;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import controlador.CuentaBD;
import java.sql.SQLException;
import javax.swing.JTable;
import vista.CreacionUsuario;



public class Medico extends javax.swing.JFrame {
   
    public Medico() {
        initComponents();
       
        this.setVisible(true);
        
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setColumnCount(0);
        modelo.addColumn("id");
        modelo.addColumn("usuario");
        modelo.addColumn("rol");
        modelo.setRowCount(0);
        try 
        {
           CuentaBD cuentaDB = new CuentaBD();
           ResultSet datos = cuentaDB.obtenerDatosTabla();
           
            while (datos.next()) {
                Object[] fila = new Object[3];
                fila[0] = datos.getObject("id");
                fila[1] = datos.getObject("usuario");
                fila[2] = datos.getObject("rol");
                modelo.addRow(fila);
            }
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crear = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crear.setText("crear usuario");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        getContentPane().add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        borrar.setText("borrar usuario");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        getContentPane().add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        jButton1.setText("ver usuario");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 460, 310));

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 460, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondomedico.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
      new CreacionUsuario();
    }//GEN-LAST:event_crearActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        int filaSeleccionada = tabla.getSelectedRow();
    if (filaSeleccionada != -1) {
        String id = tabla.getValueAt(filaSeleccionada, 0).toString();
        CuentaBD cuentaDB = new CuentaBD(); // Realiza alguna acción en caso de excepción, por ejemplo, mostrar un mensaje de error
        cuentaDB.borrarUsuario(id);
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.removeRow(filaSeleccionada);
    } else {
        // No se ha seleccionado ninguna fila, muestra un mensaje o realiza alguna acción de notificación al usuario
    }
    }//GEN-LAST:event_borrarActionPerformed


   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton crear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
