/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import enums.TipoPlanta;
import enums.TipoProduccionPlanta;

/**
 *
 * @author tuxrex
 */
public abstract class Planta extends SerVivo{
    private TipoPlanta planta;
    private TipoProduccionPlanta produccion;
    private String precio;

    public Planta(TipoPlanta planta, TipoProduccionPlanta produccion, String precio, String nombre) {
        super( nombre);
        this.planta = planta;
        this.produccion = produccion;
        this.precio = precio;
       
    }

    public TipoPlanta getPlanta() {
        return planta;
    }

    public void setPlanta(TipoPlanta planta) {
        this.planta = planta;
    }

    public TipoProduccionPlanta getProduccion() {
        return produccion;
    }

    public void setProduccion(TipoProduccionPlanta produccion) {
        this.produccion = produccion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    

    
    @Override
    public abstract void run();
    
}
