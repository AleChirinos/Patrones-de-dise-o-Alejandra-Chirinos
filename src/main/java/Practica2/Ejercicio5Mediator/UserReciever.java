package Practica2.Ejercicio5Mediator;

public class UserReciever extends User {
    private String name;

    public UserReciever(ICanalDeComunicacion mediator, String name) {
        super(mediator);
        this.name=name;
    }

    @Override
    public void messageReceived(String message) {
        System.out.println(name + " ha recibido el mensaje: "+ message);
    }

    @Override
    public void sendUser(String message, User userDestination) {
        canalDeComunicacion.sendUser(message, userDestination);
    }

    @Override
    public void sendGroup(String message, String group) {
        canalDeComunicacion.sendGroup(message, group, this);
    }
}