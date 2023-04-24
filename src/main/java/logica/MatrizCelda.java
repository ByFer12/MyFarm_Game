package logica;

import cells.*;
import enums.TipoCelda;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class MatrizCelda {

    //creamos la matriz grama por el momento 
    private Celda celda[][];

    public MatrizCelda() {
        crearCeldas();
    }

    //como esta es la clase matriz, debe contener el panel general
    //quqe contiene a toda la matriz de casillas
    public JPanel panelTotal() {
        //creamos el panel total
        JPanel panelTot = new JPanel(new GridLayout(5, 5));
        //lo seteamos a gird layaut e introducimos cada casilla dentro del panel total 
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                //agregamos cada casilla dentro del panell total de 6*5
                panelTot.add(this.celda[i][j].mostrarPanel());
            }
        }
        //retornamos el panel total
        return panelTot;

    }

    public void crearCeldas() {
        //indicamos el valor de sus dimensiones
        celda = new Celda[5][5];
        //recorremos cada casilla de la matriz y le colocamos un jpanel que contiene un label en dicha matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int porcentajeCelda = (int) (Math.random() * 101);

                if (porcentajeCelda < 41) {

                    this.celda[i][j] = new Grama(TipoCelda.GRAMA);
                }else if(porcentajeCelda>41 && porcentajeCelda<76){
                     this.celda[i][j] = new Agua(TipoCelda.AGUA);
                    
                }else{
                     this.celda[i][j] = new Desierto(TipoCelda.DESIERTO);
                }

            }
        }

    }

}
