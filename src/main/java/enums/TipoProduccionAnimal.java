/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 *
 * @author tuxrex
 */
public enum TipoProduccionAnimal {
    CUERO(100),
    CARNE(200),
    HUEVO(2),
    LECHE(5);
    private  int precio;
    private TipoProduccionAnimal(int precio){
        this.precio=precio;
    }
    public int getPrecio(){
        return precio;
    }
}
