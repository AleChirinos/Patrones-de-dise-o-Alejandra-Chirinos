package Practica1.FactoryMethod3;

public class KitColegial implements IKit{

    private Mochila mochila;
    private Libro libro;
    private Computadora computadora;

    public KitColegial(){
        mochila = new Mochila();
        libro = new Libro();
        computadora = new Computadora();
    }

    @Override
    public void crear() {
        mochila.showInfo();
        libro.showInfo();
        computadora.showInfo();
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
}
