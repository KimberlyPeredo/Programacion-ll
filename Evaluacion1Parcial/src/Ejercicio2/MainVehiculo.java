package Ejercicio2;

public class MainVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo1=new Vehiculo("Toyota","Corolla",3000);
        Vehiculo vehiculo2=new Vehiculo("Lamborguini","1500",2700);
        Vehiculo vehiculo3=new Vehiculo("Dodge","Nitro 2008",5000);
        System.out.println("Primer Vehiculo");
        vehiculo1.mostrardetalles();
        vehiculo1.getPrecio();
        System.out.println(" ");
        System.out.println("Segundo vehiculo");
        vehiculo2.mostrardetalles();
        vehiculo2.getPrecio();
        System.out.println(" ");
        System.out.println("Tercer vehiculo");
        vehiculo3.mostrardetalles();
        vehiculo3.getPrecio();

    }

}
