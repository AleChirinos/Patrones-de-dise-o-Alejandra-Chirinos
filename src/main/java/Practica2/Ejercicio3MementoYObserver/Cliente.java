package Practica2.Ejercicio3MementoYObserver;

public class Cliente {
    public static void main(String[] args) {
        CommitGit commit = new CommitGit();
        GitOriginator originator = new GitOriginator();

        //adicionar mínimamente 3 desarrolladores suscritos al repositorio
        Desarrollador desarrollador1 = new Desarrollador("Pedro");
        Desarrollador desarrollador2 = new Desarrollador("Juan");
        Desarrollador desarrollador3 = new Desarrollador("Diego");

        originator.attach(desarrollador1);
        originator.attach(desarrollador2);
        originator.attach(desarrollador3);

        //tener 5 commits en el repositorio y volver al primer commit (commit 1)
        Code code;

        code = new Code("code1", "java", 1);
        originator.setState(code);
        commit.addMemento(originator.createVersion());

        code = new Code("code2", "c++", 2);
        originator.setState(code);
        commit.addMemento(originator.createVersion());

        code = new Code("code3", "python", 3);
        originator.setState(code);
        commit.addMemento(originator.createVersion());

        code = new Code("code4", "bash", 4);
        originator.setState(code);
        commit.addMemento(originator.createVersion());

        code = new Code("code5", "scala", 5);
        originator.setState(code);
        commit.addMemento(originator.createVersion());

        originator.restoreFromMemento(commit.getVersion(0));

        // eliminar a los 3 desarrolladores y adicionar otros 3 nuevos desarrolladores
        originator.deattach(desarrollador1);
        originator.deattach(desarrollador2);
        originator.deattach(desarrollador3);

        Desarrollador d4 = new Desarrollador("Jose");
        Desarrollador d5 = new Desarrollador("Alfredo");
        Desarrollador d6 = new Desarrollador("Ramiro");

        originator.attach(d4);
        originator.attach(d5);
        originator.attach(d6);

        //volver al último commit (commit 5)
        originator.restoreFromMemento(commit.getVersion(4));
    }
}
