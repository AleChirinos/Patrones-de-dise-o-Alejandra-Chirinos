package ChainOfResponsability.Tarea12.Ejercicio1;

public class QA implements IEncargados {
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
          if (solicitud.isBug() ==true || solicitud.isMejora()==true){
              System.out.println("INFO> Lo arreglan los QA, aísla el error");
          } else {
              this.next.solucionarError(solicitud);
          }
    }
}
