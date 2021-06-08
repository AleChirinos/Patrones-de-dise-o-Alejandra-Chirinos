package Command.Tarea13;

public class Game {
    private String name;
    private int lives;
    private int numberGame;
    private boolean escudo;
    private boolean balas;
    private String ataque;

    public Game(String name, int lives, int numberGame, boolean escudo, boolean balas, String ataque){
        this.name=name;
        this.lives= lives;
        this.numberGame= numberGame;
        this.escudo=escudo;
        this.balas=balas;
        this.ataque=ataque;
    }
    public void showInfo(){
        System.out.println("Nombre del juego: "+name);
        System.out.println("Numero de vidas: "+lives);
        System.out.println("Numero de partidas: "+numberGame);
        System.out.println();
    }

    public void disparar(){
        if(balas){
            System.out.println("Disparar");
            this.showInfo();
        }else{
            System.out.println("Oh no te quedaste sin balas");
            System.out.println("Solo puedes disparar con bolitas de papel");
            System.out.println();
        }
    }

    public void mododDefensa(){
        if(escudo){
            System.out.println("Modo defensa: ACTIVADO");
            this.showInfo();
        }else{
            System.out.println("No tienes un escudo");
            System.out.println("Solo puedes protegerte con tus brazos");
            System.out.println();
        }
    }

    public void atacar(){
        System.out.println("Modo: ATAQUE");
        System.out.println("Tu arma de ataque es: "+ ataque);
        this.showInfo();
    }
}
