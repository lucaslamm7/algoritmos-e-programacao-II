package exercicio11;

public class Animal {
    String nome;
    int idade;
    String som;

    public Animal(String nome, int idade, String som){
        this.nome = nome;
        this.idade = idade;
        this.som = som;
    }

    public void emitirSom(){
        System.out.println("Som: " + this.som);
    }
}
