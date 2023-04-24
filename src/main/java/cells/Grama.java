package cells;

import semilla.Semilla;
import enums.EstadoCelda;
import enums.TipoCelda;
import enums.TipoPlanta;
import enums.TipoProduccionPlanta;
import enums.TipoSemilla;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private boolean estado, parcela;
    private Semilla semilla;
    private JLabel label;
    private ImageIcon icon;
    private EstadoCelda estadoCelda;
public static int time;

    private TipoCelda image;

    Border borde = BorderFactory.createLineBorder(Color.BLACK, 1);

    public Grama(TipoCelda image) {
        this.image = image;
        label = new JLabel();
        this.parcelas = null;
        this.animales = null;
        this.plantas = null;
        this.semilla = null;
        this.estado = true;
        this.parcela = false;
        label.setSize(215, 165);

    }

    @Override
    public void setImage(EstadoCelda image, boolean libre) {

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

                    JMenuItem sembrar = new JMenuItem("Sembrar");
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
                    sembrar(sembrar);
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

    //funcion que siembra, recibe un objeto semilla
    public void sembrar(JMenuItem sembrar) {

        sembrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (estado) {
                    semilla = new Semilla(TipoSemilla.FRUTAS);
                    ImageIcon icon2 = new ImageIcon(estadoCelda.SEMBRADO.getResource());
                    label.setIcon(new ImageIcon(icon2.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH)));
                    JOptionPane.showMessageDialog(null, "Semilla sembrado correctamente");
                    estado = false;
                    semilla.start();
                    System.out.println("Hola "+time);
                    if( time==1){
                        semilla.interrupt();
                        crecidaPlanta();
                    }


                } else {
                    JOptionPane.showMessageDialog(null, "Ya no puedes sembrar perra, esta ocupado la casilla");
                }

            }

        });

    }


    public void crecidaPlanta() {
        if (semilla.getTipo() == TipoSemilla.FRUTAS) {
            planta = new PlantaFruta(TipoPlanta.FRUTA, TipoProduccionPlanta.FRUTA, 20, "Manzana");
            planta.start();
            ImageIcon icon2 = new ImageIcon(estadoCelda.FRUTA.getResource());

            label.setIcon(new ImageIcon(icon2.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH)));
        }
    }

    public void limpiar(JMenuItem limpiar) {

        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (estado) {
                    JOptionPane.showMessageDialog(null, "El terreno esta limpio pedazo de idiota");
                } else {
                    JOptionPane.showMessageDialog(null, "Limpiando celda.........");
                    JOptionPane.showMessageDialog(null, "Limpiado, ahora puedes sembrar");
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
                    JOptionPane.showMessageDialog(null, "No puedes cosechar en un terreno limpio burro");

                } else {
                    JOptionPane.showMessageDialog(null, "Cosechado correctamente...");
                    estado = true;
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

}
