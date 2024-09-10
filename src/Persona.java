public class Persona {
    String nombre;
    int edad;
    Persona(){

    }
    Persona(String nombre){
        this.nombre=nombre;
    }
    Persona(int edad){
        this.edad=edad;
    }
    Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public void verificar_edad(){
        if (edad>=18){
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("Es menor de edad");
        }
    }
}
