package Visitor.Ejercicio16;

public class ConcreteVisitor implements IVisitor {
    @Override
    public void save(Notepad notepad) {
        notepad.getDocumento().setFormato("pdf");
        notepad.getDocumento().setNumChar(notepad.getDocumento().getText().length());

        System.out.println("Formato del documento: "+notepad.getDocumento().getFormato());
        System.out.println("Numero de caracteres:"+notepad.getDocumento().getNumChar());
        System.out.println();
    }

    @Override
    public void save(Sublime sublime) {
        sublime.getDocumento().setFormato("pdf");
        sublime.getDocumento().setNumChar(sublime.getDocumento().getText().length());

        System.out.println("Formato del documento: "+sublime.getDocumento().getFormato());
        System.out.println("Numero de caracteres:"+sublime.getDocumento().getNumChar());
        System.out.println();
    }

    @Override
    public void save(Word word) {
        word.getDocumento().setFormato("pdf");
        word.getDocumento().setNumChar(word.getDocumento().getText().length());

        System.out.println("Formato del documento: "+word.getDocumento().getFormato());
        System.out.println("Numero de caracteres:"+word.getDocumento().getNumChar());
        System.out.println();
    }
}
