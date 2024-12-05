package Flyweight;

public class Cliente
{ 
    public static void main(String[] args) 
    { 
        FabricaOpcion fabrica = new FabricaOpcion(); 
        VehiculoSolicitado vehiculo = new VehiculoSolicitado(); 
        vehiculo.agregaOpciones("air bag", 80, fabrica); 
        vehiculo.agregaOpciones("direcci�n asistida", 90, 
          fabrica); 
        vehiculo.agregaOpciones("elevalunas el�ctricos", 85, 
          fabrica); 
        vehiculo.muestraOpciones(); 
    } 
}
