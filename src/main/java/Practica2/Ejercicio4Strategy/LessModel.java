package Practica2.Ejercicio4Strategy;

import java.util.List;

public class LessModel implements IStrategyModel{
    @Override
    public void searchModel(List<Cellphone> list, String model) {
        System.out.println("Buscando entre pocos según el modelo: "+model);
        for (Cellphone cellphone : list) {
            if (cellphone.getModel().equals(model)) {
                cellphone.showInfo();
            }
        }
    }
}