package ChainOfResponsability.Tarea12.Ejercicio2;

public class AyudaAlCliente implements ICarnetizacion{
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
        if (!(requisitos.isCertificadodenacimiento() && requisitos.isPagoAlbanco() && requisitos.isFicha())){
            System.out.println("INFO> No tiene los requisitos necesarios");
            System.out.println("Debe ir a ayuda al cliente para ser informado");
            System.out.println();
        } else {
            System.out.println("ERROR");
        }
    }
}