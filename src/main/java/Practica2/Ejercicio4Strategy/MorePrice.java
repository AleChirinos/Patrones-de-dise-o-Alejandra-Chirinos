package Practica2.Ejercicio4Strategy;

import java.util.List;

public class MorePrice implements IStrategyPrice{
    @Override
    public void searchPrice(List<Cellphone> list, int price) {
        System.out.println("Buscando entre muchos según el precio: "+price);
        for (Cellphone cellphone : list) {
            if (cellphone.getPrice() == price) {
                cellphone.showInfo();
            }
        }
    }
}
