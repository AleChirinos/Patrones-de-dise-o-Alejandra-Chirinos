package ChainOfResponsability.Tarea12.Ejercicio1;

public class Support implements IEncargados {
    private  IEncargados next;

    @Override
    public void setNext(IEncargados handler) {
        this.next=handler;
    }

    @Override
    public IEncargados next() {
        return this.next;
    }

    @Override
    public void solucionarError(Solicitud solicitud) {
          if (solicitud.isOtro() ==true ){
              System.out.println("INFO> Lo arreglan los Support");
          } else {
              this.next.solucionarError(solicitud);
          }
    }
}
