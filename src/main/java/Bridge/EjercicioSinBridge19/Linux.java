package Bridge.EjercicioSinBridge19;

public class Linux implements IPlataforma{
    @Override
    public void arquitecturax86() {
        System.out.println("LINUX -> arquitecturax86 ");
    }

    @Override
    public void arquitecturax64() {
        System.out.println("LINUX -> arquitecturax64 ");
    }
}
