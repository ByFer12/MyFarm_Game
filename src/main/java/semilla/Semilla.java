/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semilla;

import cells.Grama;
import enums.EstadoCelda;
import enums.TipoPlanta;
import enums.TipoProduccionPlanta;
import enums.TipoSemilla;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import objetos.PlantaFruta;

public class Semilla extends Thread {

    protected TipoSemilla tipo;
    protected int tiempoSembrado;
    private boolean paso;
    private final Object lock = new Object();
    private JLabel label;

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public Semilla(TipoSemilla tipo) {
        this.tipo = tipo;
        this.tiempoSembrado = 50;
        this.paso = true;
        this.label = new JLabel();

    }

    @Override
    public void run() {

        while (tiempoSembrado>0) {

            try {
                //falta hace que se actualice el tiempo en la clase Grama asi validar cuando haya llegado a 0 y cambiar de imagen 
                if (tipo == TipoSemilla.FRUTAS) {
                    System.out.println("tiempo sembrado 1: " + tiempoSembrado);

                    synchronized (lock) {
                        tiempoSembrado--;

                    }
                    Semilla.sleep(500);
                    this.getTiempoSembrado();
                } else if (tipo == TipoSemilla.GRANOS) {
                    Semilla.sleep(1500);
                }
            } catch (InterruptedException ex) {
                System.out.println("Error en la ejecucion del hilo semillafruta");

            }
        }

        System.out.println("Paso = " + paso);
        crecer();

    }
    
    
    public void crecer(){
                if (tipo == TipoSemilla.FRUTAS) {
            PlantaFruta planta = new PlantaFruta(TipoPlanta.FRUTA, TipoProduccionPlanta.FRUTA, 20, "Manzana");
            planta.start();
            ImageIcon icon2 = new ImageIcon(EstadoCelda.FRUTA.getResource());

            label.setIcon(new ImageIcon(icon2.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH)));
        }
    }

    public synchronized int getTiempoSembrado() {
        synchronized (lock) {
            return tiempoSembrado;
        }
    }

    public boolean isPaso() {
        return paso;
    }

    public TipoSemilla getTipo() {
        return tipo;
    }

}
