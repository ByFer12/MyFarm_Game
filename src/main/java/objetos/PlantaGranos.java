
package objetos;

import enums.TipoPlanta;
import enums.TipoProduccionPlanta;




public class PlantaGranos extends Planta{

    public PlantaGranos(TipoPlanta planta, TipoProduccionPlanta produccion, String precio, String nombre) {
        super(planta, produccion, precio, nombre);
    }

  
    
    
    @Override
    public void run() {
    }

  
    
}
