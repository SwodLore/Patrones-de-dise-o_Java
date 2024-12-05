package ReflectiveVisitor;

public class VisitanteMailingComercial extends Visitante 
    implements VisitanteEmpresa
{ 
    public void visita(EmpresaSinFilial empresa) 
    { 
        System.out.println("Env�a un correo a " + empresa.getNombre() 
         + " direcci�n: " + empresa.getEmail() 
         + " Propuesta comercial para su empresa"); 
    } 
 
    public void visita(EmpresaMadre empresa) 
    { 
        System.out.println("Env�a un correo a " + empresa.getNombre() 
         + " direcci�n: " + empresa.getEmail() 
         + " Propuesta comercial para su grupo"); 
        System.out.println("Impresi�n de un correo para " 
         + empresa.getNombre() + " direcci�n: " 
         + empresa.getDireccion() 
         + " Propuesta comercial para su grupo"); 
        for (Empresa filial: empresa.getFiliales()) 
            this.iniciaVisita(filial); 
    } 
}
