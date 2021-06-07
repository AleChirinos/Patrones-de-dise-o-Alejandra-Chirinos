package ChainOfResponsability.Tarea12.Ejercicio1;


public class Encargado implements IEncargados {
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

          DevOps devOps = new DevOps();
          this.setNext(devOps);

          QA qa = new QA();
          devOps.setNext(qa);

          Developer devaloper = new Developer();
          qa.setNext(devaloper);

          Finanzas finanzas = new Finanzas();
          devaloper.setNext(finanzas);

          Support support = new Support();
          finanzas.setNext(support);

          this.next.solucionarError(solicitud);
    }
}
