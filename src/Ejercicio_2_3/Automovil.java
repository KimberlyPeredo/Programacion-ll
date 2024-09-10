package Ejercicio_2_3;

public class Automovil {
    String marca;
    int modelo;
    int motor;
    enum tipoCom{GASOLINA, DIESEL, BIODIESEL,GAS_NATURAL}
    Automovil.tipoCom tipoCombustible;
    enum tipoA{CUIDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV}
    Automovil.tipoA tipoAutomovil;
    int númeroDePuertas;
    int cantidadDeAsientos;
    int velocidadMáxima;
    enum tipoColor{BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA}
    Automovil.tipoColor color;
    int velocidadActual= 0;
    boolean automatico;
    int multas;
    Automovil(String marca, int modelo, int motor, Automovil.tipoCom tipoCombustible, Automovil.tipoA tipoAutomovil, int númeroDePuertas, int cantidadDeAsientos, int velocidadMáxima, Automovil.tipoColor color, boolean automatico, int multas){
        this.marca= marca;
        this.modelo= modelo;
        this.motor= motor;
        this.tipoCombustible= tipoCombustible;
        this.tipoAutomovil=tipoAutomovil;
        this.númeroDePuertas=númeroDePuertas;
        this.velocidadMáxima=velocidadMáxima;
        this.color=color;
        this.automatico=automatico;
        this.multas=multas;
    }
    String getMarca(){

        return marca;
    }
    int getModelo(){

        return modelo;
    }
    int getMotor(){

        return motor;
    }
    Automovil.tipoCom getTipoCombustible(){

        return tipoCombustible;
    }
    Automovil.tipoA getTipoAutomovil(){

        return tipoAutomovil;
    }
    int getNúmeroDePuertas(){

        return númeroDePuertas;
    }
    int getCantidadDeAsientos(){

        return cantidadDeAsientos;
    }
    int getVelocidadMáxima(){

        return velocidadMáxima;
    }
    Automovil.tipoColor getColor(){

        return color;
    }

    int getVelocidadActual(){

        return velocidadActual;
    }
    boolean getautomatico(){
        return automatico;
    }
    public void setMarca(String marca){

        this.marca=marca;
    }
    public void setModelo(int modelo){

        this.modelo=modelo;
    }
    public void setMotor(int motor){

        this.motor= motor;
    }
    public void setTipoCombustible(Automovil.tipoCom tipoCombustible){

        this.tipoCombustible= tipoCombustible;
    }
    public void setTipoAutomovil(Automovil.tipoA tipoAutomovil){

        this.tipoAutomovil=tipoAutomovil;
    }
    public void setNúmeroDePuertas(int númeroDePuertas){

        this.númeroDePuertas=númeroDePuertas;
    }
    public void setCantidadDeAsientos(int cantidadDeAsientos){

        this.cantidadDeAsientos=cantidadDeAsientos;
    }
    public void setVelocidadMáxima(int velocidadMáxima){

        this.velocidadMáxima= velocidadMáxima;
    }
    public void setColor(Automovil.tipoColor color){

        this.color=color;
    }
    public void setVelocidadActual(int velocidadActual){

        this.velocidadActual= velocidadActual;
    }
    public void setAutomatico(boolean automatico){
        this.automatico=automatico;
    }
    public void acelerar(int incrementoVelocidad){
        if ((velocidadActual+incrementoVelocidad>velocidadMáxima)){
            velocidadActual+=incrementoVelocidad;
            multas++;
            System.out.println("¡Multa recibida! velocidad excedida del automóvil.");
        }
    }
    public boolean tieneMultas(){
        return multas>0;
    }
    public int totalMultas(){
        int valorMulta=100;
        return multas*valorMulta;
    }
    public void desacelerar(int decrementoVelocidad) {
        if ((velocidadActual-decrementoVelocidad)>0){
            velocidadActual-=decrementoVelocidad;
        }else {
            System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }
    public void frenar(){

        velocidadActual=0;
    }
    double calcularTiempoLlegada(int distancia){

        return distancia/velocidadActual;
    }
    public void imprimirDatos(){
        System.out.println("Marca= "+marca);
        System.out.println("Modelo= "+modelo);
        System.out.println("Motor= "+motor);
        System.out.println("Tipo de combustible= "+tipoCombustible);
        System.out.println("Tipo de automóvil= "+tipoAutomovil);
        System.out.println("Número de puertas= "+númeroDePuertas);
        System.out.println("Cantidad de asientos= "+cantidadDeAsientos);
        System.out.println("Velocidad máxima= "+velocidadMáxima);
        System.out.println("Color= "+color);
        System.out.println("Es automatico= "+automatico);
    }
}


