package Ejercicio_2_3;

public class Main_Automovil {
    public static void main(String[] args) {
        Automovil auto1=new Automovil("Ford",2018,3, Automovil.tipoCom.DIESEL, Automovil.tipoA.EJECUTIVO,5,6,50, Automovil.tipoColor.NEGRO,true,200);
        auto1.imprimirDatos();
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual= "+auto1.velocidadActual);
        auto1.acelerar(120);
        System.out.println("¿El automovil tiene multas? "+auto1.tieneMultas());
        System.out.println("El valor total de las multas= "+auto1.totalMultas());
        auto1.desacelerar(50);
        System.out.println("Velocidad actual= "+auto1.velocidadActual);
        auto1.frenar();
        auto1.desacelerar(20);

    }
}
