package Practica1.Iterator7;

import java.util.Stack;

public class Bussiness4 implements IList{
    private Stack<String> employers;
    private int position;

    public Bussiness4(){
        position=0;
        employers= new Stack<>();
    }
    public void add(String value){
        employers.add(value);
        position++;
    }
    @Override
    public IteratorBussiness4 iterator() {
        return new IteratorBussiness4(this.employers);
    }
}
