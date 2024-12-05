package PluggableFactory;

public abstract class Automovil implements Cloneable 
{ 
    protected String modelo; 
    protected String color; 
    protected int potencia; 
    protected double espacio; 
 
    public Automovil duplica() 
    { 
        Automovil resultado; 
        try{
            resultado = (Automovil)this.clone(); 
        }
        catch (CloneNotSupportedException exception)
        {
            return null;
        }
        return resultado; 
    } 
    
    public String getModelo() 
    { 
      return modelo; 
    } 
   
    public void setModelo(String modelo) 
    { 
      this.modelo = modelo; 
    } 
   
    public String getColor() 
    { 
      return color; 
    } 
   
    public void setColor(String color) 
    { 
      this.color = color; 
    } 
   
    public int getPotencia() 
    { 
      return potencia; 
    } 
   
    public void setPotencia(int potencia) 
    { 
      this.potencia = potencia; 
    } 
   
    public double getEspacio() 
    { 
      return espacio; 
    } 
   
    public void setEspacio(double espacio) 
    { 
      this.espacio = espacio; 
    } 
  
    public abstract void visualizaCaracteristicas(); 
} 
