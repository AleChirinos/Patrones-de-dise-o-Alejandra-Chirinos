package Practica2.Ejercicio4Strategy;

import java.util.LinkedList;
import java.util.List;

public class Store {
    private IStrategyModel strategyModel;
    private IStrategyPrice strategyPrice;
    private int value;
    private List<Cellphone> list = new LinkedList<Cellphone>();


    public Store(int value) {
        this.value = value;
    }

    public void add(Cellphone cellphone) {
        list.add(cellphone);
    }

    public IStrategyModel getStrategyModel() {
        return strategyModel;
    }

    public void setStrategyModel(IStrategyModel strategyModel) {
        this.strategyModel = strategyModel;
    }

    public IStrategyPrice getStrategyPrice() {
        return strategyPrice;
    }

    public void setStrategyPrice(IStrategyPrice strategyPrice) {
        this.strategyPrice = strategyPrice;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Cellphone> getList(){
        return list;
    }

    public void setList(List<Cellphone> list) {
        this.list = list;
    }

    public void buscarSegunPrecio(int price) {
        if(list.size()>value) {
            strategyPrice = new MorePrice();
        }else {
            strategyPrice = new LessPrice();
        }
        strategyPrice.searchPrice(list, price);
    }

    public void buscarSegunModelo(String model) {
        if(list.size()>value) {
            strategyModel = new MoreModel();
        }else {
            strategyModel = new LessModel();
        }
        strategyModel.searchModel(list, model);
    }
}
