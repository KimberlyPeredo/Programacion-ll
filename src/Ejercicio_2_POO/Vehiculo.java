package Ejercicio_2_POO;

public class Vehiculo {
    private String marca;
    private String modelo;
    private float precio;

    public Vehiculo(String marca,String modelo,float precio) {
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
    }
    public float getPrecio(){
        if (precio<50.000){
            System.out.println("El vehiculo es el masssss barato ¡OFERTONNNNN!");
        }else
            System.out.println("El vehiculo es el mas caro.¡no vale la pena pero si quiere disfrutar adelante!");
        return precio;
    }
    public void mostrarDatos(){
        System.out.println("La Marca del vehiculo es: "+marca);
        System.out.println("El Modelo del vehiculo es: "+modelo);
        System.out.println("El Precio del Vehiculo es: "+precio);
    }

}
