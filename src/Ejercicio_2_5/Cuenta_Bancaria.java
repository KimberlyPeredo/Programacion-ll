package Ejercicio_2_5;

public class Cuenta_Bancaria {
    String nombresTitular;
    String apellidostitular;
    int numeroCuenta;
    enum tipo{AHORROS, CORRIENTE}
    tipo tipoCuenta;
    float saldo=0;
    Cuenta_Bancaria(String nombresTitular,String apellidostitular,int numeroCuenta, tipo tipoCuenta){
    this.nombresTitular=nombresTitular;
    this.apellidostitular=apellidostitular;
    this.numeroCuenta=numeroCuenta;
    this.tipoCuenta=tipoCuenta;
    }
    void imprimir(){
        System.out.println("Nombres del titular= "+nombresTitular);
        System.out.println("Apellidos del titular= "+apellidostitular);
        System.out.println("Numero de Cuenta= "+numeroCuenta);
        System.out.println("Tipo de Cuenta= "+tipoCuenta);
    }

}
