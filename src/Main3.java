public class Main3 {
    public static void main(String[] args) {
        Auto auto1=new Auto();
        auto1.color= "Es un rojo fuerte y mate";
        auto1.modelo= "Corolla";
        auto1.marca= "Toyota";

        System.out.println(auto1.color);
        System.out.println(auto1.modelo);
        System.out.println(auto1.marca);

        auto1.correr();
        auto1.bocinar();
    }
}
