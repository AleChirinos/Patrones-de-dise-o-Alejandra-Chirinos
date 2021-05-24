package Builder.Tarea7;

public class PizzaClasica extends BuilderPizza{
    @Override
    public void buildIngredientes() {
        pizza.setIngredientes("Jamon y salsa de tomate");
    }

    @Override
    public void buildTipoDeMasa() {
        pizza.setTipoMasa("Media");
    }

    @Override
    public void buildTipoDeQueso() {
        pizza.setTipoQueso("Chedra, mozzarella y parmesano");
    }
}
