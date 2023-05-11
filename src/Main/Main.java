
package Main;

import vista.Intro;
import vista.Login;
import vista.LoginView;
import bbdd.conexion;
import static bbdd.conexion.Conectar;


public class Main {

    
    public static void main(String[] args) throws InterruptedException {
        
       LoginView lv = new LoginView();
       conexion bd = new conexion();
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
