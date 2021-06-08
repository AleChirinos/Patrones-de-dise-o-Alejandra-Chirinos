package ChainOfResponsability.Tarea12.Ejercicio2;

public class ResponsableDeCarnetizacion implements ICarnetizacion{
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
        if (requisitos.isCertificadodenacimiento() ==true && requisitos.isPagoAlbanco()==true && requisitos.isFicha()==true){
            System.out.println("INFO> Tiene todos los requisitos completos");
            System.out.println();
        } else {
            this.next.procesoDeCarnetizacion(requisitos);
        }
    }
}
