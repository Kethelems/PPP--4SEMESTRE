package negocio;

public class Personagem {
    private int posicaoX;
    private int posicaoY;

    public Personagem() {
        this.posicaoX = 0;
        this.posicaoY = 0;
    }

    public void mover(int x, int y) {
        this.posicaoX += x;
        this.posicaoY += y;
        System.out.println("Personagem moveu para (" + this.posicaoX + ", " + this.posicaoY + ")");
    }
}