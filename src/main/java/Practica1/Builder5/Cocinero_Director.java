package Practica1.Builder5;

import Builder.Tarea7.BuilderPizza;
import Builder.Tarea7.Pizza;

public class Cocinero_Director {
    private BuilderParrillada builderParrillada;

    public void setBuilderParrillada(BuilderParrillada builderParrillada) {
        this.builderParrillada = builderParrillada;
    }

    public Parrillada getParrillada(){
        return  builderParrillada.getParrillada();
    }

    public void armarParrillada(){
        this.builderParrillada.createParrillada();
        this.builderParrillada.buildTipoDeCarne();
        this.builderParrillada.buildSaborSoda();
        this.builderParrillada.buildGuarniciones();
    }
}
