package Estatica;

public class Estatica {
    private static String frase="Primera fase";
    public static void main(String[]args){
        Estatica estatica=new Estatica();
        Estatica estatica1=new Estatica();
        Estatica estatica2=new Estatica();
        estatica1.frase="Segunda frase";
        estatica2.frase="Tercera frase";

        System.out.println(estatica.frase);
        System.out.println(estatica1.frase);
        System.out.println(estatica2.frase);
    }
}
