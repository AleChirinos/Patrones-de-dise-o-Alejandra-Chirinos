package Practica1.Iterator7;

import java.util.Vector;

public class IteratorBussiness3 implements Iterator{

    private int position;
    private Vector<String> employers;

    public IteratorBussiness3(Vector<String> nombres){
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
