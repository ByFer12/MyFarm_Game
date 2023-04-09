
package enums;

/**
 *
 * @author tuxrex
 */
public enum TipoCelda {
    
    GRAMA("/home/tuxrex/NetBeansProjects/my-farm/src/main/java/img/Grama.jpg"),
    AGUA("/home/tuxrex/NetBeansProjects/my-farm/src/main/java/img/Agua.jpg"),
    DESIERTO("/home/tuxrex/NetBeansProjects/my-farm/src/main/java/img/Arena.jpg");
    private String resource;
    
    private TipoCelda(String resource){
        this.resource=resource;
    }

    public String getResource() {
        return resource;
    }
    
    
    
 
    
}
