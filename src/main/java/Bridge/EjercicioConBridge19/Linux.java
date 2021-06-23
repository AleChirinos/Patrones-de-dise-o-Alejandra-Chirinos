package Bridge.EjercicioConBridge19;

public class Linux implements IPlataforma{
    IArquitectura arquitectura;
    public Linux(IArquitectura arquitectura){
        this.arquitectura=arquitectura;
    }
    @Override
    public void color() {
        System.out.println("blanco");
    }

    @Override
    public void arquitectura() {
        System.out.println("Obteniendo tipo de arquitectura de Linux...");
        arquitectura.tipoArquitectura();
    }
}
