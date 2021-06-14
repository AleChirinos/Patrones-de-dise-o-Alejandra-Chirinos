package Practica2.Ejercicio5Mediator;

import java.util.LinkedList;
import java.util.List;

public class UserGroup {
    List<User> group = new LinkedList<>();
    String name;

    public UserGroup(String name) {
        this.name = name;
    }

    public List<User> getGrupo() {
        return group;
    }

    public void setGrupo(List<User> group) {
        this.group = group;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String name) {
        this.name = name;
    }
}
