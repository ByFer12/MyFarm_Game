
package objetos;

/**
 *
 * @author tuxrex
 */
public abstract class SerVivo extends Thread {
    
    protected int vida;
    protected String nombre;

    public SerVivo( String nombre) {
        this.vida = 100;
        this.nombre = nombre;
    }
    public SerVivo(){
        
    }
    
    public String getNombre(){
        return nombre;
    }


    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida += vida;
    }
    
    @Override
    public abstract void run();

    
    
    
}
