/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import enums.TipoProduccionPlanta;
import enums.TipoSemilla;
import javax.swing.JTextField;
import logica.ManejadorJugador;
import logica.MatrizCelda;
import logica.RecojerPezca;
import objetos.Jugador;
import objetos.Pescado;
import objetos.PlantaFruta;
import objetos.PlantaGranos;

/**
 *
 * @author tuxrex
 */
public class Principal extends javax.swing.JFrame {

    private static Jugador jugador;
    MatrizCelda matriz;

    public Principal(String nombre, String nick) {

        jugador = new Jugador(nombre, nick, txtVida, monedasOro);
        initComponents();
        jugador.setFieldVida(txtVida);
        jugador.setMonedasOross(monedasOro);
        jugador.agregarPlanta(new PlantaFruta(TipoSemilla.FRUTAS, TipoProduccionPlanta.FRUTA, 20, "Manzana"));
        jugador.agregarPlanta( new PlantaGranos(TipoSemilla.GRANOS, TipoProduccionPlanta.GRANO, 5, "Maiz"));
        jugador.listarPlantas();

        matriz = new MatrizCelda();
        panelGranja.add(matriz.panelTotal());
        this.setSize(this.getWidth(), this.getHeight());
        System.out.println("Monedas: "+jugador.getMonedas());

    }
    
    
    public static Jugador getJugador(){
        return Principal.jugador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGranja = new javax.swing.JPanel();
        panelDatos = new javax.swing.JPanel();
        nick = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField(jugador.getNombre());
        txtNick = new javax.swing.JTextField(jugador.getNick());
        vida = new javax.swing.JLabel();
        txtVida = new javax.swing.JTextField("      100");
        botonIniciar = new javax.swing.JButton();
        monedas = new javax.swing.JLabel();
        monedasOro = new javax.swing.JTextField("      "+200);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        recogerPesca = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mercado = new javax.swing.JMenuItem();
        estadistica = new javax.swing.JMenuItem();
        comer = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGranja.setLayout(new java.awt.GridLayout(1, 0));

        nick.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        nick.setText("    Nick");

        nombre.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        nombre.setText("Nombre");

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N

        txtNick.setEditable(false);
        txtNick.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        txtNick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNickActionPerformed(evt);
            }
        });

        vida.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        vida.setText("Vida");

        txtVida.setEditable(false);
        txtVida.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        txtVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVidaActionPerformed(evt);
            }
        });

        botonIniciar.setText("iniciar");
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });

        monedas.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        monedas.setText("Monedas");

        monedasOro.setEditable(false);
        monedasOro.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        monedasOro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monedasOroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                                .addComponent(nick, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNick, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(vida, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(monedas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVida, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(monedasOro, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                        .addComponent(botonIniciar)
                        .addGap(74, 74, 74))))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nick, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monedas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monedasOro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonIniciar)
                .addContainerGap(647, Short.MAX_VALUE))
        );

        jMenu1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenu1.setText("Producto");

        recogerPesca.setText("Recoger Pesca");
        recogerPesca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recogerPescaActionPerformed(evt);
            }
        });
        jMenu1.add(recogerPesca);

        jMenuItem1.setText("Tipo de produccion");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Resultados");

        mercado.setText("Ir al mercado");
        jMenu2.add(mercado);

        estadistica.setText("Ver estadisticas");
        jMenu2.add(estadistica);

        comer.setText("Comer");
        jMenu2.add(comer);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelGranja, javax.swing.GroupLayout.DEFAULT_SIZE, 1109, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGranja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNickActionPerformed

    private void txtVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVidaActionPerformed

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        // TODO add your handling code here:
        //llamamos al metodo que inicia la vida y por lo tanto el juego 
        ManejadorJugador man = new ManejadorJugador();
        man.iniciarVida(jugador);

    }//GEN-LAST:event_botonIniciarActionPerformed

    private void monedasOroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monedasOroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monedasOroActionPerformed

    private void recogerPescaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recogerPescaActionPerformed
        RecojerPezca.recogerPezca();
        jugador.numPezca();
    }//GEN-LAST:event_recogerPescaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciar;
    private javax.swing.JMenuItem comer;
    private javax.swing.JMenuItem estadistica;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mercado;
    private javax.swing.JLabel monedas;
    public javax.swing.JTextField monedasOro;
    private javax.swing.JLabel nick;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelGranja;
    private javax.swing.JMenuItem recogerPesca;
    private javax.swing.JTextField txtNick;
    private javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtVida;
    private javax.swing.JLabel vida;
    // End of variables declaration//GEN-END:variables
}
