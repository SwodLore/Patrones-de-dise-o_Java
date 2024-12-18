package Visitor;

import java.util.ArrayList;
import java.util.List;

public class EmpresaMadre extends Empresa {

    protected List<Empresa> filiales = new ArrayList<>();

    public EmpresaMadre(String nombre, String email, String direccion) {
        super(nombre, email, direccion);
    }

    @Override
    public void aceptaVisitante(Visitante visitante) {
        visitante.visita(this);
        for (Empresa filial : filiales) {
            filial.aceptaVisitante(visitante);
        }
    }

    @Override
    public boolean agregaFilial(Empresa filial) {
        return filiales.add(filial);
    }
}
