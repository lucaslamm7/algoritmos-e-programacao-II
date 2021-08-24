package exercicio11;

public class main {
    public static void main(String[] args){
        Cachorro a1 = new Cachorro("Cleber", 2, "AUAUAUAUAUAU", "Correr");
        Cavalo a2 = new Cavalo("Walter", 4, "iiirrrrí", "Correr");
        Preguica a3 = new Preguica("Valdeci", 6, "aaaaaaaaaaaaa", "Subir na arvore");
        Veterinario v1 = new Veterinario();

        a1.correr();
        a1.emitirSom();
        System.out.println("======================================");
        a2.correr();
        a2.emitirSom();
        System.out.println("======================================");
        a3.subirArvore();
        a3.emitirSom();
        System.out.println("======================================");
        v1.examinar(a1);
        v1.examinar(a2);
        v1.examinar(a3);


    }
}
