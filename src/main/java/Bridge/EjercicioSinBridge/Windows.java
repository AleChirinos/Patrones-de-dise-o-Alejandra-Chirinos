package Bridge.EjercicioSinBridge;

public class Windows implements IPlataforma{

    @Override
    public void arquitecturax86() {
        System.out.println("WINDOWS -> arquitecturax86 ");
    }

    @Override
    public void arquitecturax64() {
        System.out.println("WINDOWS -> arquitecturax64 ");
    }
}
