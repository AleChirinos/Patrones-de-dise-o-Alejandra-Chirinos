package Mediator.Tarea10;

public abstract class Colleague {
     public int ci;
     protected ICanalDeComunicacion canalDeComunicacion;

     public Colleague(ICanalDeComunicacion mediator){
         this.canalDeComunicacion =mediator;
     }

     public abstract void send(String message);
     public abstract void messageReceived(String message);
}
