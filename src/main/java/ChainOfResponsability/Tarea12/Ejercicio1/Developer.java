package ChainOfResponsability.Tarea12.Ejercicio1;

public class Developer implements IEncargados {
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
          if (solicitud.isFuncionalidad() ==true ){
              System.out.println("INFO> Lo arreglan los DevOps, estima la nueva funcionalidad");
          } else {
              this.next.solucionarError(solicitud);
          }
    }
}
