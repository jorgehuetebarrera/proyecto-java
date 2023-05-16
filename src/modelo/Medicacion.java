
package modelo;


public class Medicacion {
    private int id;
    private String usuario;
    private String medicacion;

    public Medicacion(int id, String usuario, String medicacion) {
        this.id = id;
        this.usuario = usuario;
        this.medicacion = medicacion;
    }
    public Medicacion(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMedicacion() {
        return medicacion;
    }

    public void setMedicacion(String medicacion) {
        this.medicacion = medicacion;
    }
    
    
}
