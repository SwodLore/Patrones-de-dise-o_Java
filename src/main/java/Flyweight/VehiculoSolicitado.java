package Flyweight;

import java.util.*; 
public class VehiculoSolicitado 
{ 
    protected List<OpcionVehiculo> opciones = 
        new ArrayList<OpcionVehiculo>(); 
    protected List<Integer> precioDeVentaOpciones = 
        new ArrayList<Integer>(); 
 
    public void agregaOpciones(String nombre, int precioDeVenta, 
      FabricaOpcion fabrica) 
    { 
        opciones.add(fabrica.getOption(nombre)); 
        precioDeVentaOpciones.add(precioDeVenta); 
    } 
 
    public void muestraOpciones() 
    { 
        int indice, tamano; 
        tamano = opciones.size(); 
        for (indice = 0; indice < tamano; indice++) 
        { 
            opciones.get(indice).visualiza( 
            precioDeVentaOpciones.get(indice)); 
            System.out.println(); 
        } 
    } 
}
