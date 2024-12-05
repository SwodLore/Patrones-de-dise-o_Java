package TemplateMethod;


public class PedidoLuxemburgo extends Pedido 
{ 
    protected void calculaIVA() 
    { 
        importeIVA = importeSinIVA * 0.15; 
    } 
}
