package Practica1.FactoryMethod3;

public class Cliente {
    public  static void main (String[]args) {
        CreatorKitEscolar crearKitEscolar = new CreatorKitEscolar();
        CreatorKitColegial crearKitColegial = new CreatorKitColegial();

        KitColegial kit1 = (KitColegial) crearKitColegial.createProduct();

        KitEscolar kit2 = (KitEscolar) crearKitEscolar.createProduct();

        System.out.println("Kit Colegial: ");
        kit1.crear();
        System.out.println("");
        System.out.println("Kit Escolar: ");
        kit2.crear();
        System.out.println("");

    }
}
