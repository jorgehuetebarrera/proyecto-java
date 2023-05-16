
package Main;

import vista.Intro;
import vista.Login;
import vista.LoginView;
import bbdd.Conexion;
import static bbdd.Conexion.Conectar;


public class Main {

    
    public static void main(String[] args) throws InterruptedException {
        
       LoginView lv = new LoginView();
       Conexion bd = new Conexion();
       lv.setLocationRelativeTo(null);
       lv.setVisible(true);
        
       Thread.sleep(3000);
       
         lv.setVisible(false);
        
         Intro in = new Intro();
         in.setLocationRelativeTo(null);
         in.setVisible(true);
         bd.Conectar();
         
         
         
        
       
    
    }
    
}
