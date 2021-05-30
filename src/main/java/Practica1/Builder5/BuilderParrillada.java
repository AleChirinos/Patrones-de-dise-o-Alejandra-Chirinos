package Practica1.Builder5;

import Builder.Tarea7.Pizza;

public abstract class BuilderParrillada {
    protected Parrillada parrillada;

    public Parrillada getParrillada(){
        return parrillada;
    }

    public void createParrillada(){
        parrillada = new Parrillada();
    }

    public abstract void buildTipoDeCarne();
    public abstract void buildSaborSoda();
    public abstract void buildGuarniciones();

}
