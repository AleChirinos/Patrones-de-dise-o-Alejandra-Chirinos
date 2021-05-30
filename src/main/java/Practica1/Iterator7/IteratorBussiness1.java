package Practica1.Iterator7;

import java.util.ArrayList;

public class IteratorBussiness1 implements Iterator{

    private int position;
    private ArrayList<String> employers;

    public IteratorBussiness1(ArrayList<String> nombres){
        this.employers=nombres;
    }
    @Override
    public Object next() {
        return employers.get(position++);
    }

    @Override
    public boolean hasNext() {
        return employers.size() != 0 && position<employers.size();
    }
}
