package AbstractFactory.Tarea6;

public class FactoryHelado {
    public enum typeHelado {
        HELADO_AGUA, HELADO_CREMA, HELADO_MIXTO
    }

    public static IHelado make(FactoryHelado.typeHelado type) {
        IHelado helado;
        switch (type) {
            case HELADO_AGUA:
                helado = new HeladoAgua();
                ((HeladoAgua) helado).setTamano("grande");
                ((HeladoAgua) helado).setForma("Copos de helado");
                ((HeladoAgua) helado).setBase(new Base("Opcion1", "grande", "cono", "15 bs"));
                ((HeladoAgua) helado).setFruta(new Fruta("Agria","Maracuya","10 bs", "grande"));
                break;
            case HELADO_CREMA:
                helado = new HeladoCrema();
                ((HeladoCrema) helado).setCrema(new Crema("Crema con oreo","15 bs","Gigivonta"));

                break;
            case HELADO_MIXTO:
                helado = new HeladoMixto();
                break;
            default:
                helado = new HeladoMixto();
                break;
        }
        return helado;
    }
}
