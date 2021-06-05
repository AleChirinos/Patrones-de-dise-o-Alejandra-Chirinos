package Memento.Tarea11;


public class Memento {
    private Person state;

    public Memento(Person stateSaved){
        this.state=stateSaved;
    }

    public Person getState() {
        return state;
    }
}
