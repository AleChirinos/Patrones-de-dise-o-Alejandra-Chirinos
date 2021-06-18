package Visitor.Ejercicio16;

public interface IEditorDeTexto {
    void crear(String text, String name);
    void editar(String newtext);
    void eliminar();

    Document getDocumento();
    void addPlugin(IVisitor visitor);
}
