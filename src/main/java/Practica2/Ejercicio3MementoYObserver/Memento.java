package Practica2.Ejercicio3MementoYObserver;


public class Memento {
    private Code state;

    public Memento(Code stateSaved){
        this.state=stateSaved;
    }

    public Code getState() {
        return state;
    }
}
