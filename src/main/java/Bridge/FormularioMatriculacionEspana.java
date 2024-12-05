package Bridge;

public class FormularioMatriculacionEspana extends 
  FormularioMatriculacion 
{ 
  public FormularioMatriculacionEspana(FormularioImpl 
    implementacion)  
  {
    super(implementacion); 
  }
 
  protected boolean controlZona(String matricula) 
  { 
    return matricula.length() == 7; 
  } 
}
