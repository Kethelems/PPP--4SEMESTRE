package negocio;

public class MoverParaTrasCommand implements Command {
    private Personagem personagem;
    private int passos;

    public MoverParaTrasCommand(Personagem personagem, int passos) {
        this.personagem = personagem;
        this.passos = passos;
    }

    @Override
    public void execute() {
        this.personagem.mover(0, -this.passos);
    }

    @Override
    public void undo() {
        this.personagem.mover(0, this.passos);
    }
}