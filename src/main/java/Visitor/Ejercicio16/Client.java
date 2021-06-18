package Visitor.Ejercicio16;

public class Client {
    public static void main(String[] args){
        Notepad notepad = new Notepad();
        Word word = new Word();
        Sublime sublime = new Sublime();

        word.crear("Texto 1 este es un word","Ejemplo 1");
        notepad.crear("Texto 2 este es un nnotepad","Ejemplo 2");
        sublime.crear("Texto 3 este es un sublime","Ejemplo 3");

        ConcreteVisitor concreteVisitor= new ConcreteVisitor();
        word.addPlugin(concreteVisitor);
        notepad.addPlugin(concreteVisitor);
        sublime.addPlugin(concreteVisitor);


    }
}
