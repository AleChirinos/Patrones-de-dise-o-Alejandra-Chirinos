package Practica2.Ejercicio4Strategy;

import java.util.List;

public class LessPrice implements IStrategyPrice{
    @Override
    public void searchPrice(List<Cellphone> list, int price) {
        System.out.println("Buscando entre pocos según el precio: "+price);
        for (Cellphone cellphone : list) {
            if (cellphone.getPrice() == price) {
                cellphone.showInfo();
            }
        }
    }
}
