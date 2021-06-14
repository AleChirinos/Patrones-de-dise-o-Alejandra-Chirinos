package Practica2.Ejercicio4Strategy;

import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(3);

        List<Cellphone> list = new LinkedList<Cellphone>();

        list.add(new Cellphone("Samsung","A10","Media",300));
        list.add(new Cellphone("Xperia","Huawei","Baja",150));
        list.add(new Cellphone("Apple","Iphone 12","Alta",700));

        store.setList(list);

        store.buscarSegunModelo("A10");
        store.buscarSegunPrecio(150);
    }
}
