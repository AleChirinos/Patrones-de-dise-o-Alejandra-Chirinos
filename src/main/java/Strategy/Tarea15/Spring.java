package Strategy.Tarea15;

public class Spring implements IStrategySales{

    @Override
    public void execute(ClothesContext clothesContext) {
        System.out.println("La ropa de primavera mantiene su precio de: "+clothesContext.getPrice());
        clothesContext.showInfo();
        System.out.println();
    }
}
