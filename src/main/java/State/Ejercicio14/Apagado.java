package State.Ejercicio14;

public class Apagado implements IState {
    private Computadora computadora;

    public Apagado(Computadora computadora){
        this.computadora=computadora;
    }
    @Override
    public void handler() {
        computadora.setConsumoRAM("minimo");
        computadora.setConsumoCPU("minimo");
        String[] var={0+""};
        computadora.setProgramasAbiertos(var);
    }
}
