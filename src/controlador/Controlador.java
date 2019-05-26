
package controlador;

import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;

/**
 *
 * @author Colque
 */
public class Controlador implements ActionListener {


    public Principal principal; 
    public Modelo modelo;
    
    public Controlador(Principal principal, Modelo modelo) {
        
        this.principal = principal;
        this.modelo = modelo;
        
        principal.setVisible(true); 
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       
    }
}
