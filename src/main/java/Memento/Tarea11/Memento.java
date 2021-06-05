package Memento.Tarea11;


public class Memento {
    private BackUplist state;

    public Memento(BackUplist stateSaved){
        this.state=stateSaved;
    }

    public BackUplist getState() {
        return state;
    }
}
