package Strategy;

import java.util.*; 
public class VistaCatalogo 
{ 
    protected List<VistaVehiculo> contenido = 
        new ArrayList<VistaVehiculo>(); 
    protected DibujaCatalogo dibujo; 
 
    public VistaCatalogo(DibujaCatalogo dibujo) 
    { 
       contenido.add(new VistaVehiculo("vehiculo economico")); 
       contenido.add(new VistaVehiculo("vehiculo especial")); 
       contenido.add(new VistaVehiculo("vehiculo rapido")); 
       contenido.add(new VistaVehiculo("vehiculo confortable"));
       contenido.add(new VistaVehiculo("vehiculo deportivo")); 
       this.dibujo = dibujo; 
    } 
 
    public void dibuja() 
    { 
        dibujo.dibuja(contenido); 
    } 
}
