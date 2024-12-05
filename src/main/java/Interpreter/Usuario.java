package Interpreter;

import java.util.*; 
public class Usuario 
{ 
    public static void main(String[] args) 
    { 
        Expresion expresionConsulta = null; 
        Scanner reader = new Scanner(System.in); 
        System.out.print("Introduzca su consulta: "); 
        String consulta = reader.nextLine(); 
        try 
        { 
            expresionConsulta = Expresion.analiza(consulta); 
        } 
        catch (Exception e) 
        { 
            System.out.print(e.getMessage());
            expresionConsulta = null; 
        } 
        if (expresionConsulta != null) 
        { 
            System.out.print( 
                "Introduzca la descripci�n de un veh�culo: "); 
            String descripcion = reader.nextLine(); 
            if (expresionConsulta.evalua(descripcion)) 
                System.out.print( 
                    "La descripci�n responde a la consulta"); 
            else 
                System.out.print( 
                    "La descripci�n no responde a la consulta"); 
        } 
    } 
}
