package Burbuja;

public class Ejercicio_4 {
    public static void main(String[] args) {
        String textoOriginal="Hola Mundo JAVA";
        String textoInvertido= "";
        for (int i=0; i<textoOriginal.length();i++){
            textoInvertido=textoOriginal.charAt(i)+textoInvertido;
        }
        System.out.println("Texto Invertido: "+textoInvertido);
    }
}
