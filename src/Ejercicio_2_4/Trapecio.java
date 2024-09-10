package Ejercicio_2_4;

public class Trapecio {
    int baseMayor;
    int baseMenor;
    int altura;
    int lado;
    Trapecio(int baseMayor, int baseMenor, int altura, int lado){
        this.baseMayor=baseMayor;
        this.baseMenor=baseMenor;
        this.altura=altura;
        this.lado=lado;
    }
    double calcularArea(){
        return ((baseMayor+baseMenor)/2)*altura;
    }
    double calcularPerímetro(){
        return baseMayor+baseMenor+lado+lado;
    }
}
