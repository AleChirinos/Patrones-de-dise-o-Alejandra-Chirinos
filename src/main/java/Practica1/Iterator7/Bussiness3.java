package Practica1.Iterator7;

import java.util.Vector;

public class Bussiness3 implements IList{

    private Vector<String> nombres;

    public Bussiness3(){
        nombres= new Vector<>();
    }
    public void add(String value){
        nombres.add(value);
    }

    @Override
    public IteratorBussiness3 iterator() {
        return new IteratorBussiness3(this.nombres);
    }
}
