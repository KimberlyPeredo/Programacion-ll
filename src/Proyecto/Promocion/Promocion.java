package Proyecto.Promocion;

public class Promocion {
    private  String descripcion;
    private  double descuento;
    public Promocion(String descripcion, double descuento){
        this.descripcion=descripcion;
        this.descuento=descuento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getDescuento() {
        return descuento;
    }
    public  double aplicarDescuento(double precioOriginal){
        return precioOriginal-(precioOriginal*descuento);
    }
}
