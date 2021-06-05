package Memento.Tarea11;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private Map<String,Memento> stateSaved= new HashMap<>();

    public void createBackup(String aliasBackup, Memento memento){
        stateSaved.put(aliasBackup,memento);
    }

    public Memento getMemento(String aliasBackup){
        return stateSaved.get(aliasBackup);
    }
}
