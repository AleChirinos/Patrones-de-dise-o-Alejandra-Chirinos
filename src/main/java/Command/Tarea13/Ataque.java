package Command.Tarea13;

public class Ataque implements ICommandPlay{
    private Game game;

    public Ataque(Game game){
        this.game=game;
    }
    @Override
    public void execute() {
        System.out.println("Atacando...");
        this.game.atacar();
    }
}
