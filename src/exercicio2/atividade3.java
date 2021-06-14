package exercicio2;

import java.util.Scanner;

public class atividade3 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int a[] = new int[10], menor, index=0;

        System.out.println("Insira 10 valores inteiros:");
        for(int i=0; i<10; i++){
            a[i] = ler.nextInt();
        }

        menor = a[0];

        for(int k=0; k<10; k++){
            if(a[k] < menor) {
                menor = a[k];
                index = k;
            }
        }

        System.out.printf("O menor numero do vetor eh o "+ menor +", que correponde ao indice: "+ (index+1));
    }

}
