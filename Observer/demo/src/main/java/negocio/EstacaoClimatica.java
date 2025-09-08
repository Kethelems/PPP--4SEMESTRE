package negocio;
import java.util.ArrayList;
import java.util.List;

public class EstacaoClimatica implements Subject {
    private List<Observer> observers;
    private float temperatura;

    public EstacaoClimatica() {
        observers = new ArrayList<>();
    }


    @Override
    public void removeObserver(Observer display) {
        observers.remove(display);
    }

    @Override
    public void notifyObservers() {
        for (Observer display : observers) {
            display.update(temperatura);
        }
    }
public void setTemperatura(float novaTemperatura) {
    if (Float.isNaN(novaTemperatura)) {
    throw new IllegalArgumentException("Temperatura não pode ser NaN");
    }
    
    System.out.println("\n>>> Nova temperatura detectada: " + novaTemperatura + "°C");
    this.temperatura = novaTemperatura;
    notifyObservers();
}

@Override
public void registerObserver(Observer display) {
    observers.add(display);
    display.update(temperatura);
}

}

