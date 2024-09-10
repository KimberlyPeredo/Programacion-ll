package Ejercicio2;

public class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;
    public Vehiculo(String marca,String modelo,double precio){
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
    }

    public double getPrecio() {
        if (precio>=2500 && precio<=4000){
            System.out.println("El vehiculo se encuentra con precio entre el rango dado");
        }
        return precio;
    }
    public void mostrardetalles(){
        System.out.println("La marca es: "+marca);
        System.out.println("El modelo es: "+modelo);
        System.out.println("El precio es: "+precio);
    }

}
