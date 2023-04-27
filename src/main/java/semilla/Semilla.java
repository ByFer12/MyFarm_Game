/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semilla;

import enums.*;
import java.awt.Image;
import javax.swing.*;
import objetos.PlantaFruta;
import objetos.PlantaGranos;

public class Semilla extends Thread {

    protected TipoSemilla tipo;
    protected int tiempoSembrado;
    private boolean paso,frutas,granos;
    private JLabel label;
    private PlantaFruta planta;
    private PlantaGranos granosP;
    private ImageIcon icon2;
    private String nombre;

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public Semilla(TipoSemilla tipo, String nombre) {
        this.tipo = tipo;
        this.tiempoSembrado = 30;
        this.paso = true;
        this.frutas=false;
        this.granos=false;
        this.nombre = nombre;
    }

    public boolean isFruta() {
        return frutas;
    }
    public boolean isGrano(){
        return granos;
    }

    @Override
    public void run() {

        while (tiempoSembrado > 0) {

            try {
                //falta hace que se actualice el tiempo en la clase Grama asi validar cuando haya llegado a 0 y cambiar de imagen 
                if (tipo == TipoSemilla.FRUTAS) {
                    System.out.println("tiempo Fruta: " + tiempoSembrado);
                    tiempoSembrado--;

                    Semilla.sleep(600);
                } else if (tipo == TipoSemilla.GRANOS) {
                    System.out.println("tiempo Grano: " + tiempoSembrado);
                    tiempoSembrado--;
                    Semilla.sleep(500);
                }
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(null, "Terreno limpiado correctamente");
                paso = false;

            }
        }

        System.out.println("Paso = " + paso);
        if (paso) {

            crecer();
        }

    }

    public void detener() {
        tiempoSembrado = 0;
        interrupt();

    }
    
    public void detenerPlantas(){
        planta.detener();
    }
    public void detenerGranos(){
        granosP.detener();
    }

    public void crecer() {
        if (tipo == TipoSemilla.FRUTAS) {
        this.frutas=true;
            planta = new PlantaFruta(this.tipo, TipoProduccionPlanta.FRUTA, 20, this.nombre);
            icon2 = new ImageIcon(EstadoCelda.FRUTA.getResource());
            label.setIcon(new ImageIcon(icon2.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH)));
            planta.start();
        } else if (tipo == TipoSemilla.GRANOS) {
            this.granos=true;
            granosP = new PlantaGranos(this.tipo, TipoProduccionPlanta.GRANO, 10, "");
            icon2 = new ImageIcon(EstadoCelda.GRANO_LISTO.getResource());
            label.setIcon(new ImageIcon(icon2.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH)));
            granosP.start();
        }
    }

    public PlantaFruta getPlanta() {
        return planta;
    }

    public PlantaGranos getGranos() {
        return granosP;
    }

    public boolean isPaso() {
        return paso;
    }

    public TipoSemilla getTipo() {
        return tipo;
    }

}
