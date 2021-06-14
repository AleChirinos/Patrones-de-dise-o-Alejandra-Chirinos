package Practica2.Ejercicio3MementoYObserver;

import java.util.ArrayList;
import java.util.List;

public class CommitGit {
    private List<Memento> list= new ArrayList<>();

    public void addMemento(Memento memento){
        list.add(memento);
    }

    public Memento getVersion(int version){
        return list.get(version);
    }
}
