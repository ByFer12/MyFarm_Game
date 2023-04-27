/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import frontend.Principal;
import javax.swing.JOptionPane;
import objetos.*;

public class RecojerPezca {

   static Pescado[] pecesBarco;
    private Pescado[] pecesJugador;
    private static Jugador jugador;

    public RecojerPezca(Pescado[]peces) {
        this.jugador = Principal.getJugador();
        pecesBarco=peces;
    }

    public static void recogerPezca() {

        if (pecesBarco != null) {
            for (int i = 0; i < pecesBarco.length; i++) {
                jugador.aregarPezca(pecesBarco[i]);
                pecesBarco[i] = null;

            }
            JOptionPane.showMessageDialog(null, "Pezca recojida");
        } else {
            JOptionPane.showMessageDialog(null, "Aun no ha completado la pezca, espere...");
        }
        

    }

    public static Pescado[] getPecesBarco() {
        return pecesBarco;
    }



}
