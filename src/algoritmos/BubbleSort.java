package algoritmos;
//Bubble

import java.util.Arrays;
import javax.swing.JOptionPane;

public class BubbleSort {

    public static void main(String[] args) {
        int[] vet = {6, 4, 3, 4, 412, 54, 432, 5436, 6546546, 3252, 34234234, 6356, 356, 546, 4573, 47, 367, 567, 635, 87, 846, 67, 9, 869, 8, 57, 57, 07, 0, 79, 9};
        String[] Nomes = {"Maria", "João", "Creisane", "Aline", "Alineb", "Kevin"};
        BubbleSort bubble = new BubbleSort();
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("1 para int em ordem crescente, 2 para int em ordem decrescente,"
                + "3 para Int aleatorio, 4 para String em ordem crescente,  5 para String em ordem decrescente,  6 para String aleatorio"));
        switch (opcao) {
            case 1:
                bubble.IntCresc(vet);
                break;
            case 2:
                bubble.IntDec(vet);
                break;
            case 3:
                bubble.IntRandom(vet);
                break;
            case 4:
                bubble.StringCresc(Nomes);
                break;
            case 5:
                bubble.StringDec(Nomes);
                break;
            case 6:
                bubble.StringRandom(Nomes);
                break;
            default:
                System.out.println("Valor inválido!");
                break;
        }

    }

    //Int Crescente
    public void IntCresc(int[] vet) {
        System.out.println("valor sem ordenação");
        System.out.println(Arrays.toString(vet));
        boolean controle = true;
        while (controle) {
            controle = false;
            for (int i = 0; i < vet.length - 1 ; i++) {
                if (vet[i] > vet[i + 1]) {
                    int aux = vet[i];
                    vet[i] = vet[i + 1];
                    vet[i + 1] = aux;
                    controle = true;
                }
            }
            System.out.println("Valor ordenado:");
            System.out.println(Arrays.toString(vet));

        }
    }
        //Int decrescente
    public void IntDec(int[] vet) {
        System.out.println("valor sem ordenação");
        System.out.println(Arrays.toString(vet));
        boolean controle = true;
        while (controle) {
            controle = false;
            for (int i = 0; i < vet.length - 1; i++) {
                for (int j = 0; j < vet.length - 1; j++) {
                    if (vet[j] < vet[j + 1]) {
                        int aux = vet[j];
                        vet[j] = vet[j + 1];
                        vet[j + 1] = aux;
                        controle = true;
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, Arrays.toString(vet));

    }

    //Int Random
    public void IntRandom(int[] vet) {
        System.out.println("Vetor desordenado: ");
        System.out.println(Arrays.toString(vet));
        System.out.println("Vetor aleatorio:");
        System.out.println(Arrays.toString(vet));

    }

    //String Crescente
    public void StringCresc(String[] Nomes) {
        System.out.println("valor sem ordenação");
        System.out.println(Arrays.toString(Nomes));
        boolean controle = true;
        while (controle) {
            controle = false;
            for (int i = 0; i < Nomes.length - 1; i++) {
                for (int j = 0; j < Nomes.length - 1; j++) {
                    if (Nomes[j].compareTo(Nomes[j + 1]) > 0) {
                        String aux = Nomes[j];
                        Nomes[j] = Nomes[j + 1];
                        Nomes[j + 1] = aux;
                        controle = true;
                    }
                }
            }
        }
        System.out.println("Valor ordenado:");
        System.out.println(Arrays.toString(Nomes));

    }

    //String Descrescente
    public void StringDec(String[] Nomes) {
        System.out.println("valor sem ordenação");
        System.out.println(Arrays.toString(Nomes));
        boolean controle = true;
        while (controle) {
            controle = false;
            for (int i = 0; i < Nomes.length - 1; i++) {
                for (int j = 0; j < Nomes.length - 1; j++) {
                    if (Nomes[j].compareTo(Nomes[j + 1]) < 0) {
                        String aux = Nomes[j];
                        Nomes[j] = Nomes[j + 1];
                        Nomes[j + 1] = aux;
                        controle = true;
                    }
                }
            }
        }
        System.out.println("Valor ordenado:");
        System.out.println(Arrays.toString(Nomes));

    }

    //String Random
    public void StringRandom(String[] Nomes) {
        System.out.println("Vetor desordenado: ");
        System.out.println(Arrays.toString(Nomes));
        System.out.println("Vetor aleatorio:");
        System.out.println(Arrays.toString(Nomes));

    }

}
