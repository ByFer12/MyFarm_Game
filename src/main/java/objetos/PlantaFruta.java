/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import enums.TipoProduccionPlanta;
import enums.TipoSemilla;
import javax.swing.JOptionPane;

/**
 *
 * @author tuxrex
 */
public class PlantaFruta extends Planta {

    public PlantaFruta(TipoSemilla planta, TipoProduccionPlanta produccion, int precio, String nombre) {
        super(planta, produccion, precio, nombre);
    }

    @Override
    public void run() {
        while (vida > 0) {
            vida--;

            try {
                PlantaFruta.sleep(500);
                System.out.println("Vida frutaplanta" + vida);
                if (vida == 50) {
                    JOptionPane.showMessageDialog(null, "Puede cosechar el producto");
                }
            } catch (InterruptedException ex) {
                System.out.println("Error en la vida");
            }
        }
    }
       public void detener(){
        vida=0;
        interrupt();
    }


}
