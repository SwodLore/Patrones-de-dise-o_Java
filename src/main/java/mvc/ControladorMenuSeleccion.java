package mvc;  

import com.vaadin.data.Property;  
import com.vaadin.data.Property.ValueChangeEvent;  

public class ControladorMenuSeleccion extends Controlador implements Property.ValueChangeListener {  
  private static final long serialVersionUID = 1L;  

  public ControladorMenuSeleccion(BaseVehiculos modelo) {  
    super();  
    this.modelo = modelo;  
  }  

  public void valueChange(ValueChangeEvent event) {  
    BaseVehiculos.VehiculoDescripcion nuevaDescripcion = (BaseVehiculos.VehiculoDescripcion) event.getProperty().getValue();  
    if (nuevaDescripcion != null)  
      modelo.setIndiceVehiculoEnCurso(nuevaDescripcion.getIndice());  
  }  

  public void actualiza() {  
  }  
}
