package algoritmos;

import java.util.Arrays;
import java.util.Random;

public class quick {

    public static void main(String[] args) {
        int n = 100;
        int[] vet = new int[15];
        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            vet[i] = random.nextInt(n);
        }

        System.out.println("Aleatorio: ");
        System.out.println(Arrays.toString(vet));

        crescente(vet, 0, vet.length - 1);

        System.out.println("\n\nOrdenado Crescente: ");
        System.out.println(Arrays.toString(vet));

        inverter(vet, 0, vet.length - 1);

        System.out.println("\n\nOrdenado Decrescente: ");
        System.out.println(Arrays.toString(vet));

        System.out.println("\n");
    }

    static void crescente(int[] vet, int left, int right) {
        if (left < right) {
            int p = pivotCres(vet, left, right);
            crescente(vet, left, p);
            crescente(vet, p + 1, right);
        }
    }

    private static int pivotCres(int[] vet, int left, int right) {
        int middle = (left + right) / 2;
        int pivot = vet[middle];
        int i = left - 1;
        int j = right + 1;

        while (true) {
            do {
                i++;
            } while (vet[i] < pivot);
                do {
                    j--;
                } while (vet[j] > pivot);
            if (i >= j) {
                return j;
            }
            int aux = vet[i];
            vet[i] = vet[j];
            vet[j] = aux;
        }
    }

    static void inverter(int[] vet, int left, int right) {
        int i = left;
        int f = right;

        while (i < f) {
            trocar(vet, i, f);
            i++;
            f--;
        }
    }

    private static void trocar(int[] vet, int left, int right) {
        int i = left;
        int f = right;

        int aux = vet[i];
        vet[i] = vet[f];
        vet[f] = aux;
    }
}
