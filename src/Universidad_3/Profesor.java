package Universidad_3;

public class Profesor extends Persona{
    String departamento;
    String categoria;
    public Profesor(String nombre, String dirección, String departamento, String categoria){
        super(nombre, dirección);
        this.departamento=departamento;
        this.categoria=categoria;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("El departamento es: "+departamento);
        System.out.println("La categoria es: "+categoria);
    }
}
