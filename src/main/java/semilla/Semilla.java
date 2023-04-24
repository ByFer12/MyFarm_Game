/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semilla;

import cells.Grama;
import enums.TipoSemilla;

public class Semilla extends Thread {

    protected TipoSemilla tipo;
    protected int tiempoSembrado;
    private boolean paso;

    public Semilla(TipoSemilla tipo) {
        this.tipo = tipo;
        this.tiempoSembrado = 50;
        this.paso = false;

    }

    @Override
    public void run() {

        while (tiempoSembrado > 0) {

            try {
                //falta hace que se actualice el tiempo en la clase Grama asi validar cuando haya llegado a 0 y cambiar de imagen 
                if (tipo == TipoSemilla.FRUTAS) {
                    System.out.println("tiempo sembrado 1: " + tiempoSembrado);

                    Grama.time = tiempoSembrado--;
                    Semilla.sleep(1000);
                    this.getTiempoSembrado();
                } else if (tipo == TipoSemilla.GRANOS) {
                    Semilla.sleep(1500);
                }
            } catch (InterruptedException ex) {
                System.out.println("Error en la ejecucion del hilo semillafruta");

            }
        }

    }

    public boolean isPaso() {
        return paso;
    }

    public int getTiempoSembrado() {
        return tiempoSembrado;
    }

    public TipoSemilla getTipo() {
        return tipo;
    }

}
