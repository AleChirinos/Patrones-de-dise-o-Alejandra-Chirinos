package ChainOfResponsability.Tarea12.Ejercicio3;

public class Persona {
    private int ci;
    private String name;
    private int age;

    public Persona(int ci, String name, int age) {
        this.ci=ci;
        this.name = name;
        this.age = age;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
