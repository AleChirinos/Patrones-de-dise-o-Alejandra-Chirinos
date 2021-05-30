package Practica1.FactoryMethod3;

public class CreatorKitEscolar extends CreatorKit{
    @Override
    public IKit createProduct() {
        Mochila mochilaEscolar = new Mochila();
        mochilaEscolar.setNumeroDeBolsillos("3");
        mochilaEscolar.setTamaño("Pequeño");

        Deportivo deportivo = new Deportivo();
        deportivo.setNumeroDePrendas("4");
        deportivo.setTalla("S");
        deportivo.setColor("Azul con blanco");

        Cuaderno cuaderno = new Cuaderno();
        cuaderno.setTipo("Empastado");
        cuaderno.setNumeroDeHojas("50");

        KitEscolar kitEscolar = new KitEscolar();
        kitEscolar.setMochila(mochilaEscolar);
        kitEscolar.setDeportivo(deportivo);
        kitEscolar.setCuaderno(cuaderno);

        return kitEscolar;
    }
}
