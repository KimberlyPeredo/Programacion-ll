package Ejercicio_2POO2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProducto {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        List<Producto>productos=new ArrayList<>();
        System.out.println("Ingrese la cantidad de productos a registrar");
        int numeroproductos=leer.nextInt();
        for (int i=0;i<numeroproductos;i++){
            System.out.println("Producto: "+(i+1)+":");
            System.out.println("Ingrese nombre: ");
            String nombre= leer.next();
            System.out.println("Ingrese tipo: ");
            String tipo=leer.next();
            System.out.println("Ingrese precio: ");
            float precio=leer.nextFloat();
            productos.add(new Producto(nombre,tipo,precio));
            Producto productoMasCaro=buscarProductoMasCaro(productos);
            System.out.println("El producto mas caro es: "+productoMasCaro);

        }

    }
    public static Producto buscarProductoMasCaro(List<Producto>productos) {
        if (productos.isEmpty()){
            return null;
        }
        Producto masCaro=productos.get(0);
        for (Producto p:productos){
            if (p.getPrecio()>masCaro.getPrecio()){
                masCaro=p;
            }
        }
        return masCaro;
    }
}
