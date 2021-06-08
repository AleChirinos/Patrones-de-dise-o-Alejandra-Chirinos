package Command.Tarea13;

public class ModoDefensa implements ICommandPlay{
    private Game game;

    public ModoDefensa(Game game){
        this.game=game;
    }
    @Override
    public void execute() {
        System.out.println("Defendiendo...");
        this.game.mododDefensa();
    }
}