package Ejercicio_2POO2;

public class Producto {
    private final String nombre;
    private final String tipo;
    private final float precio;
    public Producto(String nombre,String tipo,float precio){
        this.nombre=nombre;
        this.tipo=tipo;
        this.precio=precio;
    }
    public float getPrecio(){
        return precio;
    }
    public String toString(){
        return "\n Producto: "+nombre+"\n Tipo: "+tipo+"\n Precio: "+precio;
    }
}
