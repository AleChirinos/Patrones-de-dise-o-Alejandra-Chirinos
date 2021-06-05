package Memento.Tarea11;

public class Originator {
    private Person state;

    public Originator(){}

    public void setState(Person state) {
        System.out.println("**** Set State *****");
        state.info();
        this.state = state;
    }

    public Memento createPerson(){
        System.out.println("**** Create State *****");
        state.info();
        return new Memento(this.state) ;
    }

    public void restoreFromMemento(Memento memento){
        this.state=memento.getState();
        System.out.println("**** State Restored *****");
        this.state.info();
    }

}
