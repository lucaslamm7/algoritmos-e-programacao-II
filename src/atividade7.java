import java.util.Scanner;

public class atividade7 {

    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int v[] = new int[10], n, cont=0;

        System.out.println("Escreva um vetor V com 10 numeros inteiros: ");
        for(int i=0; i<10; i++){
            v[i] = ler.nextInt();
        }
        System.out.println("Digite um número inteiro: ");
        n = ler.nextInt();

        for(int j=0; j<10; j++){
            if(v[j] == n){
                System.out.println("O numero "+ n +" esta na posicao "+ (j+1) +" do vetor.");
                cont++;
            }
            else if(j == 9 && cont == 0){
                System.out.println("O numero fornecido nao existe no vetor.");
            }
        }

    }
}
