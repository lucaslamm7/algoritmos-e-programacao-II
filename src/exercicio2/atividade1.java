package exercicio2;

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int x[] = new int[20], a = 0;

        System.out.println("Escreva 20 numeros inteiros: ");

        for(int i = 0; i < 20; i++){
            x[i] = ler.nextInt();
            if((x[i]%2) == 0){
                a++;
            }
        }
        System.out.println("Existem "+ a +" valores pares");
    }

}
