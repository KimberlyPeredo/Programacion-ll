package Burbuja;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {
        int[] arreglo={54,26,93,17,77,31,44,55,20};
        for (int i=0; i<arreglo.length;i++){
            for (int j=0; j<arreglo.length-1;j++){
                if (arreglo[j]>arreglo[j+1]){
                    int aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }
        System.out.println("Antes: [54,26,93,17,77,31,44,55,20]");
        System.out.println("Despues: ");
        for (int i=0; i<arreglo.length;i++){
            System.out.println(arreglo[i] +" ");
        }
    }
}
