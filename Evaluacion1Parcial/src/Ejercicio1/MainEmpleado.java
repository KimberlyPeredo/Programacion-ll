package Ejercicio1;

public class MainEmpleado {
    public static void main(String[] args) {
        Empleado empleado1=new Empleado("Juan",20,2500);
        Empleado empleado2=new Empleado("Jose",35,3200);
        Empleado empleado3=new Empleado("Sebastian",30,2900);
        System.out.println("Primer Empleado");
        empleado1.imprimirDatos();
        empleado1.aplicarAumento();
        System.out.println(" ");
        System.out.println("Segundo Empleado");
        empleado2.imprimirDatos();
        empleado2.aplicarAumento();
        System.out.println(" ");
        System.out.println("Tercer Empleado");
        empleado3.imprimirDatos();
        empleado3.aplicarAumento();
    }

}
