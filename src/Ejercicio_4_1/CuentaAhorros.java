package Ejercicio_4_1;

public class CuentaAhorros extends Cuenta {
    private boolean activa;
    public CuentaAhorros(float saldo,float tasa){
        super(saldo,tasa);
        if(saldo<10000){
            activa=false;
        }else {
            activa=true;
        }
    }
    public void retirar(float cantidad){
        if (activa){
            super.retirar(cantidad);
        }
    }
    public void consignar_(float cantidad){
        if (activa){
            super.consignar(cantidad);
        }
    }
    public void extractoMensual(){
        if (númeroRetiros>4){
            comisiónMensual+=(númeroRetiros-4)*1000;
        }
        super.extractoMensual();
        if (saldo<1000){
            activa=false;
        }
    }
    public void imprimir(){
        System.out.println("Saldo=$ "+saldo);
        System.out.println("Comision mensual=$ "+comisiónMensual);
        System.out.println("Número de transacciones= "+(númeroConsignaciones+númeroRetiros));
        System.out.println();
    }


}
