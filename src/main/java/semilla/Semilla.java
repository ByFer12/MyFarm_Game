/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semilla;

import enums.TipoSemilla;

public  class Semilla extends Thread{
    protected TipoSemilla tipo;
    protected int tiempoSembrado;
    
    public Semilla(TipoSemilla tipo){
        this.tipo=tipo;
        this.tiempoSembrado=50;
        
    }
    @Override
    public void run() {
        while(tiempoSembrado>0){
            
            tiempoSembrado--;
            try {
                if(tipo==TipoSemilla.FRUTAS){
                    
                Semilla.sleep(3000);
                }else if(tipo==TipoSemilla.GRANOS){
                    Semilla.sleep(2000);
                }
            } catch (InterruptedException ex) {
                System.out.println("Error en la ejecucion del hilo semillafruta");

            }
        }
        
        
        
    }

    public TipoSemilla getTipo() {
        return tipo;
    }

    public int getTiempoSembrado() {
        return tiempoSembrado;
    }
    
}
