package Proyecto.Pedido;

import Proyecto.Helado.Helado;
import Proyecto.Promocion.Promocion;
import Proyecto.Tamaño.Tamaño;

public class Pedido {
    private Helado sabor;
    private Tamaño tamaño;
    private Promocion promocion;

    public Pedido(){}

    public  void seleccionarHelado(Helado sabor){
        this.sabor=sabor;
    }
    public void  seleccionarTamaño(Tamaño tamaño){
        this.tamaño=tamaño;
    }
    public void  aplicarPromocion(Promocion promocion){
        this.promocion=promocion;
    }
    public  void  mostrarPrecioTotal(){
        double precioTotal=(sabor != null && tamaño!=null) ? (sabor.getPrecio()+ tamaño.getPrecio()) :0.0;

        if (promocion!= null){
            precioTotal=promocion.aplicarDescuento(precioTotal);
            System.out.println("Se ha apllicado la promoción: "+promocion.getDescripcion());
        }
        System.out.println("Precio total: $" +precioTotal);
    }
}
