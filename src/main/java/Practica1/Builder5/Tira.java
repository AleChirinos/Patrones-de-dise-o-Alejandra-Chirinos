package Practica1.Builder5;

public class Tira extends BuilderParrillada {
    @Override
    public void buildTipoDeCarne() {
        parrillada.setTipoDeCarne("Tira");
    }

    @Override
    public void buildSaborSoda() {
        parrillada.setSaborDeRefresco("sprite");
    }

    @Override
    public void buildGuarniciones() {
        parrillada.setGuarniciones("Arroz con queso");
    }
}
