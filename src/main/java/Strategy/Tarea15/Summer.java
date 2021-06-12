package Strategy.Tarea15;

public class Summer implements IStrategySales{
    private int newPrice;

    @Override
    public void execute(ClothesContext clothesContext) {
        newPrice=clothesContext.getPrice()-(10* clothesContext.getPrice()/100);
        System.out.println("La ropa de verano tiene un nuevo precio de: "+newPrice);
        clothesContext.showInfo();
        System.out.println();
    }
}
