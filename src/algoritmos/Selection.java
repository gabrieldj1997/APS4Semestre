package algoritmos;
//Selection
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Selection {
    
    public static void main(String[] args) {
        Selection select = new Selection();
        int[] vet={6,4,3,4,412,54,432,5436,6546546,3252,34234234,6356,356,546,4573,47,367,567,635,87,846,67,9,869,8,57,57,07,0,79,9};
        String[] Nomes={"Maria","João","Creisane","Aline","Alineb","Kevin"};
        int opcao=Integer.parseInt(JOptionPane.showInputDialog("1 para Int cresc, 2 para int desc,3 para Int Random, 4 para String Crescente,5 para String decrescente, "
                + "6 para String Random"));
        switch (opcao) {
            case 1:
                select.IntCresc(vet);
                break;
            case 2:
                select.IntDec(vet);
                break;
            case 3:
                select.IntRandom(vet);
                break;
            case 4:
                select.StringCresc(Nomes);
                break;
            case 5:
                select.StringDec(Nomes);
                break;
            case 6:
                select.StringRandom(Nomes);
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
    }
        //Int Crescente
	private static void IntCresc(int[] vet) {
            System.out.println("valor sem ordenação");
            System.out.println(Arrays.toString(vet));
            for(int i = 0; i <= vet.length-1; i++) {
                int menor = i;
                    for (int j=i + 1; j<= vet.length-1; j++) {
                        if(vet[j] < vet[menor]){
                            menor = j;
			}
                        }
			trocar(vet, i , menor);
                        System.out.println(Arrays.toString(vet));
		}
        System.out.println("Valor ordenado:");
        System.out.println(Arrays.toString(vet));
	}
        //Int Decrescente
        private void IntDec(int[]vet){
            System.out.println("valor sem ordenação");
            System.out.println(Arrays.toString(vet));
            for(int i=0; i<=vet.length-1;i++){
                int menor=i;
                for(int j=i+1; j<=vet.length-1;j++){
                    if(vet[j]>vet[menor]){
                        menor=j;
                    }
                }
                trocar(vet,i,menor);
            }
        System.out.println("Valor ordenado:");
        System.out.println(Arrays.toString(vet));
        }
        //Int Random
        private void IntRandom(int []vet){
            System.out.println("Vetor desordenado: ");
            System.out.println(Arrays.toString(vet));
            System.out.println("Vetor aleatorio:");
            System.out.println(Arrays.toString(vet));
        }
        //String Crescente
        private void StringCresc(String[] Nomes){
            System.out.println("valor sem ordenação");
            System.out.println(Arrays.toString(Nomes));
            for(int i = 0; i < Nomes.length; i++) {
			int pivo = i;
                        String menor=Nomes[i];
			for (int j=i+1; j<Nomes.length; j++) {
				if(Nomes[j].compareTo(menor)<0){
					pivo = j;
                                        menor=Nomes[j];
			}
                        }
                        Nomes[pivo]=Nomes[i];
                        Nomes[i]=menor;
	}
        System.out.println("Valor ordenado:");
        System.out.println(Arrays.toString(Nomes));
        }
        //String Derescente
        private void StringDec(String[] Nomes){
            System.out.println("valor sem ordenação");
            System.out.println(Arrays.toString(Nomes));
            for(int i = 0; i < Nomes.length; i++) {
		int pivo = i;
                String menor=Nomes[i];
                for (int j=i+1; j<Nomes.length; j++) {
                    if(Nomes[j].compareTo(menor)>0){
                    pivo = j;
                    menor=Nomes[j];
                    }
                }
                Nomes[pivo]=Nomes[i];
                Nomes[i]=menor;
            }
        System.out.println("Valor ordenado:");
        System.out.println(Arrays.toString(Nomes));
        }
        //String Random
        private void StringRandom(String[] Nomes){
            System.out.println("Vetor desordenado: ");
            System.out.println(Arrays.toString(Nomes));
            System.out.println("Vetor aleatorio: ");
            System.out.println(Arrays.toString(Nomes));
        }
	//Método de troca
        private static void trocar(int[] vet, int i, int menor) {
            int aux = vet[i];
            vet[i] = vet[menor];
            vet[menor] = aux;	
	}
       	
}