package negocio;

import java.util.ArrayList;
import java.util.List;

public class Controle {
    private Command moverFrente;
    private Command moverTras;
    private List<Command> historicoDeComandos;

    public Controle(Personagem personagem) {

        this.moverFrente = new MoverParaFrenteCommand(personagem, 10);
        this.moverTras = new MoverParaTrasCommand(personagem, 10);
        
        this.historicoDeComandos = new ArrayList<>();
    }

    public void apertarBotaoMoverFrente() {
        this.moverFrente.execute();
        this.historicoDeComandos.add(this.moverFrente);
    }

    public void apertarBotaoMoverTras() {
        this.moverTras.execute();
        this.historicoDeComandos.add(this.moverTras);
    }

    public void undoUltimoComando() {
        if (!this.historicoDeComandos.isEmpty()) {

            int ultimoIndex = this.historicoDeComandos.size() - 1;
            Command ultimoComando = this.historicoDeComandos.get(ultimoIndex);
            
            ultimoComando.undo();
            
            this.historicoDeComandos.remove(ultimoIndex);
        } else {
            System.out.println("Não tem comandos para desfazer.");
        }
    }
}