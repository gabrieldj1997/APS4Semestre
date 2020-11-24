
package algoritmos;
    import java.util.Arrays;
import javax.swing.JOptionPane;

public class InsertionSort {

    public static void main(String[] args) {
        int A[] = new int[10];
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("1 para Crescente, 2 para Decrescente?"));
        populateArray(A);
        System.out.println("Antes do insertion: ");
        printArray(A);
        // sort the array
        if(opcao==1){
        insertionSortCresc(A);
        }else if(opcao==2){
            insertionSortDesc(A);
        }
        System.out.println("Depois do insertion: ");
        printArray(A);
    }

    //Crescente Int
    private static void insertionSortCresc(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int valueToSort = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > valueToSort) { 
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = valueToSort;
        }
    }

        private static void insertionSortDesc(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int valueToSort = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] < valueToSort) { 
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = valueToSort;
        }
    }

    public static void printArray(int[] B) {
        System.out.println(Arrays.toString(B));
    }

    public static void populateArray(int[] B) {
        for (int i = 0; i < B.length; i++) {
            B[i] = (int) (Math.random() * 100);
        }
    }
}
    

