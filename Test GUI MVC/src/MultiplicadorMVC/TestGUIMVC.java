/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiplicadorMVC;

import com.cecar.controlador.Controlador;
import com.cecar.modelo.Modelo;
import com.cecar.vista.GUI;

/**
 *
 * @author Gott
 */
public class TestGUIMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GUI view =new GUI();
        Modelo model= new Modelo();
        
        Controlador ctrl = new Controlador(view, model);
        ctrl.Iniciar();
        view.setVisible(true);
    }
    
}
