package Practica2.Ejercicio3MementoYObserver;

import java.util.ArrayList;
import java.util.List;

public class GitOriginator implements IVersionSubject {
    private Code state;
    private List<ISuscriptorObserver> observerList = new ArrayList<>();

    public void setState(Code state) {
        System.out.println("*** Set State ***");
        state.showInfo();
        this.state = state;
    }

    public Memento createVersion() {
        System.out.println("*** Create State ***");
        state.showInfo();
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento version) {
        this.state = version.getState();
        System.out.println("*** State Restored ***");
        this.state.showInfo();
        this.notifyObserver(state.getVersion());
    }

    @Override
    public void attach(ISuscriptorObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void deattach(ISuscriptorObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver(int version) {
        System.out.println("NOTIFICACION");
        for (ISuscriptorObserver observer : observerList) {
            observer.update("Se ha restaurado la version del codigo: " + version);
        }
        System.out.println();
    }
}
