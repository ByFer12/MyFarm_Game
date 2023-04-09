
package logica;

import frontend.Principal;
import objetos.Jugador;


public class ManejadorJugador {
    
    public void iniciarVida(Jugador jug){
        //Iniciamos el hilo del jugador
        Jugador jugador=jug;
        jugador.start();

    }
}
