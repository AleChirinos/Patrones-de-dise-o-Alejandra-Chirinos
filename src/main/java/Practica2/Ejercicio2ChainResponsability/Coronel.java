package Practica2.Ejercicio2ChainResponsability;

public class Coronel implements IEjercito{
    private IEjercito next;

    @Override
    public void setNext(IEjercito handler) {
        this.next=handler;
    }

    @Override
    public IEjercito next() {
        return this.next;
    }

    @Override
    public void orden(String tipoDeOrden) {
        if (tipoDeOrden.equals("DESBLOQUEOS")){
            System.out.println("INFO> Coronel se encarga de los desbloqueos");
            System.out.println();
        } else if(tipoDeOrden.equals("MANIFESTACIONES")){
            System.out.println("INFO> Coronel se encarga de las manifestaciones");
            System.out.println();
        }else{
            this.next.orden(tipoDeOrden);
        }
    }
}
