
package objetos;

import enums.TipoPlanta;
import enums.TipoProduccionPlanta;
import enums.TipoSemilla;
import javax.swing.JOptionPane;




public class PlantaGranos extends Planta{

    public PlantaGranos(TipoSemilla planta, TipoProduccionPlanta produccion, int precio, String nombre) {
        super(planta, produccion, precio, nombre);
    }

  
    
    
    @Override
    public void run() {
            while(vida>0){
            vida--;
            
            try {
                PlantaFruta.sleep(500);
                System.out.println("Vida Grano "+vida);
                if(vida==50){
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
