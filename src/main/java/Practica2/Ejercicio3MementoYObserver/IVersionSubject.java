package Practica2.Ejercicio3MementoYObserver;

public interface IVersionSubject {
    void attach(ISuscriptorObserver observer);
    void deattach(ISuscriptorObserver observer);
    void notifyObserver(int version);
}
