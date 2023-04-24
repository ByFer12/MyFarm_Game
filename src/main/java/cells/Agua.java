package cells;

import enums.*;
import frontend.Principal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import objetos.*;

public class Agua implements Celda {

    private TipoCelda image;
    private Barco barco;
    private Jugador jugador;
    private JLabel label;
    private ImageIcon icon;
    private EstadoCelda estadoCelda;
    Border borde = BorderFactory.createLineBorder(Color.BLACK, 1);
    private boolean estado, estadoBarco;

    public Agua(TipoCelda image) {
        this.image = image;
        estado = true;
        estadoBarco = false;
        jugador = Principal.getJugador();
        icon = new ImageIcon(image.getResource());
        label = new JLabel();
        label.setSize(215, 165);
    }

    @Override
    public void setImage(EstadoCelda image, boolean libre) {
    }

    @Override
    public JPanel mostrarPanel() {
        JPanel panel = new JPanel(new BorderLayout());

        label.setIcon(new ImageIcon(icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH)));

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {

                    JPopupMenu popup = new JPopupMenu();

                    JMenuItem ponerBarco = new JMenuItem("Agregar barco");
                    JMenuItem quitarBarco = new JMenuItem("Quitar barco");

                    popup.add(ponerBarco);
                    popup.add(quitarBarco);
                    popup.show(e.getComponent(), e.getX(), e.getY());

                    colocarBarco(ponerBarco);
                    quitarBarco(quitarBarco);

                }

            }
        });
        panel.add(label, BorderLayout.CENTER);
        //le colocamos un borde a cada casilla
        panel.setBorder(borde);

        return panel;
    }

    public void colocarBarco(JMenuItem ponerBarco) {
        ponerBarco.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (estado) {
                    estado = false;
                    estadoBarco = true;
                    barco = new Barco();
                    jugador.setMonedas(barco.getPrecio());
       
                    ImageIcon icon2= new ImageIcon(estadoCelda.PESCANDO.getResource());
                    label.setIcon(new ImageIcon(icon2.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH)));
                    JOptionPane.showMessageDialog(null, "Barco agregado correctamente");
                    

                } else {
                    JOptionPane.showMessageDialog(null, "No puede agregar el barco no sea mula");
                }
            }

        });

    }
    

    public void quitarBarco(JMenuItem quitarBarco) {
        quitarBarco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                if (estadoBarco) {
                    label.setIcon(new ImageIcon(icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH)));
                    barco=null;
                    JOptionPane.showMessageDialog(null, "Barco removido correctamente");
                    estado=true;
                } else {
                    JOptionPane.showMessageDialog(null, "No puede quitar barco porque no hay barco");
                }
            }

        });
    }
    

    public TipoCelda getImage() {
        return image;
    }

    public void setImage(TipoCelda image) {
        this.image = image;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public Border getBorde() {
        return borde;
    }

    public void setBorde(Border borde) {
        this.borde = borde;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isEstadoBarco() {
        return estadoBarco;
    }

    public void setEstadoBarco(boolean estadoBarco) {
        this.estadoBarco = estadoBarco;
    }

}
