package Mediator.Tarea10;

public class QA extends Colleague{
    String name;
    String grado;

    public QA(ICanalDeComunicacion mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        canalDeComunicacion.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO message recived QA:");
        System.out.println("Name: "+ name);
        System.out.println("CI: "+ ci);
        System.out.println("Grado: "+ grado);
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

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
}
