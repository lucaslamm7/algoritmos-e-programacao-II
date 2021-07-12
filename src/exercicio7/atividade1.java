package exercicio7;

import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;

public class atividade1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i;
        ArrayList<Integer> lista = new ArrayList();

        System.out.println("Digite valores positivos, se quiser parar o programa, digite um valor negativo.");
        i = ler.nextInt();

        while(i>=0){
            lista.add(i);
            i = ler.nextInt();
        }

            for(int j=0; j < lista.size(); j++){
                int pos = lista.get(j);
                System.out.println("Elemento: " + pos);
            }
            for(int pos2 : lista){
                System.out.println("Elemento: " + pos2);
            }
            Iterator it = lista.iterator();

            while(it.hasNext()){
                int pos3 = (Integer) it.next();
                System.out.println("Elemento: " + pos3);

        }

    }
}
