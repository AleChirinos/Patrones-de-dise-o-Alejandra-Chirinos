package Builder.Tarea7;

public class Cliente {
    public static void main(String[]args){
        Cocinero_Director chef= new Cocinero_Director();
        PizzaCarnivora pizzaCarnivora = new PizzaCarnivora();
        PizzaHawaiana pizzaHawaiana = new PizzaHawaiana();
        PizzaClasica pizzaClasica = new PizzaClasica();

        chef.setBuilderPizza(pizzaCarnivora);
        chef.armarPizza();

        Pizza pizzaCarnivora1 = chef.getPizza();
        pizzaCarnivora1.showData();
        System.out.println("");

        chef.setBuilderPizza(pizzaHawaiana);
        chef.armarPizza();

        Pizza pizzaHawaina2 = chef.getPizza();
        pizzaHawaina2.showData();
        System.out.println("");

        chef.setBuilderPizza(pizzaClasica);
        chef.armarPizza();

        Pizza pizzaClasica3 = chef.getPizza();
        pizzaClasica3.showData();
        System.out.println("");
    }
}
