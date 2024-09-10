package Estatica;

public class Estatico_1 {
    private static String frase="Primera fase";
    public static int sumar(int a,int b){
        int resultado=a+b;
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(frase);
        System.out.println(sumar(5,4));
    }
}
