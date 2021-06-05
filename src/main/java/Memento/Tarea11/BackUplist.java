package Memento.Tarea11;

import java.util.LinkedList;
import java.util.List;

public class BackUplist {
    String backUpList;
    List<Person>people;

    public BackUplist() {
        people=new LinkedList<Person>();
    }
    public BackUplist(String name, List dataBase) {
        this.backUpList =name;
        this.people=dataBase;
    }
    public String getBackUp() {
        return backUpList;
    }

    public void setBackUp(String backUp) {
        this.backUpList = backUp;
    }

    public List<Person> getBaseDeDatos() {
        return people;
    }

    public void setBaseDeDatos(List<Person> baseDeDatos) {
        this.people = baseDeDatos;
    }

    public void showInfo() {
        System.out.println("Alias BackUp: "+ backUpList);
        System.out.println("");
        for(Person p: people) {
            p.info();
        }
    }
}
