package PluggableFactory;

public class FabricaVehiculo 
{ 
    protected Automovil prototypeAutomovil; 
    protected Scooter prototypeScooter; 
 
    public FabricaVehiculo() 
    { 
        prototypeAutomovil = null; 
        prototypeScooter = null; 
    } 
 
    public FabricaVehiculo(Automovil prototypeAutomovil, 
     Scooter prototypeScooter) 
    { 
        this.prototypeAutomovil = prototypeAutomovil; 
        this.prototypeScooter = prototypeScooter; 
    } 
 
    public Automovil getPrototypeAutomovil() 
    { 
      return prototypeAutomovil; 
    } 
   
    public void setPrototypeAutomovil(Automovil 
      prototypeAutomovil) 
    { 
      this.prototypeAutomovil = prototypeAutomovil; 
    } 
   
    public Scooter getPrototypeScooter() 
    { 
      return prototypeScooter; 
    } 
   
    public void setPrototypeScooter(Scooter 
      prototypeScooter) 
    { 
      this.prototypeScooter = prototypeScooter; 
    } 
 
    Automovil creaAutomovil() 
    { 
        if (prototypeAutomovil == null) 
            return null; 
        return prototypeAutomovil.duplica(); 
    } 
 
    Scooter creaScooter() 
    { 
        if (prototypeScooter == null) 
            return null; 
        return prototypeScooter.duplica(); 
    } 
}
