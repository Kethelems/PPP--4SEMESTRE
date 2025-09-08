package negocio;

public class DisplayTemperatura implements Observer {
    private String nomeDisplay;

    public DisplayTemperatura(String nomeDisplay) {
        this.nomeDisplay = nomeDisplay;
    }

    @Override
    public void update(float temperatura) {
        System.out.println(nomeDisplay + " atualizado: Temperatura atual = " + temperatura + "°C");
}
}