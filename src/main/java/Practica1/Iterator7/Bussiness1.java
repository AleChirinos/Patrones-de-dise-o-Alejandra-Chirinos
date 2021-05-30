package Practica1.Iterator7;

import java.util.ArrayList;

public class Bussiness1 implements IList{

    private ArrayList<String> employers;
    private int position;

    public Bussiness1(){
        position=0;
        employers= new ArrayList<>();
    }

    public void add(String value){
        employers.add(value);
        position++;
    }

    @Override
    public IteratorBussiness1 iterator() {
        return new IteratorBussiness1(this.employers);
    }
}
