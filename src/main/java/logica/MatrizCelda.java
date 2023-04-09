
package logica;

import cells.Grama;
import enums.TipoCelda;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class MatrizCelda {
    //creamos la matriz grama por el momento 
      private  Grama celda[][];
    public MatrizCelda(){
        //indicamos el valor de sus dimensiones
        celda=new Grama[6][5];
        //recorremos cada casilla de la matriz y le colocamos un jpanel que contiene un label en dicha matriz
        for(int i =0; i<6; i++){
            for(int j=0; j<5;j++){
                //agregamos un label a la matriz que hemos creado
                this.celda[i][j]=new Grama( TipoCelda.DESIERTO);
            }
        }
    }
    
    //como esta es la clase matriz, debe contener el panel general
    //quqe contiene a toda la matriz de casillas
    public JPanel panelTotal(){
        //creamos el panel total
        JPanel panelTot = new JPanel(new GridLayout(6, 5));
        //lo seteamos a gird layaut e introducimos cada casilla dentro del panel total 
        for(int i =0;i<6; i++){
            for(int j=0;j<5;j++){
                //agregamos cada casilla dentro del panell total de 6*5
                panelTot.add(this.celda[i][j].mostrarPanel());
            }
        }
        //retornamos el panel total
        return panelTot;
    
}
    
}



