
package juegoadivinador;

import Vista.Principal;
import controlador.Controlador;
import modelo.Modelo;

/**
 *
 * @author Colque
 */
public class JuegoAdivinador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Modelo modelo = new Modelo();
        Principal vista = new Principal();
        Controlador controlador = new Controlador( vista , modelo );
        
    }
    
}
