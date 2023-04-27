package cells;

import semilla.Semilla;
import enums.*;
import frontend.Principal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

import objetos.*;

/**
 *
 * @author tuxrex
 */
public class Grama implements Celda {

    private boolean estado, parcela;
    private Semilla semilla;
    private JLabel label;
    private ImageIcon icon;
    private EstadoCelda estadoCelda;
    private int time;
    private Jugador jugador;
    private TipoCelda image;

    Border borde = BorderFactory.createLineBorder(Color.BLACK, 1);

    public Grama(TipoCelda image) {
        this.image = image;
        label = new JLabel();
        this.semilla = null;
        this.estado = true;
        this.parcela = false;
        label.setSize(215, 165);
        this.jugador=Principal.getJugador();

    }

    //creamos el panel que se mostrara como casilla en la matriz que retorne un jpanel
    @Override
    public JPanel mostrarPanel() {
        //creamos el jpanel que contendra cada una de las casillas (labels)
        JPanel panel;
        panel = new JPanel(new BorderLayout());

        icon = new ImageIcon(image.getResource());

        label.setIcon(new ImageIcon(icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH)));
        //agregamos un jpopupmenu
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {

                    JPopupMenu popupMenu = new JPopupMenu();

                    JMenu sembrar = new JMenu("Sembrar");
                    JMenuItem fruta = new JMenuItem("Fruta");
                    JMenuItem grano = new JMenuItem("Grano");
                    sembrar.add(fruta);
                    sembrar.add(grano);
                    JMenuItem cosechar = new JMenuItem("Cosechar");
                    JMenuItem limpiar = new JMenuItem("Limpiar");
                    JMenuItem crearParcela = new JMenuItem("Crear Parcela");
                    JMenuItem addAnimal = new JMenuItem("Agregar animal");

                    popupMenu.add(sembrar);
                    popupMenu.add(cosechar);
                    popupMenu.add(limpiar);
                    popupMenu.add(crearParcela);
                    popupMenu.add(cosechar);
                    popupMenu.add(addAnimal);
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());

                    crearParcela(crearParcela);
                    limpiar(limpiar);
                    cosechar(cosechar);
                    colocarAnimal(addAnimal);
                    fruta(fruta);
                    grano(grano);
                }
            }
        });//------------------------------------------------

        //a;adimos el label al panel que hemos creado  
        panel.add(label, BorderLayout.CENTER);
        //le colocamos un borde a cada casilla
        panel.setBorder(borde);
        // retornamos cada panel, cada casilla
        return panel;
    }

    //funcion que siembra fruta
    public void fruta(JMenuItem fruta) {

        fruta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (estado) {
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la fruta: ");
                    if (nombre != null) {
                        semilla = new Semilla(TipoSemilla.FRUTAS, nombre);
                        ImageIcon icon2 = new ImageIcon(estadoCelda.SEMBRADO.getResource());
                        label.setIcon(new ImageIcon(icon2.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH)));
                        estado = false;
                        semilla.setLabel(label);
                        semilla.start();
                        JOptionPane.showMessageDialog(null, "Semilla sembrado correctamente  " + semilla);
                    }
                    System.out.println("Adios");

                } else {
                    JOptionPane.showMessageDialog(null, "Ya no puedes sembrar perra, esta ocupado la casilla");
                }

            }

        });

    }

    public void grano(JMenuItem grano) {
        grano.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (estado) {
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la planta");
                    if (nombre != null) {
                        semilla = new Semilla(TipoSemilla.GRANOS, nombre);
                        ImageIcon icon2 = new ImageIcon(estadoCelda.SEMBRADO.getResource());
                        label.setIcon(new ImageIcon(icon2.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH)));
                        estado = false;
                        semilla.setLabel(label);
                        JOptionPane.showMessageDialog(null, "Semilla sembrado correctamente");
                        semilla.start();
                    }
                    System.out.println("Adios");
                } else {
                    JOptionPane.showMessageDialog(null, "No puedes sembrar, terreno ocupado");
                }

            }

        });

    }

    public void limpiar(JMenuItem limpiar) {

        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (estado) {
                    JOptionPane.showMessageDialog(null, "El terreno esta limpio pedazo de idiota");
                } else {
                    if (semilla.isFruta()) {
                        semilla.detenerPlantas();

                    }
                    if (semilla.isGrano()) {

                        semilla.detenerGranos();
                    }
                    semilla.detener();
                    semilla = null;
                    label.setIcon(new ImageIcon(icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH)));
                    JOptionPane.showMessageDialog(null, "Terreno limpiado, ahora puedes sembrar  ");

                    estado = true;
                }
            }

        });

    }

    public void cosechar(JMenuItem cosechar) {
        cosechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (estado) {
                    JOptionPane.showMessageDialog(null, "No puedes cosechar en un terreno limpio burro: ");

                } else {
                    if(semilla.getTipo()==TipoSemilla.FRUTAS){
                        jugador.agregarPlanta(semilla.getPlanta());
                    }
                    if(semilla.getTipo()==TipoSemilla.GRANOS){
                        jugador.agregarPlanta(semilla.getGranos());
                    }
                    JOptionPane.showMessageDialog(null, "Cosechado correctamente..." + semilla.getPlanta().getNombre());
                    jugador.listarPlantas();
                }

            }

        });

    }

    public void crearParcela(JMenuItem colocarParcela) {

        colocarParcela.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                if (estado) {
                    JOptionPane.showMessageDialog(null, "Parcela colocado correctamente");
                    parcela = true;
                    estado = false;
                } else {
                    JOptionPane.showMessageDialog(null, "No puedes colocar parcela, la casilla esta ocupada");
                }
            }

        });

    }

    public TipoCelda viewImage() {
        return this.image;
    }

    public void colocarAnimal(JMenuItem colocarAnimal) {
        colocarAnimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (parcela) {
                    JOptionPane.showMessageDialog(null, "Animal colocado correctamente");
                    estado = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Debes colocar una parcela antes...");
                }

            }

        });

    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

}
