package exercicio10.atividade1;

import java.util.ArrayList;

public class escola {

    ArrayList<pessoas> listescola;

    escola(){
        this.listescola = new ArrayList<pessoas>();
    }

    public void addPessoa(pessoas p){
        this.listescola.add(p);
    }

    public void imprimir(){
        System.out.println("Todas as pessoas da escola:");
        for(pessoas p : this.listescola){
            System.out.println(p.nome);
        }
    }
}


