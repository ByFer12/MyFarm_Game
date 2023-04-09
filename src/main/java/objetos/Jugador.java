/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import javax.swing.JLabel;
import javax.swing.JTextField;



public class Jugador extends SerVivo{
    private String nick;
    private Animal animales[];
    private Planta plantas[];
    private int numAnimales, numPlantas;  
    private JTextField vidaLabel;

    
   
    public Jugador(String nombre, String nick, JTextField vidaLabel){
        super(nombre);
        this.nick=nick;
        this.vidaLabel=vidaLabel;
        this.animales=new Animal[numAnimales];
        this.plantas= new Planta[numPlantas];

    }
    

    
    @Override
    public void run() {
        //implementamos el metodo que hereda la clase thread
        
        while(vida>0){
            //mientras la vidadel jugador es mayor a cero, disminuimos en uno 
            vida--;
            //modificamos el atributo textfield que mandamos de la clase principal
            vidaLabel.setText("      "+vida);
  
            try {
                //interrumpimos el hilo cada 2 segundos
                Jugador.sleep(4000);
                
            } catch (InterruptedException ex) {
                System.out.println("Error al ejecutar hijo vida");
            }
        }
        
        
    }
    
    
    
    
    public int getVida(){
        return vida;
    }
    public void setFieldVida(JTextField vidaField){
        this.vidaLabel=vidaField;
    }

    public String getNick() {
        return nick;
    }

    public Animal[] getAnimales() {
        return animales;
    }

    public Planta[] getPlantas() {
        return plantas;
    }

    public int getNumAnimales() {
        return numAnimales;
    }
    
    public void alimentarse(int aumentarVida){
        this.vida+=aumentarVida;        
    }

    public int getNumPlantas() {
        return numPlantas;
    }

    
    
}
