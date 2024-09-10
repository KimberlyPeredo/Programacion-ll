package Clinica;

public class Doctor {
    private String nombre;
    private String email;
    private String especialidad;
    private String telefono;
    public Doctor() {

    }
    public Doctor(String nombre,String email,String especialidad){
        this.nombre=nombre;
        this.email=email;
        this.especialidad=especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono.length()>=8){
            System.out.println("Solo admite 8 dígitos");
        }else {
            this.telefono=telefono;
        }
    }
}
