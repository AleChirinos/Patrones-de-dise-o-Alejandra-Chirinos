package Strategy.Tarea15;

import java.util.ArrayList;

public class Client {
    public static void main (String []args){
        ClothesContext clothesContext= new ClothesContext();
        clothesContext.setColor("morado");
        clothesContext.setPrice(50);
        clothesContext.setSeason("invierno");
        clothesContext.setType("chompa");

        clothesContext.setStrategySales(new Winter());
        clothesContext.execute();

        clothesContext.setStrategySales(new Summer());
        clothesContext.execute();

        clothesContext.setStrategySales(new Spring());
        clothesContext.execute();

        clothesContext.setStrategySales(new Fall());
        clothesContext.execute();
    }
}
