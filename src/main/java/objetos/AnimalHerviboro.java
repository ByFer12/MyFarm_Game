/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import enums.TipoAnimal;
import enums.TipoProduccionAnimal;

/**
 *
 * @author tuxrex
 */
public class AnimalHerviboro  extends Animal{

    public AnimalHerviboro( String nombre, int precio, TipoAnimal animal, TipoProduccionAnimal produccion) {
        super( nombre, precio, animal, produccion);
    }

    
    
    @Override
    public void run() {
        
    }
    
    
}
