/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import enums.TipoPlanta;
import enums.TipoProduccionPlanta;
import enums.TipoSemilla;

/**
 *
 * @author tuxrex
 */
public abstract class Planta extends SerVivo{
    private TipoSemilla planta;
    private TipoProduccionPlanta produccion;
    private int precio;

    public Planta(TipoSemilla planta, TipoProduccionPlanta produccion, int precio, String nombre) {
        super( nombre);
        this.planta = planta;
        this.produccion = produccion;
        this.precio = precio;
       
    }

    public TipoSemilla getPlanta() {
        return planta;
    }

    public void setPlanta(TipoSemilla planta) {
        this.planta = planta;
    }

    public TipoProduccionPlanta getProduccion() {
        return produccion;
    }

    public void setProduccion(TipoProduccionPlanta produccion) {
        this.produccion = produccion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    

    
    @Override
    public abstract void run();
    
}
