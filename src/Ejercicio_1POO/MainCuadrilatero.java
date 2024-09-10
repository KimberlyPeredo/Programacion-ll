package Ejercicio_1POO;

import java.awt.geom.Area;

public class MainCuadrilatero {
    public static void main(String[] args) {
        Cuadrilatero cuadrilatero=new Cuadrilatero(38,21);
        Cuadrilatero cuadrilatero1=new Cuadrilatero(1.20f);
        cuadrilatero.mostrarDatos();
        cuadrilatero.CalculoDeArea();
        cuadrilatero1.CalcularElPerimetro();
        cuadrilatero1.Area();
        cuadrilatero1.Perimetro();

    }
}
