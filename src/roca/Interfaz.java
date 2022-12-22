// Cosa de Prueba antes de volverla ventana
package roca;

import javax.swing.JOptionPane;

public class Interfaz 
{   //cosa para intanciar////////////////////////////////////////////////////////////////////////////////////////////////
    public Interfaz()
    {        
    }
    //variables////////////////////////////////////////////////////////////////////////////////////////////////
   private int anos;
   private int Dureza;
   private int raza;
   private String tiempo;
   private String esps;
   private String comentario;
   public int seleccion;

//constructor////////////////////////////////////////////////////////////////////////////////////////////////

    public Interfaz(int anos, int Dureza, int raza, String tiempo, String esps, String comentario) {
        this.anos = anos;
        this.Dureza = Dureza;
        this.raza = raza;
        this.tiempo = tiempo;
        this.esps = esps;
        this.comentario = comentario;
    }

///sets and gets//////////////////////////////////////////////////////////////////////////////////////////

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public int getDureza() {
        return Dureza;
    }

    public void setDureza(int Dureza) {
        this.Dureza = Dureza;
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getEsps() {
        return esps;
    }

    public void setEsps(String esps) {
        this.esps = esps;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

   
 
//metodos////////////////////////////////////////////////////////////////////////////////////////////////
///////////metodo principal
    public  void Inicio ()
    {   
        Interfaz i =new Interfaz();     
///varaibles////////////////////////////////////////////////     
         seleccion=0;
         
//Mensaje inicial////////////////////////////////////////////////
         JOptionPane.showMessageDialog(null,"Eres una roca",null,JOptionPane.PLAIN_MESSAGE);
//Menu////////////////////////////////////////////////    
        do{ 
                                 //0                      1               2
            String[] opciones = {"Perfil Personal", "Pasar el tiempo", "Salir"};
            seleccion = JOptionPane.showOptionDialog(null, "Seleccione una Opcion", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                   /*JOptionPane.showOptionDialog(padre,             mensaje,                                 titulo,    tipo de seleccion,tipo de mensaje,       icono, opciones, valor inicial); */
  
                 switch(seleccion){
                     case 0:
                         
                         i.comentario();
                         i.Estadisticas();
                         break; 
                    case 1:
                         i.Pasareltiempos();
                        break;
                    case 2:
                         JOptionPane.showMessageDialog(null, "La roca.....meditara hasta la proxima ves........");        
                         break;  
                                }

    }while( seleccion != 2 );       
     } 
///metodo de estadisticas
    public void Estadisticas()
    {
      Interfaz is =new Interfaz();
        
           is.raza();      
        is.comentario();   
        
        if(anos==0){
          Dureza=is.getDureza()+Dureza;
         anos= anos+1;
         JOptionPane.showMessageDialog(null,"Pasas un año descubriendo como eres....","Notificacion",JOptionPane.INFORMATION_MESSAGE);
        }
                            
       System.out.print(comentario);
      JOptionPane.showMessageDialog(null,">Raza: "+is.getEsps()+
                                         "\n>Dureza: "+Dureza+
                                         "\n>Edad: "+anos+
                                         "\n>Tiempo Estimado de vida: "+"\n"+is.getTiempo()+
                                         "\n>Comentarios: "+"\n"+comentario ,
                                         "Perfil Personal",JOptionPane.INFORMATION_MESSAGE); 
        

    }
 ////metodo de raza   
    public void raza()
    {      
        Interfaz i =new Interfaz();
       //Razaroca 
        raza=1;
         i.setRaza(raza);
        
        if(i.getRaza()==1){
            
          esps="Roca Ignea"; 
          i.setEsps(esps);
          
        if(anos==0){
           Dureza= Dureza+3;
           Dureza=i.getDureza()+Dureza;
          i.setDureza(Dureza); 
        }
          
          tiempo="Segun el Ciclo litológico viviras mucho tiempo....";
          i.setTiempo(tiempo);
        }
        //Otra raza sin setear 
        i.setRaza(raza);
        if(i.getRaza()!=2){
            
        } 
    }
 ///metodo sobre los comentarios   
    public void comentario()
    {   Interfaz x =new Interfaz();
    x.raza();
     
        if(Dureza>=1){
            comentario="!!!Felicidades eres lo que toda persona quiere ser¡¡¡";
          x.setComentario(comentario);
        }
        if(Dureza>=7){
            comentario="Sorprendentemente cada ves te estas poniendo mas duro.....";
          x.setComentario(comentario);
        }   
       
    }

   ////Metodo para pasar el tiempo
    
    public void Pasareltiempos()
    {Interfaz i =new Interfaz();
    
    
    
        do{
                JOptionPane.showMessageDialog(null,"                          El tiempo pasa:\n                           "+anos+"Años",null,JOptionPane.PLAIN_MESSAGE);
                anos=anos +10;
                if(anos>=601){
                    anos=anos+10;
                }

                if( anos == 101 )
                 {

                JOptionPane.showMessageDialog(null,"Te vuelves mas duro por la erosion del tiempo...","Notificacion",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,"Dureza +1...","Notificacion",JOptionPane.INFORMATION_MESSAGE);
                 Dureza= Dureza+1;
                JOptionPane.showMessageDialog(null,"......","Notificacion",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,"...............","Notificacion",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,"......Lamentablemente, sigues siendo una roca","Notificacion",JOptionPane.INFORMATION_MESSAGE);
                 } 
              }while(anos < 101 );
           //Segunda linea despues de los primeros 100 años..............................................................

             if( anos == 201 )
             {
            JOptionPane.showMessageDialog(null,"Te vuelves mas duro por la erosion del tiempo...","Notificacion",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"Dureza +1...","Notificacion",JOptionPane.INFORMATION_MESSAGE);
             Dureza= Dureza+1;
            JOptionPane.showMessageDialog(null,".................","Notificacion",JOptionPane.INFORMATION_MESSAGE);
             }
            //Tercera linea despues de los primeros 100 años.............................................................. 
              if( anos == 301 )
             {
            JOptionPane.showMessageDialog(null,"Te vuelves mas duro por la erosion del tiempo...","Notificacion",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"Dureza +1...","Notificacion",JOptionPane.INFORMATION_MESSAGE);
            Dureza= Dureza+1;
            JOptionPane.showMessageDialog(null,".................","Notificacion",JOptionPane.INFORMATION_MESSAGE);
             }
            //Cuarta linea despues de los primeros 100 años.............................................................. 

              if( anos == 301 ){
            JOptionPane.showMessageDialog(null,"No te das cuenta del pasar del tiempo.....","Notificacion",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"Parpadeas y el tiempo ha cambiado......","Notificacion",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"O eso seria....si pudieras parpader..........","Notificacion",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"Edad +110...","Notificacion",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,".................","Notificacion",JOptionPane.INFORMATION_MESSAGE);
            anos=anos +110;
          //Quinta linea despues de los primeros 100 años............................................   
             }
            if( anos == 501 ){
           JOptionPane.showMessageDialog(null,"Te vuelves mas duro por la erosion del tiempo...","Notificacion",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"Dureza +1...","Notificacion",JOptionPane.INFORMATION_MESSAGE);
            Dureza= Dureza+1;
            JOptionPane.showMessageDialog(null,".................","Notificacion",JOptionPane.INFORMATION_MESSAGE);  
             }  
             if( anos == 611 ){
           JOptionPane.showMessageDialog(null,"Te vuelves mas duro por la erosion del tiempo...","Notificacion",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"Dureza +1...","Notificacion",JOptionPane.INFORMATION_MESSAGE);
            Dureza= Dureza+1;
            JOptionPane.showMessageDialog(null,".................","Notificacion",JOptionPane.INFORMATION_MESSAGE); 
            JOptionPane.showMessageDialog(null,"......................","Notificacion",JOptionPane.INFORMATION_MESSAGE); 
            JOptionPane.showMessageDialog(null,"Sientes como lentamente algo esta cambiando dentro de ti......","Notificacion",JOptionPane.INFORMATION_MESSAGE);  
             }  
             
            
              
        anos=i.getAnos()+anos;
          i.setAnos(anos); 
         Dureza=i.getDureza()+Dureza;
         i.setDureza(Dureza);
        
    } 
    
    
 } 

