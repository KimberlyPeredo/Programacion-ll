package Ejercicio_2_POO;

public class MainVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo1=new Vehiculo("Dodge","RAM 1500",35.999F);
        Vehiculo vehiculo2=new Vehiculo("Ford","F-150",40.500F);
        Vehiculo vehiculo3=new Vehiculo("lamborghini","Sián-FKP-37",100.999F);

        vehiculo1.mostrarDatos();
        vehiculo1.getPrecio();
        System.out.println();
        vehiculo2.mostrarDatos();
        vehiculo2.getPrecio();
        System.out.println();
        vehiculo3.mostrarDatos();
        vehiculo3.getPrecio();

    }
}
