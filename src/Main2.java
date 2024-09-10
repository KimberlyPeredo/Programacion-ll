public class Main2 {
    public static void main(String[] args) {
        Perro perro1= new Perro();
        perro1.nombre= "Pelusa";
        perro1.raza= "Salchicha";
        perro1.color= "Cafe claro con manchas negras";
        perro1.tamaño= "Pequeño";

        System.out.println(perro1.nombre);
        System.out.println(perro1.raza);
        System.out.println(perro1.color);
        System.out.println(perro1.tamaño);

        perro1.correr();
        perro1.ladrar();
    }
}
