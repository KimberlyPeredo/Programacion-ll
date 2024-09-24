package Ejercicio4_4;

public class Prueba_Ejercicio_Propuesto {
    public static void main(String[] args) {
        Profesor profesor1=new ProfesorTitular();
        Profesor profesor2=(Profesor)profesor1;
        profesor2.imprimir();
    }
}
