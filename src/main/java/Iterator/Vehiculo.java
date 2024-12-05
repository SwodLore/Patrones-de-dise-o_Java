package Iterator;

public class Vehiculo extends Elemento 
{ 
 
    public Vehiculo(String descripcion) 
    {
        super(descripcion);
    } 
 
    public void visualiza() 
    { 
        System.out.print("Descripcion del veh�culo: " + 
          descripcion); 
    } 
}
