package mvc;  

import com.vaadin.ui.Button.ClickEvent;  
import com.vaadin.ui.Button.ClickListener;  

public class ControladorBotonAnuncioSiguiente extends Controlador implements ClickListener, Observador {  
  private static final long serialVersionUID = 1L;  
  protected int indiceAnuncioEnCurso;  
  protected int numAnuncios;  

  public ControladorBotonAnuncioSiguiente(BaseVehiculos modelo, VistaPrincipal vistaPrincipal) {  
    super();  
    this.modelo = modelo;  
    this.vista = vistaPrincipal;  
    modelo.agrega(this);  
    actualiza();  
  }  

  public void buttonClick(ClickEvent event) {  
    indiceAnuncioEnCurso++;  
    if (indiceAnuncioEnCurso == numAnuncios)  
      indiceAnuncioEnCurso = 0;  
    vista.muestraAnuncio(indiceAnuncioEnCurso);  
  }  

  public void actualiza() {  
    numAnuncios = modelo.getNumAnuncios();  
    indiceAnuncioEnCurso = 0;  
    vista.muestraAnuncio(indiceAnuncioEnCurso);  
  }  
}
