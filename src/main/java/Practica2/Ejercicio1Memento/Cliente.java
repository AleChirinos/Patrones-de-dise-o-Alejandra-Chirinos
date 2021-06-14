package Practica2.Ejercicio1Memento;

public class Cliente {
    public static void main (String []argsss ){
        TutorCareTaker tutor= new TutorCareTaker();
        VersionamientoOriginator versionamiento= new VersionamientoOriginator();

        TesisObject tesis;

        tesis = new TesisObject("Sistema de deteccion de estres, ansiedad y depresion",
                "Sistemas de detección con redes neuronales", "Version1",102,0);
        versionamiento.setState(tesis);
        tutor.createVersion("Version1",versionamiento.createVersion());

        tesis = new TesisObject("Sistema de deteccion de estres, ansiedad y depresion",
                "Sistemas de detección con redes neuronales", "Version2",107,3);
        versionamiento.setState(tesis);
        tutor.createVersion("Version2",versionamiento.createVersion());

        tesis = new TesisObject("Sistema de deteccion de estres, ansiedad y depresion",
                "Sistemas de detección con redes neuronales", "Version3",117,7);
        versionamiento.setState(tesis);
        tutor.createVersion("Version3",versionamiento.createVersion());

        tesis = new TesisObject("Sistema de deteccion de estres, ansiedad y depresion",
                "Sistemas de detección con redes neuronales e inteligencia artificial", "Version4",
                150,11);
        versionamiento.setState(tesis);
        tutor.createVersion("Version4",versionamiento.createVersion());

        tesis = new TesisObject("Sistema de deteccion de estres, ansiedad y depresion",
                "Sistemas de detección con redes neuronales e inteligencia artificial", "Version2",
                177,17);
        versionamiento.setState(tesis);
        tutor.createVersion("Version5",versionamiento.createVersion());

        versionamiento.restoreFromMemento(tutor.getMemento("Version3"));
    }
}
