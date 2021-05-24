package Builder.Tarea7;

public class PizzaHawaiana extends BuilderPizza{
    @Override
    public void buildIngredientes() {
        pizza.setIngredientes("Jamon, piña, cereza y salsa de tomate");
    }

    @Override
    public void buildTipoDeMasa() {
        pizza.setTipoMasa("Delgada");
    }

    @Override
    public void buildTipoDeQueso() {
        pizza.setTipoQueso("Mozzarella y azul");
    }
}
