package Ejercicio_4_1;

import java.util.Scanner;

public class PruebaLibro {
    public static void main(String[] args) {
        Libro libro=new Libro("La niña de sus ojos","Antonio Diaz Villamil",20);
        LibroTexto libroTexto=new LibroTexto("Al otro lado de la pantalla","Alba Quinteros",50,"6 de primaria");
        LibroUniversidad libroUniversidad=new LibroUniversidad("Hamlet","Wiliam Shakespeare",70,"3er Semestre","Psicologia");
        Novelas novelas=new Novelas("Sangre de campeón","Carlos Sanchez",88, Novelas.tipoNov.historica);
        libro.imprimir();
        System.out.println();
        libroTexto.imprimir();
        System.out.println();
        libroUniversidad.imprimir();
        System.out.println();
        novelas.imprimir();
        System.out.println();
    }
}
