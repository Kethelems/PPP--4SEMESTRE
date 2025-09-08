package apresentacao;
import negocio.DisplayTemperatura;
import negocio.EstacaoClimatica;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("=== Sistema de Monitoramento Climático ===\n");

        EstacaoClimatica centralMeteorologica = new EstacaoClimatica();

        DisplayTemperatura painelPrincipal = new DisplayTemperatura("Painel Principal - Sala de Controle");
        DisplayTemperatura painelSecundario = new DisplayTemperatura("Painel Backup - Laboratório");
        DisplayTemperatura painelPublico = new DisplayTemperatura("Display Público - Entrada");

        System.out.println("Conectando displays ao sistema...");
        centralMeteorologica.registerObserver(painelPrincipal);
        centralMeteorologica.registerObserver(painelSecundario);
        centralMeteorologica.registerObserver(painelPublico);

        System.out.println("\n--- Iniciando coleta de dados ---");
        
        System.out.println("\n Temperatura matinal:");
        centralMeteorologica.setTemperatura(18.7f);
        
        aguardar(1000);
        
        System.out.println("\n Temperatura do meio-dia:");
        centralMeteorologica.setTemperatura(26.3f);
        
        aguardar(1000);
        
        System.out.println("\n Temperatura da tarde:");
        centralMeteorologica.setTemperatura(31.8f);

        System.out.println("\n Realizando manutenção no painel secundário...");
        centralMeteorologica.removeObserver(painelSecundario);
        
        System.out.println("\n Temperatura noturna (apenas displays ativos):");
        centralMeteorologica.setTemperatura(23.1f);
        
        System.out.println("\n Painel secundário reconectado após manutenção:");
        centralMeteorologica.registerObserver(painelSecundario);
        centralMeteorologica.setTemperatura(19.5f);
        
        System.out.println("\n=== Sistema finalizado com sucesso ===");
    }

    public static void aguardar(int millisegundos) {
        try {
            Thread.sleep(millisegundos);
        } catch (InterruptedException e) {
            System.err.println("Erro na simulação de tempo: " + e.getMessage());
        }
    }
}
