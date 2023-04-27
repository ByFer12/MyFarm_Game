/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import enums.TipoProduccionPlanta;
import enums.TipoSemilla;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Jugador extends SerVivo {

    private String nick;
    private Animal animales[];
    private Planta plantas[];
    private final int NUMERO_ANIMALES = 20, NUMERO_PLANTAS=20,NUM_PECES=500;
    private int numPlant, numAnim,numPez;
    private JTextField vidaLabel, monedasOross;
    private int monedas;
    private Pescado[]peces;

    public Jugador(String nombre, String nick, JTextField vidaLabel, JTextField monedasOross) {
        super(nombre);
        this.nick = nick;
        this.vidaLabel = vidaLabel;
        this.monedasOross = monedasOross;
        this.animales = new Animal[NUMERO_ANIMALES];
        this.plantas = new Planta[NUMERO_PLANTAS];
        this.peces= new Pescado[NUM_PECES];
        this.monedas = 200;
    }

    @Override
    public void run() {
        //implementamos el metodo que hereda la clase thread       
        while (vida > 0) {
            //mientras la vidadel jugador es mayor a cero, disminuimos en uno 
            vida--;
            //modificamos el atributo textfield que mandamos de la clase principal
            vidaLabel.setText("      " + vida);
            try {
                //interrumpimos el hilo cada 2 segundos
                Jugador.sleep(2000);

            } catch (InterruptedException ex) {
                System.out.println("Error al ejecutar hijo vida");
            }
        }
    }
    public void aregarPezca(Pescado pez){
        if(this.numPez<NUM_PECES){
            this.peces[numPez++]=pez;
        }else{
            JOptionPane.showMessageDialog(null, "No puedes agregar mas pescado, necesita vender");
        }
        
    }
       public void numPezca(){
        System.out.println("Numero de pezcados:  "+numPez);

    }

    public void agregarPlanta(Planta planta) {
        if (this.numPlant < NUMERO_PLANTAS) {
            this.plantas[numPlant++] = planta;
        }else{
            JOptionPane.showMessageDialog(null, "No puedes agregar mas plantas");
        }
    }
    
    public void listarPlantas(){
        System.out.println("Lista de plantas: ");
        for(int i=0; i<numPlant; i++){
            System.out.println("Plantas: "+plantas[i].getNombre());
        }
    }

    public int getMonedas() {
        return this.monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas -= monedas;
        this.monedasOross.setText("      " + this.monedas);
    }


    public JTextField getMonedasOross() {
        return monedasOross;
    }

    public void setMonedasOross(JTextField monedasOross) {
        this.monedasOross = monedasOross;
    }

    public void setFieldVida(JTextField vidaField) {
        this.vidaLabel = vidaField;
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


    public void alimentarse(int aumentarVida) {
        this.vida += aumentarVida;
    }


}
