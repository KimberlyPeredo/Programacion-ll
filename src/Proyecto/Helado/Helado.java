package Proyecto.Helado;

public class Helado {
    private String nombre;
    private  double precio;
    public Helado(String nombre, double precio){
        this.nombre=nombre;
        this.precio=precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
