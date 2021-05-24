package Builder.Tarea7;

public abstract class BuilderPizza {
    protected Pizza pizza;

    public Pizza getPizza(){
        return pizza;
    }

    public void createPizza(){
        pizza = new Pizza();
    }

    public abstract void buildIngredientes();
    public abstract void buildTipoDeMasa();
    public abstract void buildTipoDeQueso();

}
