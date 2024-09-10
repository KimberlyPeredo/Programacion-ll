package Ejercicio1;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    public Empleado(String nombre,int edad,double salario){
        this.nombre=nombre;
        this.edad=edad;
        this.salario=salario;
    }

    public double getSalario() {
        return salario;
    }
    public double aplicarAumento(){
        if(salario<=3000){
           double aumento=(salario*10)/100;
            System.out.println("Su salario actual es: "+(salario+aumento));
        }else{
            System.out.println("No aplica para recibir un aumento a su salario");
        }
        return salario;
    }
    public void imprimirDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Salario: "+salario);
    }
}
