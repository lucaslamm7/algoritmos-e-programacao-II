package exercicio6;

import java.util.Scanner;
import java.util.ArrayList;

public class atividade1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String NovoNome;

        ArrayList<String> nomes = new ArrayList();

        nomes.add("Lucas Lammel");
        nomes.add("Fulano de Tal");

        System.out.println("Digite um nome para coloca-lo na lista.");

        NovoNome = ler.nextLine();

        if(nomes.contains(NovoNome)){
            System.out.println("Este nome ja esta na lista!");
        }else{
            nomes.add(NovoNome);
            System.out.println(NovoNome + " foi adicionado na lista na " + nomes.indexOf(NovoNome) + " posicao!");
        }

        while(NovoNome.length()!=0){
            if(nomes.contains(NovoNome)){
                System.out.println("Este nome ja esta na lista!");
            }else{
                nomes.add(NovoNome);
                System.out.println(NovoNome + " foi adicionado na lista na " + nomes.indexOf(NovoNome) + " posicao!");
            }
            System.out.println("Digite um nome para coloca-lo na lista ou não digite nada para parar de inserir.");
            NovoNome = ler.nextLine();
            System.out.println(NovoNome);
        }

        for(int i=0; i < nomes.size(); i++){
            System.out.println((i+1) + ") " + nomes.get(i));
        }
    }
}
