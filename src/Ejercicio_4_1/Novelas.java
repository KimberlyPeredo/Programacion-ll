package Ejercicio_4_1;

public class Novelas extends Libro {
    enum tipoNov{historica,romantica,policíaca,realista,ciencia,aventuras}
    Novelas.tipoNov tipoNovelas;
    public Novelas(String titulo,String autor,float precio,Novelas.tipoNov tipoNovelas){
        super(titulo,autor,precio);
        this.tipoNovelas=tipoNovelas;
    }

    public tipoNov getTipoNovelas() {
        return tipoNovelas;
    }

    public void setTipoNovelas(tipoNov tipoNovelas) {
        this.tipoNovelas = tipoNovelas;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo= "+tipoNovelas);
    }
}
