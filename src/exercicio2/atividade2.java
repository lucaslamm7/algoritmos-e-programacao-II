package exercicio2;

import java.util.Scanner;

public class atividade2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a[] = new int[10], b[] = new int [10], c[] = new int[10];

        System.out.println("Digite 10 numeros: ");
        for(int i=0; i<10; i++){
            a[i] = ler.nextInt();
        }
        System.out.println("Digite mais 10 numeros: ");
        for(int i=0; i<10; i++){
            b[i] = ler.nextInt();
        }
        for(int i=0; i<10; i++){
            c[i] = (a[i]*b[i]);
        }
        System.out.println("O vetor multiplicacao eh: ");
        for(int i=0; i<10; i++){
            System.out.println("A multiplicacao do indice "+ (i+1) +" eh: "+ c[i]);
        }
    }
}
