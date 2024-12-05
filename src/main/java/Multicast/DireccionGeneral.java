package Multicast;

import java.util.*; 
public class DireccionGeneral 
{ 
    protected EmisorGeneral emisorGeneral = new 
        EmisorGeneral(); 
 
    public void enviaMensajes() 
    { 
        List<String> contenido = new ArrayList<String>(); 
        contenido.add("Informaci�n general"); 
        contenido.add("Informaci�n espec�fica"); 
        MensajeGeneral mensaje = new MensajeGeneral(contenido); 
        emisorGeneral.envioMultiple(mensaje); 
    } 
 
    public void agregaReceptorGeneral(Empleado receptor) 
    { 
        emisorGeneral.agrega(receptor); 
    } 
}
