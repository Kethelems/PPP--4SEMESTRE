package apresentacao;

import negocio.Controle;
import negocio.Personagem;

public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();

        Controle controleDoJogo = new Controle(personagem);

        System.out.println("--- JOGADORA MOVENDO ---");
        controleDoJogo.apertarBotaoMoverFrente();
        controleDoJogo.apertarBotaoMoverFrente();
        controleDoJogo.apertarBotaoMoverTras();

        System.out.println("\n--- REBOBINANDO OS MOVIMENTOS ---");
        controleDoJogo.undoUltimoComando();
        controleDoJogo.undoUltimoComando();
        controleDoJogo.undoUltimoComando();
    }
}
