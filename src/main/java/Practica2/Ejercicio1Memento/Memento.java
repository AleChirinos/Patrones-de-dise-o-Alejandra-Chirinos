package Practica2.Ejercicio1Memento;

public class Memento {
    private TesisObject state;

    public Memento(TesisObject stateSaved){
        this.state=stateSaved;
    }

    public TesisObject getState() {
        return state;
    }
}
