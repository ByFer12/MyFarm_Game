/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cells;

import enums.EstadoCelda;
import javax.swing.JLabel;

/**
 *
 * @author tuxrex
 */
public interface Celda {
    
    /**
     *
     * @param image
     * @param libre
     */
    public void setImage(EstadoCelda image, boolean libre);
    
   
}
