package Strategy.Tarea15;

public class Winter implements IStrategySales{
    private int newPrice;

    @Override
    public void execute(ClothesContext clothesContext) {
        newPrice=clothesContext.getPrice()+(10* clothesContext.getPrice()/100);
        System.out.println("La ropa de invierno tiene un nuevo precio de: "+newPrice);
        clothesContext.showInfo();
        System.out.println();
    }
}
