package Principal;

import Clinica.Doctor;

public class Main {
    public static void main(String[] args) {
        Doctor doctor=new Doctor();
        doctor.setNombre("Juan Pérez");
        doctor.setEmail("jperez@gmail.com");
        doctor.setEspecialidad("Cirujano Plástico");
        doctor.setTelefono("123456789");

        System.out.println("Nombre: "+doctor.getNombre());
        System.out.println("Email: "+doctor.getEmail());
        System.out.println("Especialidad: "+doctor.getEspecialidad());
        System.out.println("Telefono: "+doctor.getTelefono());
    }
}
