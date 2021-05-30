package Practica1.FactoryMethod3;

public class KitEscolar implements IKit{
    private Mochila mochila;
    private Deportivo deportivo;
    private Cuaderno cuaderno;

    public KitEscolar(){
        mochila = new Mochila();
        deportivo = new Deportivo();
        cuaderno = new Cuaderno();
    }

    @Override
    public void crear() {
        mochila.showInfo();
        deportivo.showInfo();
        cuaderno.showInfo();
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public Cuaderno getCuaderno() {
        return cuaderno;
    }

    public void setCuaderno(Cuaderno cuaderno) {
        this.cuaderno = cuaderno;
    }
}
