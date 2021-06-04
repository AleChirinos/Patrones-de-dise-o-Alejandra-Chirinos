package Mediator.Tarea10;

public class DEV extends Colleague{
    String name;
    String lenguaje;

    public DEV(ICanalDeComunicacion mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        canalDeComunicacion.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO message recived DEV:");
        System.out.println("Name: "+ name);
        System.out.println("CI: "+ ci);
        System.out.println("Lenuaje: "+ lenguaje);
        System.out.println("Message: "+ message);
        System.out.println("");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
}
