package Mediator.Tarea10;

public class SM extends Colleague{
    String name;
    String certificaciones;

    public SM(ICanalDeComunicacion mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        canalDeComunicacion.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO message recived SM:");
        System.out.println("Name: "+ name);
        System.out.println("CI: "+ ci);
        System.out.println("Certificaciones: "+ certificaciones);
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

    public String getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
    }
}
