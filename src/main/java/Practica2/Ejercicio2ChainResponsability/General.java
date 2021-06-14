package Practica2.Ejercicio2ChainResponsability;

public class General implements IEjercito{
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
        if (tipoDeOrden.equals("ENTREVISTAS")){
            System.out.println("INFO> General hace las entrevistas");
            System.out.println();
        } else {
            this.next.orden(tipoDeOrden);
        }
    }
}
