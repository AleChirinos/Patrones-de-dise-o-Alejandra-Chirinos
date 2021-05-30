package Practica1.FactoryMethod3;

public class CreatorKitColegial extends CreatorKit{
    @Override
    public IKit createProduct() {
        Mochila mochilaColegial = new Mochila();
        mochilaColegial.setNumeroDeBolsillos("3");
        mochilaColegial.setTamaño("Pequeño");

        Libro libro = new Libro();
        libro.setTipo("Romantica");
        libro.setAutor("Gabriel Garcia Marquez");

        Computadora computadora = new Computadora();
        computadora.setMarca("HP");
        computadora.setSistemaOperativo("Windows");

        KitColegial kitColegial = new KitColegial();
        kitColegial.setMochila(mochilaColegial);
        kitColegial.setLibro(libro);
        kitColegial.setComputadora(computadora);

        return kitColegial;
    }
}
