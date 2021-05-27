package Practica1.Interator7;

import java.util.ArrayList;
import java.util.Stack;

public class IteratorBussiness4 implements Iterator{

    private int position;
    private Stack<String> employers;

    public IteratorBussiness4(Stack<String> nombres){
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
