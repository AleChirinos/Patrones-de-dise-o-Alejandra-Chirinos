package ChainOfResponsability.Tarea12.Ejercicio3;

public class ArregloPersonas {
    private String id;
    private Persona[] data;

    public ArregloPersonas(String id, Persona[] data) {
        this.id = id;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Persona[] getData() {
        return data;
    }

    public void setData(Persona[] data) {
        this.data = data;
    }
}