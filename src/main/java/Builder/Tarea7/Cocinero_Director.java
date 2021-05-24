package Builder.Tarea7;

public class Cocinero_Director {
    private BuilderPizza builderPizza;

    public void setBuilderPizza(BuilderPizza builderPizza) {
        this.builderPizza = builderPizza;
    }

    public Pizza getPizza(){
        return  builderPizza.getPizza();
    }

    public void armarPizza(){
        this.builderPizza.createPizza();
        this.builderPizza.buildIngredientes();
        this.builderPizza.buildTipoDeMasa();
        this.builderPizza.buildTipoDeQueso();
    }
}
