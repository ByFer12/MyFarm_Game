/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cells;

import semilla.Semilla;
import enums.EstadoCelda;
import enums.TipoCelda;
import enums.TipoSemilla;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.border.Border;

import objetos.*;

/**
 *
 * @author tuxrex
 */
public class Grama implements Celda {

    private Parcela parcelas;
    private Animal animales[], animal;
    private Planta plantas[], planta;
    private boolean estado;
    private TipoCelda image;

    Border borde = BorderFactory.createLineBorder(Color.BLACK, 1);

    public Grama(TipoCelda image) {
        this.image = image;

        this.parcelas = null;
        this.animales = null;
        this.plantas = null;
        this.estado = true;

    }

    @Override
    public void setImage(EstadoCelda image, boolean libre) {

    }

    //creamos el panel que se mostrara como casilla en la matriz que retorne un jpanel
    public JPanel mostrarPanel() {
        //creamos el jpanel que contendra cada una de las casillas (labels)
        JPanel panel = new JPanel(new BorderLayout());
        //creamos un objeto icon para setear la imagen al label que posteriormente crearemos
        var icon = new ImageIcon(image.getResource());

//creamos un label que representara cada casilla
        JLabel label1 = new JLabel();
        //seteamos la imagen del label
        label1.setIcon(new ImageIcon(icon.getImage().getScaledInstance(200, 130, Image.SCALE_SMOOTH)));

        //agregamos un jpopupmenu
        label1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    JPopupMenu popupMenu = new JPopupMenu();
                    popupMenu.add(new JMenuItem("Opción 1"));
                    popupMenu.add(new JMenuItem("Opción 2"));
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
        //a;adimos el label al panel que hemos creado  
        panel.add(label1, BorderLayout.CENTER);
        //le colocamos un borde a cada casilla
        panel.setBorder(borde);
        // retornamos cada panel, cada casilla
        return panel;
    }

    //funcion que siembra, recibe un objeto semilla
    public void sembrar(Semilla semilla) {
        if (this.estado) {
            semilla = new Semilla(TipoSemilla.GRANOS);
        }

    }

    public TipoCelda viewImage() {
        return this.image;
    }

    public void limpiar() {

    }

    public void colocarParcela() {

    }

    public void colocarAnimal() {

    }

    public void cosechar() {

    }

}
