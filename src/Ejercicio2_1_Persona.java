public class Ejercicio2_1_Persona {
    String nombre;
    String apellidos;
    String numeroDocumentoIdentidad;
    int añoNacimiento;
    String paisDeNacimiento;
    char genero;
    Ejercicio2_1_Persona(String nom,String apellidos,String numeroDocumentoIdentidad, int añoNacimiento, String paisDeNacimiento,char genero){
        this.nombre=nom;
        this.apellidos=apellidos;
        this.numeroDocumentoIdentidad=numeroDocumentoIdentidad;
        this.añoNacimiento=añoNacimiento;
        this.paisDeNacimiento=paisDeNacimiento;
        this.genero=genero;
    }
    public void imprimirDatos(){
        System.out.println("nombre ="+nombre);
        System.out.println("apellidos ="+apellidos);
        System.out.println("numero de documento de identidad ="+numeroDocumentoIdentidad);
        System.out.println("año de macimiento ="+añoNacimiento);
        System.out.println("pais de nacimiento ="+paisDeNacimiento);
        System.out.println("género ="+genero);
        System.out.println();
    }
}
