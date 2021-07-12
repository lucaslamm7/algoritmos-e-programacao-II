package exercicio7;

import java.util.Scanner;
import java.util.ArrayList;

public class atividade3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opc, opc2, n=1;
        String novo;
        ArrayList<String> lista = new ArrayList();

        while(n!=0){
            System.out.println("Digite 1 para adicionar, 2 para ver a lista e 3 para excluir!");
            opc = ler.nextInt();
            if(opc==1){
                System.out.println("Digite o elemento que deseja adicionar: (NOME;NUMERO)");
                novo = ler.next();
                lista.add(novo);
            }
            else if(opc==2){
                for(int i=0; i< lista.size();i++){
                    System.out.println((i+1)+") "+ lista.get(i));
                }
            }
            else if(opc==3){
                for(int i=0; i< lista.size();i++){
                    System.out.println((i+1)+") "+ lista.get(i));
                }
                System.out.println("Digite o numero da linha que deseja excluir");
                    opc2 = ler.nextInt();
                    lista.remove(opc2-1);
            }else{
                System.out.println("Voce não digitou uma opção valida!");
            }
        }
    }
}
