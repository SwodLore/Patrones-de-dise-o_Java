package Bridge;

public abstract class FormularioMatriculacion 
{ 
    protected String contenido; 
    protected FormularioImpl implementacion; 
 
    public FormularioMatriculacion(FormularioImpl 
      implementacion) 
    { 
        this.implementacion = implementacion; 
    } 
 
    public void visualiza() 
    { 
        implementacion.dibujaTexto( 
        "n�mero de matr�cula existente: "); 
    } 
 
    public void generaDocumento() 
    { 
        implementacion.dibujaTexto("Solicitud de matriculaci�n"); 
        implementacion.dibujaTexto("n�mero de matr�cula: " + 
        contenido); 
    } 
 
    public boolean administraZona() 
    { 
        contenido = implementacion.administraZonaIndicada(); 
        return this.controlZona(contenido); 
    } 
 
    protected abstract boolean controlZona(String matricula); 
}

