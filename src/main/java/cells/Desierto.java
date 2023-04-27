package cells;

import enums.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.border.Border;

public class Desierto implements Celda {

    private TipoCelda image;

    Border borde = BorderFactory.createLineBorder(Color.BLACK, 1);

    public Desierto(TipoCelda image) {
        this.image = image;
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
