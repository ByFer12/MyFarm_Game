/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 *
 * @author tuxrex
 */
public enum TipoSemilla {
    GRANOS(10),
    FRUTAS(25);
    
    private int precio;
    private TipoSemilla(int precio){
        this.precio=precio;
    }
    
    
    public int getPrecio(){
        return this.precio;
    }
    
}
