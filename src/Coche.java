public class Coche {
    //atributos
    String color;
    String marca;
    int km;
    //metodo
    public static void main(String[]args){
        Coche coche=new Coche();
        coche.color="Azul";
        coche.marca="Toyota";
        coche.km=150;
        System.out.println("El color es: "+coche.color);
        System.out.println("La marca es: "+coche.marca);
        System.out.println("El km es: "+coche.km);
    }
}
