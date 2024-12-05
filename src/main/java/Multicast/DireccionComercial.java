package Multicast;

public class DireccionComercial 
{ 
    protected EmisorComercial emisorComercial = 
     new EmisorComercial(); 
 
    public void enviaMensajes() 
    { 
        MensajeComercial mensaje = new MensajeComercial( 
         "Anuncio nueva gama"); 
        emisorComercial.envioMultiple(mensaje); 
        mensaje = new MensajeComercial( 
         "Anuncio supresi�n modelo"); 
        emisorComercial.envioMultiple(mensaje); 
    } 
 
    public void agregaReceptorComercial 
     (ReceptorComercial receptor) 
    { 
        emisorComercial.agrega(receptor); 
    } 
} 

