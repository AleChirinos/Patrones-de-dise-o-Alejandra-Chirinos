package Visitor.Ejercicio16;

public class Word implements IEditorDeTexto{
    private Document document;

    @Override
    public void crear(String text, String name) {
        document=new Document(text,name);
    }

    @Override
    public void editar(String newtext) {
        this.document.setText(newtext);
    }

    @Override
    public void eliminar() {
        document=null;
    }

    @Override
    public Document getDocumento() {
        return document;
    }

    @Override
    public void addPlugin(IVisitor visitor) {
        visitor.save(this);
    }
}
