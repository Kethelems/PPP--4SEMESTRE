package apresentacao;

import negocio.TemaAltoContraste;
import negocio.TemaClaro;
import negocio.TemaEscuro;

public class Main {
    public static void main(String[] args) {
        Aplicando app = new Aplicando();

        app.setTema(new TemaClaro());
        app.aplicarTema();

        // Usuário muda para tema escuro
        app.setTema(new TemaEscuro());
        app.aplicarTema();

        // Usuário muda para alto contraste
        app.setTema(new TemaAltoContraste());
        app.aplicarTema();
    }
}

