package Ejercicio_1POO;

import java.awt.geom.Area;
import java.security.spec.RSAOtherPrimeInfo;

public class Cuadrilatero {
    private  float lado1;
    private float lado2;

    public Cuadrilatero(float lado1,float lado2){
        this.lado1=lado1;
        this.lado2=lado2;
    }
    public float CalculoDeArea(){
        float resultado=lado1*lado2;
        return resultado;
    }
    public float CalcularElPerimetro(){
        float resultado=2*lado1+2*lado2;
        return resultado;
    }

    public Cuadrilatero(float lado1){
        this.lado1=this.lado2=lado1;

    }

    public float Area(){
        float resultado=lado1*lado1;
        System.out.println("funcion area"+resultado);
        return resultado;
    }
    public float Perimetro(){
        float resultado=lado1*4;
        return resultado;
    }
    public void mostrarDatos(){
        System.out.println("El area de un cuadrilatero es: "+CalculoDeArea());
        System.out.println("El perimetro de un cuadrilatero es: "+CalcularElPerimetro());
        System.out.println("El area de un cuadrilatero perfecto es: "+Area());
        System.out.println("El perimetro de un cuadrilatero es: "+Perimetro());

    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

}
