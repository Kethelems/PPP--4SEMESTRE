package negocio;

public class MoverParaFrenteCommand implements Command {
    private Personagem personagem;
    private int passos;

    public MoverParaFrenteCommand(Personagem personagem, int passos) {
        this.personagem = personagem;
        this.passos = passos;
    }

    @Override
    public void execute() {
        this.personagem.mover(0, this.passos);
    }

    @Override
    public void undo() {
        this.personagem.mover(0, -this.passos);
    }
}