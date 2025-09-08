package negocio;

public interface Subject {
    void registerObserver(Observer display);
    void removeObserver(Observer display);
    void notifyObservers();
}

