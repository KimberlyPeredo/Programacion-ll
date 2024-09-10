package Ejercicio_2_4;

public class Main_Prueba_de_Figuras {
    public static void main(String[] args) {
        Circulo figura1=new Circulo(2);
        Rectangulo figur2=new Rectangulo(1,2);
        Cuadrado figura3=new Cuadrado(3);
        Triángulo_Rectángulo figura4=new Triángulo_Rectángulo(3,5);
        Rombo figura5=new Rombo(4,6,2);
        Trapecio figura6= new Trapecio(5,7,3,8);
        System.out.println("El área del circulo es= "+figura1.calcularArea());
        System.out.println("El perímetro el círculo es= "+figura1.calcularPerímetro());
        System.out.println();
        System.out.println("El área del rectángulo es= "+figur2.calcularArea());
        System.out.println("El perímetro del rectángulo es= "+figur2.calcularPerímetro());
        System.out.println();
        System.out.println("El área del cuadrado es= "+figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es= "+figura3.calcularPerímetro());
        System.out.println();
        System.out.println("El área del triángulo es= "+figura4.calcularArea());
        System.out.println("El perímetro del triangulo es= "+figura4.calcularPerímetro());
        figura4.determinarTipoTriángulo();
        System.out.println();
        System.out.println("El área de un rombo es= "+figura5.calcularArea());
        System.out.println("El perímetro de un rombo es= "+figura5.calcularPerímetro());
        System.out.println();
        System.out.println("El área de un trapecio es= "+figura6.calcularArea());
        System.out.println("El perímetro de un trapecio es= "+figura6.calcularPerímetro());
    }

}
