package Ejercicio_2_4;

public class Triángulo_Rectángulo {
    int base;
    int altura;
    public Triángulo_Rectángulo(int base,int altura){
        this.base=base;
        this.altura=altura;
    }
    double calcularArea(){
        return (base*altura/2);
    }
    double calcularPerímetro(){
        return (base+altura+calcularHipotenusa());
    }
    double calcularHipotenusa(){
        return Math.pow((base*base+altura*altura),0.5);
    }
    public void determinarTipoTriángulo(){
        if ((base==altura)&&(base==calcularHipotenusa())&&(altura==calcularHipotenusa())){
            System.out.println("Es un triángulo equílatero");
        } else if ((base!=altura)&&(base!=calcularHipotenusa())&&(altura!=calcularHipotenusa())) {
            System.out.println("Es un triángulo escaleno");
        }else {
            System.out.println("Es un triángulo isóceles");
        }
    }
}
