public class Cliente {
    int codigo;
    String nombre;
    int celular;
    Cliente(){
    }
    Cliente(int cod, String nom ){
       this.codigo=cod;
       this.nombre=nom;
    }
    Cliente(int cod,String nom,int cel){
        this.codigo=cod;
        this.nombre=nom;
        this.celular=cel;
    }
    public void imprimirDatos(){
        System.out.println("codigo: "+codigo);
        System.out.println("nombre: "+nombre);
        System.out.println("celular: "+celular);
    }
}
