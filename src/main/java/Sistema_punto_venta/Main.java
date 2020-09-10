
package Sistema_punto_venta;

import Views.Sistema;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) {
            
        }
        Sistema sistema = new  Sistema();
        sistema.setVisible(true);  //esto esta dentro del codigo de JFrame , al colocalrlo en el main , cada vez q se ejecute creara una nueva instancia de  la clase sistema llamando al metodo setVisible(true)      
        sistema.setExtendedState(MAXIMIZED_BOTH); // CON ESTO CADA VEZ Q SE CORRA EL JFRAM EL PROGRAMA UTILIZARA TODA LA PANTALLA 
    }
    
}
