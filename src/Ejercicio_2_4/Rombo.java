package Ejercicio_2_4;

public class Rombo {
    int diagonalMenor;
    int diagonalMayor;
    int lado;
    Rombo(int diagonalMenor,int diagonalMayor,int lado){
        this.diagonalMenor=diagonalMenor;
        this.diagonalMayor=diagonalMayor;
        this.lado=lado;
    }
    double calcularArea(){
        return (diagonalMenor*diagonalMayor)/2;
    }
    double calcularPerímetro(){
        return lado+lado+lado+lado;
    }
}
