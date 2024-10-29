package Burbuja;

public class Ejercicio_3 {
    public static void main(String[] args) {
        String frase="Contar el numero de palabras en una cadena";
        int cantidadPalabras=frase.split("\\s").length;
        System.out.println(cantidadPalabras);
    }
}
