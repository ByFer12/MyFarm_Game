
package objetos;

import enums.TipoAnimal;
import enums.TipoProduccionAnimal;


public class AnimalOmnivoro extends Animal{

    public AnimalOmnivoro( String nombre, int precio, TipoAnimal animal, TipoProduccionAnimal produccion) {
        super( nombre, precio, animal, produccion);
    }

    
    @Override
    public void run(){
        
    }
    
    
}
