package AbstractFactory.Tarea6;

public class Cliente {
    public static void main (String []args){
        System.out.println("Helados de agua");
        System.out.println("Helado 1");
        HeladoAgua h1= (HeladoAgua) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_AGUA);
        h1.setFruta(new Fruta("Agria","Maracuya","10 bs", "grande"));
        h1.crear();
        System.out.println("");

        System.out.println("Helado 2");
        HeladoAgua h2= (HeladoAgua) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_AGUA);
        h2.setFruta(new Fruta("Dulce","Platano","12 bs", "mediano"));
        h2.crear();
        System.out.println("");

        System.out.println("Helado 3");
        HeladoAgua h3= (HeladoAgua) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_AGUA);
        h3.setFruta(new Fruta("Dulce","Mango","20 bs", "extra grande"));
        h3.crear();
        System.out.println("");
        System.out.println("********************");

        System.out.println("Helados de crema");
        System.out.println("Helado 4");
        HeladoCrema h4= (HeladoCrema) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_CREMA);
        h4.setCrema(new Crema("Cream and cookies","17 bs","Delicia"));
        h4.crear();
        System.out.println("");

        System.out.println("Helado 5");
        HeladoCrema h5= (HeladoCrema) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_CREMA);
        h5.setCrema(new Crema("Crema de limon","11 bs","Vaca Fria"));
        h5.crear();
        System.out.println("");

        System.out.println("Helado 6");
        HeladoCrema h6= (HeladoCrema) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_CREMA);
        h6.setCrema(new Crema("Crema de vainilla","17 bs","Vainilla"));
        h6.crear();
        System.out.println("");
        System.out.println("********************");

        System.out.println("Helados mixtos");
        System.out.println("Helado 7");
        HeladoMixto h7= (HeladoMixto) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_MIXTO);
        h7.setFruta(new Fruta("Agria","Frutilla","13 bs", "pequeño"));
        h7.setCrema(new Crema("Crema de frutilla","11 bs","Gigivonta"));
        h7.crear();
        System.out.println("");

        System.out.println("Helado 8");
        HeladoMixto h8= (HeladoMixto) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_MIXTO);
        h8.setFruta(new Fruta("Dulce","Coco","19 bs", "grande"));
        h8.setCrema(new Crema("Crema de leche","10 bs","Pil"));
        h8.crear();
        System.out.println("");

        System.out.println("Helado 9");
        HeladoMixto h9= (HeladoMixto) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_MIXTO);
        h9.setFruta(new Fruta("Dulce","Acai","23 bs", "grande"));
        h9.setCrema(new Crema("Crema de leche","10 bs","Pil"));
        h9.crear();
        System.out.println("");
        System.out.println("********************");
    }
}
