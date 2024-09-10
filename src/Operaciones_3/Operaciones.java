package Operaciones_3;
//parametros y argumentos
public class Operaciones {
    public int sumar(int numero1, int numero2){
        int suma=numero1+numero2;
        return suma;
    }
    public int restar(int numero1, int numero2){
        int resta=numero1-numero2;
        return resta;
    }
    public int multiplicar(int numero1, int numero2){
        int multiplicacion=numero1*numero2;
        return multiplicacion;
    }

    public int dividir(int numero1, int numero2){
        int division=numero1/numero2;
        return division;
    }
    public void mostrarResultado(int sum, int rest, int mult, int div) {
        System.out.println("La suma es: " + sum);
        System.out.println("La resta es: " + rest);
        System.out.println("La multiplicacion es: " + mult);
        System.out.println("La division es: " + div);
    }
}

