package ChainOfResponsability.Tarea12.Ejercicio2;

public class Oficina  implements ICarnetizacion {
    private ICarnetizacion next;

    @Override
    public void setNext(ICarnetizacion handler) {
        this.next=handler;
    }

    @Override
    public ICarnetizacion next() {
        return this.next;
    }

    @Override
    public void procesoDeCarnetizacion(Requisitos requisitos) {
        ResponsableDeCarnetizacion responsable = new ResponsableDeCarnetizacion();
        this.setNext(responsable);

        Notario notario= new Notario();
        responsable.setNext(notario);

        Cajero cajero = new Cajero();
        notario.setNext(cajero);

        AyudaAlCliente ayuda = new AyudaAlCliente();
        cajero.setNext(ayuda);

        this.next.procesoDeCarnetizacion(requisitos);
    }
}