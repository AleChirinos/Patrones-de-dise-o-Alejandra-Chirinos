package Practica2.Ejercicio3MementoYObserver;

public class Desarrollador  implements ISuscriptorObserver{
    private String name;

    public Desarrollador(String name) {
        this.name=name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " recibio la actualización: "+ message);
    }
}
