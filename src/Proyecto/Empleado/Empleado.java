package Proyecto.Empleado;

public class Empleado {
    private String nombre;
    private String id;
    public  Empleado(String nombre, String id){
        this.nombre=nombre;
        this.id=id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }
    public  void mostrarInformacion(){
        System.out.println("Empleado: "+nombre);
        System.out.println("ID: "+id);
    }
}
