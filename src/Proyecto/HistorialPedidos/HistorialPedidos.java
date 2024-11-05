package Proyecto.HistorialPedidos;

import Proyecto.Helado.Helado;
import Proyecto.Pedido.Pedido;

import java.util.ArrayList;
import java.util.List;

public class HistorialPedidos {
    private List<Pedido> pedidos;
    public HistorialPedidos(){
        pedidos=new ArrayList<>();
    }
    public void agregarPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    public void mostrarHistorial(){
        if (pedidos.isEmpty()){
            System.out.println("No hay pedido en el historial.");
        }else {
            System.out.println("Historial de pedidos: ");
            for (int i=0; i<pedidos.size(); i++){
                System.out.println("Pedido "+(i+1)+ ":");
                pedidos.get(i).mostrarPrecioTotal();
            }
        }
    }
}
