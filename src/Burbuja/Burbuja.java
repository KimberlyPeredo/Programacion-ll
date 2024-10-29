package Burbuja;

public class Burbuja {
    public static void main(String[] args) {
        int[] arreglo={14,8,12};
        for (int i=0;i<arreglo.length;i++){
            for (int j=0; j<arreglo.length-1;j++){
                if (arreglo[j]>arreglo[j+1]){
                    int aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }
        System.out.println("Antes: [14,8,12]");
        System.out.println("Despues: ");
        for (int i=0; i<arreglo.length;i++){
            System.out.print("[" +arreglo[i]+ "]");
        }
    }
}


