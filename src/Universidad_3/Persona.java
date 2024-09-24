package Universidad_3;

public class Persona {
    String nombre;
    String dirección;
    public Persona(String nombre, String dirección){
        this.nombre=nombre;
        this.dirección=dirección;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }
    public void imprimir(){
        System.out.println("Su nombre es: "+nombre);
        System.out.println("Su dirección es: "+dirección);
    }
}
