package controlador;

import bbdd.Conexion;
import static bbdd.Conexion.EjecutarSentencia;
import modelo.Cuenta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.Admin;
import vista.Medico;
import vista.Usuario;


public class CuentaBD {

    public CuentaBD() {   
    }
    
    public Cuenta getCuenta(String usuario, String contrasena){
        
        Cuenta cuenta = null;
        
        String sql = "SELECT * FROM Cuenta WHERE usuario=\""+usuario+"\" AND contrasena=\""+contrasena+"\"";
        ResultSet resultado = Conexion.EjecutarSentencia(sql);
        
        try {
            if(resultado.next()){
                cuenta = new Cuenta(
                                resultado.getString("usuario"),  
                             resultado.getString("contrasena"), 
                                   resultado.getInt("rol")
                                    );
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return cuenta;
    }
    
    
    public boolean iniciarSesion(Cuenta cuenta){
        
                if(cuenta.getRol() == 1){
                    
                    new Medico();
                    
                } else if(cuenta.getRol() == 2){
                    
                    new Admin();
                    
                } else if(cuenta.getRol() == 3){
                    
                    new Usuario();
                } 
               
        return true;
    }
    public static ResultSet obtenerDatosTabla() {
    String consulta = "SELECT id, usuario, rol FROM Cuenta";
    return EjecutarSentencia(consulta);
}

    public void borrarUsuario(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void insertarCuenta(String usuario, String contraseña, String medicación) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
