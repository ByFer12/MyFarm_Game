
package cells;

import enums.EstadoCelda;
import enums.TipoCelda;
import java.awt.BorderLayout;
import javax.swing.*;
import org.netbeans.lib.awtextra.AbsoluteLayout;


public class Desierto implements Celda{
    private TipoCelda image;
    
    public Desierto(TipoCelda image){
        this.image=image;
    }

    @Override
    public void setImage(EstadoCelda image, boolean libre) {
        
    }
    
    public JPanel getPanel(){
        JPanel panel = new JPanel(new BorderLayout());
        ImageIcon icon = new ImageIcon(image.getResource());
        
        JLabel label =new JLabel();
       
        
        return panel;
        
    }
    
}
