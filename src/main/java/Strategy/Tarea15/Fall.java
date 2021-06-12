package Strategy.Tarea15;

public class Fall implements IStrategySales{
    private int newPrice;

    @Override
    public void execute(ClothesContext clothesContext) {
        newPrice=clothesContext.getPrice()-(50* clothesContext.getPrice()/100);
        System.out.println("La ropa de otoño tiene un nuevo precio de: "+newPrice);
        clothesContext.showInfo();
        System.out.println();
    }
}
