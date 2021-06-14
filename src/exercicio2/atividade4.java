package exercicio2;

import java.util.Scanner;

public class atividade4 {

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int a[]= new int[20], b[]= new int[20], x=0;

        System.out.println("Insira 20 valores inteiros para o vetor A: ");
        for(int i=0; i<20; i++){
            a[i] = ler.nextInt();
        }

        for(int k=19; k>=0; k--){
            b[k] = a[x];
            x++;
        }
        System.out.println("o vetor A invertido eh: ");
        for(int j=0; j<20; j++){
            System.out.printf(" "+b[j]);
        }

    }
}
