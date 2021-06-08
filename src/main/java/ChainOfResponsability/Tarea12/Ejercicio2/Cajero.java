package ChainOfResponsability.Tarea12.Ejercicio2;

public class Cajero implements ICarnetizacion{
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
        if (requisitos.isCertificadodenacimiento() && !requisitos.isPagoAlbanco() && requisitos.isFicha()){
            System.out.println("INFO> Le falta hacer el pago");
            System.out.println("Debe ir al banco");
            System.out.println();
        } else {
            this.next.procesoDeCarnetizacion(requisitos);
        }
    }
}
