package Builder.Tarea7;

public class PizzaCarnivora extends BuilderPizza{
    @Override
    public void buildIngredientes() {
        pizza.setIngredientes("Carne, tocino, salchicha jamon y salsa de tomate");
    }

    @Override
    public void buildTipoDeMasa() {
        pizza.setTipoMasa("Ancha y bordes rellenos de queso con carne");
    }

    @Override
    public void buildTipoDeQueso() {
        pizza.setTipoQueso("Queso cabra y mozzarella");
    }
}
