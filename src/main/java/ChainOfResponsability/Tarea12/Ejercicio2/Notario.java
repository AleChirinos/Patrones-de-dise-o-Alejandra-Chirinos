package ChainOfResponsability.Tarea12.Ejercicio2;

public class Notario implements ICarnetizacion{
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
        if (!requisitos.isCertificadodenacimiento() && requisitos.isPagoAlbanco() && requisitos.isFicha()){
            System.out.println("INFO> Le falta el certificaco de nacimiento");
            System.out.println("Debe ir al notario");
            System.out.println();
        } else {
            this.next.procesoDeCarnetizacion(requisitos);
        }
    }
}
