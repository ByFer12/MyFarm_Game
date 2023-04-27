package cells;

import enums.*;
import frontend.Principal;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
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
    private Pescado[] peces;
    private Random random=new Random();

    public Agua(TipoCelda image) {
        this.image = image;
        estado = true;
        estadoBarco = false;
        jugador = Principal.getJugador();
        crearPezcados();
    }

    @Override
    public JPanel mostrarPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        icon = new ImageIcon(image.getResource());
        label = new JLabel();
        label.setSize(215, 165);
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

                    ImageIcon icon2 = new ImageIcon(estadoCelda.PESCANDO.getResource());
                    label.setIcon(new ImageIcon(icon2.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH)));
                    JOptionPane.showMessageDialog(null, "Barco agregado correctamente");
                    System.out.println("Peces: "+peces.length);
                    barco.setPecesAgua(peces);
                    barco.start();
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
                    barco = null;
                    JOptionPane.showMessageDialog(null, "Barco removido correctamente");
                    estado = true;
                } else {
                    JOptionPane.showMessageDialog(null, "No puede quitar barco porque no hay barco");
                }
            }

        });
    }

    public void crearPezcados() {
        int numberRandom = random.nextInt(50 - 20 - 1) + 20;
        peces = new Pescado[numberRandom];
        for (int i = 0; i < numberRandom; i++) {
            peces[i] = new Pescado(20);

        }
    }

    public Pescado[] getPeces() {
        return peces;
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
