package exercicio7;

import java.util.Scanner;
import java.util.ArrayList;

public class atividade2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a;
        ArrayList<Integer> lista = new ArrayList();

        for(int i = 0; i<10; i++){
            a = ler.nextInt();
            lista.add(a);
        }
        for(int j=0; j<lista.size(); j++) {
            if (lista.get(j) % 2 == 0) {
                lista.remove(j);
            }
        }
        for(int k=0; k<lista.size(); k++){
            System.out.println("Elemento: "+ lista.get(k));

        }

    }
}
