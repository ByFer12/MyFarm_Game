/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import cells.Agua;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Barco extends Thread {
    
    private int precio;
    Pescado[]pecesAgua;
    Pescado[]pecesBarco;
    
    public Barco(){
        precio=100;
       
        
    }

    
    
    
    @Override
    public void run(){
        pecesBarco=new Pescado[pecesAgua.length];
        for (int i = 0; i < pecesAgua.length; i++) {
            pecesBarco[i]=pecesAgua[i];
            pecesAgua[i]=null;
            System.out.println("Pasando el pescado No: "+(i+1));
            try {
                Barco.sleep(500);
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(null, "Error");
            }
            
        }
        JOptionPane.showMessageDialog(null, "Barco lleno, debe recoger sus pescados");
        
    }
    
    
    
    public Pescado[] getPecesAgua() {
        return pecesAgua;
    }

    public void setPecesAgua(Pescado[] pecesAgua) {
        this.pecesAgua = pecesAgua;
    }

    public Pescado[] getPecesBarco() {
        return pecesBarco;
    }

    public void setPecesBarco(Pescado[] pecesBarco) {
        this.pecesBarco = pecesBarco;
    }
    
    public int getPrecio() {
        return precio;
    }
}
