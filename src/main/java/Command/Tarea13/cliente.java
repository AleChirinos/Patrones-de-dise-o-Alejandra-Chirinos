package Command.Tarea13;

public class cliente {
    public static void main (String[]args){
        Game game = new Game("Mortal Kombat",3, 10, true, true, "Patada");

        Ataque ataque= new Ataque(game);
        Disparar disparar = new Disparar(game);
        ModoDefensa modoDefensa = new ModoDefensa(game);

        Invoker play= new Invoker();
        play.addCommand(ataque);
        play.addCommand(disparar);
        play.addCommand(modoDefensa);

        play.executeCommands();

    }
}
