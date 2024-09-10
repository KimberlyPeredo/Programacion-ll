package Ejercicio_2_2;

public class Main_Planeta {
    public static void main(String[] args) {
        Planeta p1 =new Planeta("Tierra",1,5.9736E24,1.08321E12,12742,150000000, Planeta.tipoPlaneta.TERRESTRE,true,6,125);
        p1.imprimirDatos();
        System.out.println("Densidad del planeta ="+p1.calcularDensidad());
        System.out.println("Es planeta exterior ="+p1.esPlanetaExterior());
        System.out.println();
        Planeta p2=new Planeta("Jupiter",79,1.899E27,1.4313E15,139820,750000000, Planeta.tipoPlaneta.GASEOSO,true,5,160);
        p2.imprimirDatos();
        System.out.println("Densidad del planeta ="+p2.calcularDensidad());
        System.out.println("Es planeta exterior ="+p2.esPlanetaExterior());
    }
}

