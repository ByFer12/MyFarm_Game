/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package objetos;

import enums.TipoAnimal;
import enums.TipoProduccionAnimal;

/**
 *
 * @author tuxrex
 */
public abstract class Animal extends SerVivo{
    private int precio;
    private TipoAnimal animal;
    private TipoProduccionAnimal produccion;
    
    public Animal(String nombre, int precio, TipoAnimal animal, TipoProduccionAnimal produccion){
        super( nombre);
        this.precio=precio;
        this.animal=animal;
        this.produccion=produccion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public TipoAnimal getAnimal() {
        return animal;
    }

    public void setAnimal(TipoAnimal animal) {
        this.animal = animal;
    }

    public TipoProduccionAnimal getProduccion() {
        return produccion;
    }

    public void setProduccion(TipoProduccionAnimal produccion) {
        this.produccion = produccion;
    }
    
    @Override
    public abstract void run();

  
   
    
    
}
