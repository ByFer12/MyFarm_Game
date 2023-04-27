/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;


public enum EstadoCelda {
    SEMBRADO("/home/tuxrex/NetBeansProjects/my-farm/src/main/java/img/sembrado.jpg"),
    CON_PARCELA("/home/tuxrex/NetBeansProjects/my-farm/src/main/java/img/Parcela.jpg"),
    SIN_PARCELA("/home/tuxrex/NetBeansProjects/my-farm/src/main/java/img/Grama.jpg"),
    CON_ANIMAL("/home/tuxrex/NetBeansProjects/my-farm/src/main/java/img/Animal.jpg"),
    FRUTA_MADURA("/home/tuxrex/NetBeansProjects/my-farm/src/main/java/img/fruta_madura.jpg"),
    GRANO_LISTO("/home/tuxrex/NetBeansProjects/my-farm/src/main/java/img/grano_listo.jpg"),
    PLANTA_PODRIDA("/home/tuxrex/NetBeansProjects/my-farm/src/main/java/img/planta_podrida.jpg"),
    PESCANDO("/home/tuxrex/NetBeansProjects/my-farm/src/main/java/img/Barco.jpg"),
    FRUTA("/home/tuxrex/NetBeansProjects/my-farm/src/main/java/img/fruta.jpg");
    
    
    private String resource;
    
    private EstadoCelda(String resource){
        this.resource=resource;
        
    }

    public String getResource() {
        return resource;
    }
    
    
    
}
