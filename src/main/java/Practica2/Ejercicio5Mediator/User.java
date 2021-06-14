package Practica2.Ejercicio5Mediator;

public abstract class User {
     protected ICanalDeComunicacion canalDeComunicacion;

     public User(ICanalDeComunicacion mediator){
         this.canalDeComunicacion =mediator;
     }

     public abstract void sendUser(String message, User user);
     public abstract void sendGroup(String message, String group);
     public abstract void messageReceived(String message);
}
