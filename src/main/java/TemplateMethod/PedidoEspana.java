package TemplateMethod;


public class PedidoEspana extends Pedido 
{ 
    protected void calculaIVA() 
    { 
        importeIVA = importeSinIVA * 0.21; 
    } 
}
