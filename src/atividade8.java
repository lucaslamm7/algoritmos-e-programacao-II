import java.util.Scanner;

public class atividade8 {

    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int a[] = new int[15], c=0;

        System.out.println("Escreva um vetor V com 15 numeros inteiros: ");
        for(int i=0; i<15; i++){
            a[i] = ler.nextInt();
        }
        for(int j=0; j<15; j++){
            for(int k=0; k<14; k++){
                if(a[k] < a[k+1]){
                    c = a[k];
                    a[k] = a[k+1];
                    a[k+1] = c;
                }
            }
        }
        System.out.println("O vetor em ordem decrescente eh: ");
        for(int l=0; l<15; l++){
            System.out.printf(" %d ", a[l]);
        }

    }

}
