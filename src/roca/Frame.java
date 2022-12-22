/*
Adorian presenta
Roca 
"La evolucion de una roca puede ser emocionante"-Adorian 
Programa sobre una roca creciendo 
09/10/2020
*/
package roca;

import java.awt.Button;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class Frame extends javax.swing.JFrame {

 ////////////////////////////////////////////////////////////////////////////////////////////// 
    public Frame() {
        initComponents();
    }
//////////////////////////////////////////////////////////////////////////////////////////////  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Base = new javax.swing.JPanel();
        TextNumeros = new javax.swing.JLabel();
        RocaJpn = new javax.swing.JLabel();
        Pasareltiempo = new javax.swing.JLabel();
        Perfil = new javax.swing.JLabel();
        txtHora = new javax.swing.JLabel();
        Punto2 = new javax.swing.JLabel();
        txtMinutos = new javax.swing.JLabel();
        Punto1 = new javax.swing.JLabel();
        txtSegundos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RocaPrueba");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(170, 238, 170, 238));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setLocation(new java.awt.Point(800, 400));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setPreferredSize(new java.awt.Dimension(388, 500));
        setSize(new java.awt.Dimension(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Base.setBackground(new java.awt.Color(255, 255, 255));
        Base.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Base.setMinimumSize(new java.awt.Dimension(176, 251));
        Base.setPreferredSize(new java.awt.Dimension(176, 251));

        TextNumeros.setText("0...Años");

        RocaJpn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Roca.png"))); // NOI18N

        Pasareltiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonP.png"))); // NOI18N
        Pasareltiempo.setText("Pasar el tiempo");
        Pasareltiempo.setIconTextGap(-103);
        Pasareltiempo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasareltiempoMouseClicked(evt);
            }
        });

        Perfil.setText("Perfil");
        Perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PerfilMouseClicked(evt);
            }
        });

        txtHora.setText("00");

        Punto2.setText(":");

        txtMinutos.setText("00");

        Punto1.setText(":");

        txtSegundos.setText("00");

        javax.swing.GroupLayout BaseLayout = new javax.swing.GroupLayout(Base);
        Base.setLayout(BaseLayout);
        BaseLayout.setHorizontalGroup(
            BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BaseLayout.createSequentialGroup()
                .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BaseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BaseLayout.createSequentialGroup()
                                .addComponent(Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(txtHora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Punto1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMinutos))
                            .addComponent(RocaJpn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Punto2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSegundos))
                    .addComponent(Pasareltiempo))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        BaseLayout.setVerticalGroup(
            BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BaseLayout.createSequentialGroup()
                .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHora)
                    .addComponent(txtMinutos)
                    .addComponent(txtSegundos)
                    .addComponent(Punto1)
                    .addComponent(Punto2))
                .addGap(29, 29, 29)
                .addComponent(RocaJpn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pasareltiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Base, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Base, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//variables esas
   private int anos=0;
   private int Dureza;
   private String comentario;
   private int raza;
   private String esps;
   private String tiempo;
 //relog   
   public class cronometro implements ActionListener{
        public void actionPerformed(ActionEvent evt){
           //Calendaria Gregoriano
           GregorianCalendar tiempo=new GregorianCalendar();
           
           //Variables Basicas 
           int hora,minutos,segundos;
           //Variables con el tiempo del calendario
           hora=tiempo.get(Calendar.HOUR);
           minutos=tiempo.get(Calendar.MINUTE);
           segundos=tiempo.get(Calendar.SECOND);
           //Variables para volver el string horas
           txtHora.setText(String.valueOf(hora));
           txtMinutos.setText(String.valueOf(minutos));
           txtSegundos.setText(String.valueOf(segundos));
           
        }
    }       
   private Timer timer;
  //Cosa de eventos 
    private void PasareltiempoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasareltiempoMouseClicked
        // TODO add your handling code here:
        
        anos=anos+10;
      String numero= String.valueOf(anos);
       TextNumeros.setText(numero+"..Años");
       //Linea de introduccion hacia el perfil.....
       if(anos==10){
         anos=anos+1;
         raza=1;
         JOptionPane.showMessageDialog(null,".................","Notificacion",JOptionPane.INFORMATION_MESSAGE);
         JOptionPane.showMessageDialog(null,"......","Notificacion",JOptionPane.INFORMATION_MESSAGE);
         JOptionPane.showMessageDialog(null,"Mientras estas aburrido pasando el tiempo....","Notificacion",JOptionPane.INFORMATION_MESSAGE);
         JOptionPane.showMessageDialog(null,"Pasas un año descubriendo como eres....","Notificacion",JOptionPane.INFORMATION_MESSAGE);
        }
       
              //Primera linea despues del primer año.............................................................. 
                if( anos == 101 )
                 {
                JOptionPane.showMessageDialog(null,"Te vuelves mas duro por la erosion del tiempo...","Notificacion",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,"Dureza +1...","Notificacion",JOptionPane.INFORMATION_MESSAGE);
                 Dureza= Dureza+1;
                JOptionPane.showMessageDialog(null,"......","Notificacion",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,"...............","Notificacion",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,"......Lamentablemente, sigues siendo una roca","Notificacion",JOptionPane.INFORMATION_MESSAGE);
                 }  
             
               //Segunda linea despues de los primeros 200 años..............................................................
                 if( anos == 201 )
                 {
                JOptionPane.showMessageDialog(null,"Te vuelves mas duro por la erosion del tiempo...","Notificacion",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,"Dureza +1...","Notificacion",JOptionPane.INFORMATION_MESSAGE);
                 Dureza= Dureza+1;
                JOptionPane.showMessageDialog(null,".................","Notificacion",JOptionPane.INFORMATION_MESSAGE);
                 }
                 
              //Tercera linea despues de los primeros 300 años.............................................................. 
                  if( anos == 301 )
                 {
                JOptionPane.showMessageDialog(null,"Te vuelves mas duro por la erosion del tiempo...","Notificacion",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,"Dureza +1...","Notificacion",JOptionPane.INFORMATION_MESSAGE);
                Dureza= Dureza+1;
                JOptionPane.showMessageDialog(null,".................","Notificacion",JOptionPane.INFORMATION_MESSAGE);
                 }
               
                  if( anos == 301 ){
                JOptionPane.showMessageDialog(null,"No te das cuenta del pasar del tiempo.....","Notificacion",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,"Parpadeas y el tiempo ha cambiado......","Notificacion",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,"O eso seria....si pudieras parpader..........","Notificacion",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,"Edad +110...","Notificacion",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,".................","Notificacion",JOptionPane.INFORMATION_MESSAGE);
                anos=anos +110;
                } 
                  
             //Quinta linea despues de los primeros 411 años............................................   
                if( anos == 501 ){
               JOptionPane.showMessageDialog(null,"Te vuelves mas duro por la erosion del tiempo...","Notificacion",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,"Dureza +1...","Notificacion",JOptionPane.INFORMATION_MESSAGE);
                Dureza= Dureza+1;
                JOptionPane.showMessageDialog(null,".................","Notificacion",JOptionPane.INFORMATION_MESSAGE);  
                 }  

            //Sexta linea despues de los primeros 601 años............................................
                if(anos>=601){
                        anos=anos+10;
                    }

                 if( anos == 611 ){
               JOptionPane.showMessageDialog(null,"Te vuelves mas duro por la erosion del tiempo...","Notificacion",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,"Dureza +1...","Notificacion",JOptionPane.INFORMATION_MESSAGE);
                Dureza= Dureza+1;
                JOptionPane.showMessageDialog(null,".................","Notificacion",JOptionPane.INFORMATION_MESSAGE); 
                JOptionPane.showMessageDialog(null,"......................","Notificacion",JOptionPane.INFORMATION_MESSAGE); 
                JOptionPane.showMessageDialog(null,"Sientes como lentamente algo esta cambiando dentro de ti......","Notificacion",JOptionPane.INFORMATION_MESSAGE);  
                 }

             //Septima linea despues de los primeros 701 años............................................       


    }//GEN-LAST:event_PasareltiempoMouseClicked

    private void PerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PerfilMouseClicked
        // TODO add your handling code here:
        //Raza Roca Ignea//
        if(raza==1){   
            
           if(Dureza==0){
            Dureza=Dureza+3;
            }    
          esps="Roca Ignea";    
          tiempo="Segun el Ciclo litológico viviras mucho tiempo....";
          comentario="!!!Felicidades eres lo que toda persona quiere ser¡¡¡";
        }
       //Comentarios////////     
        if(Dureza>=7){
            comentario="Sorprendentemente cada ves te estas poniendo mas duro.....";
        }  
        
       //Perfil ////////  
        JOptionPane.showMessageDialog(null,">Raza: "+esps+
                                         "\n>Dureza: "+Dureza+
                                         "\n>Edad: "+anos+
                                         "\n>Tiempo Estimado de vida: "+"\n"+tiempo+
                                         "\n>Comentarios: "+"\n"+comentario,
                                         "Perfil Personal",JOptionPane.INFORMATION_MESSAGE);
         
        
        
        
    }//GEN-LAST:event_PerfilMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        timer=new Timer(1000,new cronometro());
        timer.start();
   
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JOptionPane.showMessageDialog(null, "La roca.....meditara hasta la proxima ves........");
    }//GEN-LAST:event_formWindowClosing

 
  // Main thing to set frame cosa
    public static void main(String args[]) {
     

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Base;
    private javax.swing.JLabel Pasareltiempo;
    private javax.swing.JLabel Perfil;
    private javax.swing.JLabel Punto1;
    private javax.swing.JLabel Punto2;
    private javax.swing.JLabel RocaJpn;
    private javax.swing.JLabel TextNumeros;
    private javax.swing.JLabel txtHora;
    private javax.swing.JLabel txtMinutos;
    private javax.swing.JLabel txtSegundos;
    // End of variables declaration//GEN-END:variables
}
