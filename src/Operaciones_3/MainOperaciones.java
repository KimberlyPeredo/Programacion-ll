package Operaciones_3;

import Operaciones_2.Operaciones;

import javax.swing.*;

public class MainOperaciones {

    public static void main(String[] args) {
        int numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite num 1"));
        int numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite num 2"));
        Operaciones objeto=new Operaciones();

        objeto.sumar(numero1,numero2);
        objeto.restar(numero1,numero2);
        objeto.multiplicar(numero1,numero2);
        objeto.dividir(numero1,numero2);

        objeto.mostrarResultado();
    }
}
