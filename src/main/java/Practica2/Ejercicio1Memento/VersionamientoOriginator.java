package Practica2.Ejercicio1Memento;

public class VersionamientoOriginator {
    private TesisObject state;

    public VersionamientoOriginator(){}

    public void setState(TesisObject state) {
        System.out.println("*** Set State ***");
        state.showInfo();
        System.out.println();
        this.state = state;
    }

    public Memento createVersion(){
        System.out.println("*** Create State ***");
        state.showInfo();
        System.out.println();
        return new Memento(this.state) ;
    }

    public void restoreFromMemento(Memento memento){
        this.state=memento.getState();
        System.out.println("*** State Restored ***");
        this.state.showInfo();
        System.out.println();
    }

}
