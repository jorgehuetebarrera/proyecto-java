
package modelo;


public class Usuario {
    private String nombre;
    private String contra;
    private int id;
    private String[] rol={"paciente","admin","medico"};

    public Usuario() {
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

    public Usuario(String nombre, String contra, int id,String rol) {
        this.nombre = nombre;
        this.contra = contra;
        this.id = id;
        this.rol[0] = "paciente";
        this.rol[1]="admin";
        this.rol[2]="medico";
    }
    
}
