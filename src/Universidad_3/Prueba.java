package Universidad_3;

public class Prueba {
    public static void main(String[] args) {
        System.out.println("LOS DATOS DE LA PERSONA:");
        Persona persona=new Persona("Juan","Avenida Amércica");
        persona.imprimir();
        System.out.println();
        System.out.println("LOS DATOS DEL ESTUDIANTE:");
        Estudiante estudiante=new Estudiante("Alejandro","Avenida Blanco Galindo","Informatica industrial",2);
        estudiante.imprimir();
        System.out.println();
        System.out.println("LOS DATOS DEL PRFOESOR:");
        Profesor profesor=new Profesor("Michael","Mercado La Paz","Ingenieria","Master");
        profesor.imprimir();
        }
}
