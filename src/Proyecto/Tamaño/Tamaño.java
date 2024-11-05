package Proyecto.Tamaño;

public class Tamaño {
    private  String descripcion;
    private double precio;
    public  Tamaño(String descripcion, double precio){
        this.descripcion=descripcion;
        this.precio=precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }
}
