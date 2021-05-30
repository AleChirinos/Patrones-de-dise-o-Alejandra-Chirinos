package Practica1.Builder5;

public class Lomito extends BuilderParrillada {
    @Override
    public void buildTipoDeCarne() {
        parrillada.setTipoDeCarne("CLomito");
    }

    @Override
    public void buildSaborSoda() {
        parrillada.setSaborDeRefresco("Pepsi");
    }

    @Override
    public void buildGuarniciones() {
        parrillada.setGuarniciones("Arroz");
    }
}
