package TemplateMethod;

public class Usuario 
{ 
    public static void main(String[] args) 
    { 
        Pedido pedidoEspana = new PedidoEspana(); 
        pedidoEspana.setImporteSinIVA(10000); 
        pedidoEspana.calculaPrecioConIVA(); 
        pedidoEspana.visualiza(); 
 
 
        Pedido pedidoLuxemburgo = new PedidoLuxemburgo(); 
        pedidoLuxemburgo.setImporteSinIVA(10000); 
        pedidoLuxemburgo.calculaPrecioConIVA(); 
        pedidoLuxemburgo.visualiza(); 
    } 
}

