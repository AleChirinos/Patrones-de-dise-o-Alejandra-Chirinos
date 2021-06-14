package Practica2.Ejercicio1Memento;

import java.util.HashMap;
import java.util.Map;

public class TutorCareTaker {
    private Map<String,Memento> stateSaved= new HashMap<>();

    public void createVersion(String version, Memento memento){
        stateSaved.put(version,memento);
    }

    public Memento getMemento(String version){
        return stateSaved.get(version);
    }
}
