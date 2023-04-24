package cells;

import enums.EstadoCelda;
import enums.TipoCelda;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.*;
import javax.swing.border.Border;


public class Desierto implements Celda {

    private TipoCelda image;
    
Border borde = BorderFactory.createLineBorder(Color.BLACK, 1);

    public Desierto(TipoCelda image) {
        this.image = image;
    }

    @Override
    public void setImage(EstadoCelda image, boolean libre) {

    }

    public JPanel mostrarPanel() {
        JPanel panel = new JPanel(new BorderLayout());

        ImageIcon icon = new ImageIcon(image.getResource());

        JLabel label = new JLabel();
        label.setSize(215, 165);
        label.setIcon(new ImageIcon(icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH)));
        
        
        panel.add(label, BorderLayout.CENTER);
        panel.setBorder(borde);


        return panel;
        

    }

}
