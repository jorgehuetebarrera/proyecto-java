
package controlador;

import bbdd.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.Admin;
import vista.Medico;
import vista.Usuario;

public class UsuarioBD {
    private String nombre;
    private String contra;
    private int id;
    private String[] rol={"paciente","admin","medico"};

    public UsuarioBD() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRol(String[] rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContra() {
        return contra;
    }

    public int getId() {
        return id;
    }

    public String[] getRol() {
        return rol;
    }

    public UsuarioBD(String nombre, String contra) {
        this.nombre = nombre;
        this.contra = contra;
        this.id = id;
        this.rol[0] = "paciente";
        this.rol[1]="admin";
        this.rol[2]="medico";
    }

    public boolean iniciarSesion(UsuarioBD usuario) {
       
       String sql = "SELECT * FROM Usuario WHERE Usuario=" + usuario.getNombre() +" AND " + "Contrasena=" + usuario.getContra();
       
       ResultSet resultado = Conexion.EjecutarSentencia(sql);
       
        try {
            if(resultado.next()){
                
                if(resultado.getInt("rol") == 1){
                    
                    new Medico();
                    
                } else if (resultado.getInt("rol") == 2){
                    
                    new Admin();
                    
                } else if (resultado.getInt("rol")== 3){
                    
                    new Usuario();
                    
                }
                
            } 
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                
            }
       
            return false;
    }
    
}
