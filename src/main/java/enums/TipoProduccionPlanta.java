/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;


public enum TipoProduccionPlanta {
    
    GRANO(20),
    FRUTA(10),
    VERDURA(12);
    private int precio;
    
    private TipoProduccionPlanta(int precio){
    this.precio=precio;
}
    
    public int getPrecio(){
        return precio;
    }
    
}
