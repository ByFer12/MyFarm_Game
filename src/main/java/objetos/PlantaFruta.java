/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import enums.TipoPlanta;
import enums.TipoProduccionPlanta;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tuxrex
 */
public class PlantaFruta extends Planta{

    public PlantaFruta(TipoPlanta planta, TipoProduccionPlanta produccion, int precio, String nombre) {
        super(planta, produccion, precio, nombre);
    }

    @Override
    public void run() {
        while(vida>0){
            vida--;
            
            try {
                PlantaFruta.sleep(5000);
            } catch (InterruptedException ex) {
                System.out.println("Error en la vida");
            }
        }
    }
    
}
