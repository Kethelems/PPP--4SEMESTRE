package apresentacao;
import negocio.TemaUI;

public class Aplicando {
    private TemaUI temaAtual;

    public void setTema(TemaUI tema) {
        this.temaAtual = tema;
    }

    public void aplicarTema() {
        if (temaAtual != null) {
            temaAtual.aplicarTema();
        } else {
            System.out.println("Você não selecionou um tema.");
        }
    }
    }

