package Operaciones;

import javax.swing.*;

public class Operaciones {
    //atributos
    int numero1;
    int numero2;
    int suma, resta, multiplicacion, division;
    // Metodos
    public void leerNumeros(){
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite num 1"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite num 2"));
    }
    public void sumar(){
        suma=numero1+numero2;
    }
    public void restar(){
        resta=numero1-numero2;
    }
    public void multiplicar(){
        multiplicacion=numero1*numero2;
    }
    public void dividir(){
        division=numero1/numero2;
    }
    public void mostrarResultado(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);

    }

}
