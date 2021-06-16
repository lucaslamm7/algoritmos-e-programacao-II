package exercicio3;

import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n;

        System.out.println("Digite um numero");
        n = ler.nextInt();

        String num = String.valueOf(n);

        for(int i=0; i<num.length(); i++){
            char c = num.charAt(i);
            if(c == '1'){
                System.out.printf("um ");
            }
            else if(c == '2'){
                System.out.printf("dois ");
            }
            else if(c == '3'){
                System.out.printf("tres ");
            }
            else if(c == '4'){
                System.out.printf("quatro ");
            }
            else if(c == '5'){
                System.out.printf("cinco ");
            }
            else if(c == '6'){
                System.out.printf("seis ");
            }
            else if(c == '7'){
                System.out.printf("sete ");
            }
            else if(c == '8'){
                System.out.printf("oito ");
            }
            else if(c == '9'){
                System.out.printf("nove ");
            }
            else if(c == '0'){
                System.out.printf("zero ");
            }
        }
    }
}
