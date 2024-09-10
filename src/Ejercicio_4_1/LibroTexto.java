package Ejercicio_4_1;

public class LibroTexto extends Libro {
    private String curso;
    public LibroTexto(String titulo,String autor,float precio,String curso){
        super(titulo,autor,precio);
        this.curso=curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Curso= "+curso);
    }
}
