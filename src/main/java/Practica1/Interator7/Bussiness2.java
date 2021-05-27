package Practica1.Interator7;

public class Bussiness2 implements IList{

    private String [] nombres;
    private int position;

    public Bussiness2(){
        position=0;
        nombres= new String[5];
    }
    public void add(String value){
        nombres[position]=value;
        position++;
    }

    @Override
    public IteratorBussiness2 iterator() {
        return new IteratorBussiness2(this.nombres);
    }
}
