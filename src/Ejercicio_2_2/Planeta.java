package Ejercicio_2_2;

public class Planeta {
    String nombre = null;
    int cantidadesSatélitales = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciaSol = 0;

    enum tipoPlaneta {GASEOSO, TERRESTRE, ENANO}

    Planeta.tipoPlaneta tipo;
    boolean esObservable = false;
    int periodo_orbital;
    int periodo_rotacional;

    Planeta(String nombre, int cantidadesSatélitales, double masa, double volumen, int diametro, int distanciaSol, Planeta.tipoPlaneta tipo, boolean esObservable, int periodo_orbital, int periodo_rotacional) {
        this.nombre = nombre;
        this.cantidadesSatélitales = cantidadesSatélitales;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
        this.periodo_orbital= periodo_orbital;
        this.periodo_rotacional= periodo_rotacional;
    }

    public void imprimirDatos() {
        System.out.println("Nombre del planeta =" + nombre);
        System.out.println("Cantidad de satélites =" + cantidadesSatélitales);
        System.out.println("Masa del planetas =" + masa);
        System.out.println("Volumen del planeta =" + volumen);
        System.out.println("Diámetro del planeta =" + diametro);
        System.out.println("Distancia al sol =" + distanciaSol);
        System.out.println("Tipo de planeta =" + tipo);
        System.out.println("Es observable =" + esObservable);
        System.out.println("El periodo orbital del planeta en años=" +periodo_orbital);
        System.out.println("El periodo rotacional en dias ="+periodo_rotacional);
    }

    double calcularDensidad() {
        return masa / volumen;
    }

    boolean esPlanetaExterior() {
        float límite = (float) (149597870 * 3.4);

        if (distanciaSol > límite) {
            return true;
        } else {
            return false;
        }
    }
}

