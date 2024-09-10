package Ejercicio_4_1;

public class LibroUniversidad extends LibroTexto {
    private String facultad;
    public LibroUniversidad(String titulo,String autor,float precio,String curso,String facultad){
        super(titulo,autor,precio,curso);
        this.facultad=facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("La facultad= "+facultad);
    }
}
