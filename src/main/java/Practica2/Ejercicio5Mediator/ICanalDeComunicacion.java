package Practica2.Ejercicio5Mediator;

public interface ICanalDeComunicacion {
    void sendUser(String message, User user);
    void sendGroup(String message, String nameGroup, User sender);
}
