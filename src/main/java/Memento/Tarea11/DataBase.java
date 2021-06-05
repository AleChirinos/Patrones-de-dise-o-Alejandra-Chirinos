package Memento.Tarea11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase {
    private List<Memento> stateSaved= new ArrayList<>();

    public void addBackup(Memento memento){
        stateSaved.add(memento);
    }

    public Memento getMemento(int position){
        return stateSaved.get(position);
    }
}
