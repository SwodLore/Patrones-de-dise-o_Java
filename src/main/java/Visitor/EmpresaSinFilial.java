package Visitor;

import Visitor.Visitante;

public class EmpresaSinFilial extends Empresa {

    public EmpresaSinFilial(String nombre, String email, String direccion) {
        super(nombre, email, direccion);
    }

    @Override
    public void aceptaVisitante(Visitante visitante) {
        visitante.visita(this);
    }

    @Override
    public boolean agregaFilial(Empresa filial) {
        return false;
    }
}
