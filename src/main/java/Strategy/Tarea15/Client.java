package Strategy.Tarea15;

import java.util.ArrayList;

public class Client {
    public static void main (String []args){
        ClothesContext clothesContext= new ClothesContext();
        clothesContext.setColor("morado");
        clothesContext.setPrice(50);
        clothesContext.setSeason("invierno");
        clothesContext.setType("chompa");

        System.out.println("*******INVIERNO*******");
        clothesContext.setStrategySales(new Winter());
        clothesContext.execute();

        System.out.println("*******VERANO*******");
        clothesContext.setStrategySales(new Summer());
        clothesContext.execute();

        System.out.println("*******PRIMAVERA*******");
        clothesContext.setStrategySales(new Spring());
        clothesContext.execute();

        System.out.println("*******OTOÑO*******");
        clothesContext.setStrategySales(new Fall());
        clothesContext.execute();
    }
}
