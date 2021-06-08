package Command.Tarea13;

public class Disparar implements ICommandPlay{
    private Game game;

    public Disparar(Game game){
        this.game=game;
    }
    @Override
    public void execute() {
        System.out.println("Disparando...");
        this.game.disparar();
    }
}