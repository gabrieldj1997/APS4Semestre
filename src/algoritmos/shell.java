
package algoritmos;


public class shell {
    
    public void shell (int []arreglo){
        int salto,i,j,k,auxiliar;
        salto=arreglo.length/2;
        while(salto>0) {
            for ( i = salto; i < arreglo.length; i++) {
                j=i-salto;
                while(j>=0) {
                    k=j+salto;
                    if(arreglo[j]<=arreglo[k]){
                        j=-1;
                    }else{
                        auxiliar=arreglo[j];
                        arreglo[j]=arreglo[k];
                        arreglo[k]=auxiliar;
                        j=j-salto;
                    }
                }
            }
            salto=salto/2;
        }
        System.out.println("arreglo ordenado");
        mostrarArreglo(arreglo);
    } 
    public void mostrarArreglo(int arreglo[]){
        int k;
        for ( k = 0; k < arreglo.length; k++) {
            System.out.print("["+arreglo[k]+"]");
        }
         System.out.println();
    }
}
