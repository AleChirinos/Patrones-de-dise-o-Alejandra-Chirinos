package Mediator.Tarea10;


import java.util.*;

public class Skype implements ICanalDeComunicacion {

    private Map<Integer,Colleague> colleagueMap = new HashMap<>();
    private List<Integer> ci= new ArrayList<>();

    public void addColleague(Colleague colleague){
        colleagueMap.put(colleague.ci, colleague);
        ci.add(colleague.ci);
    }

    @Override
    public void send(String message, Colleague colleague) {
        Colleague personaParseOrigen= colleague;
        for (int colleagueFrom:ci) {
            if (colleagueFrom != personaParseOrigen.ci){
                 if (personaParseOrigen instanceof QA && colleagueMap.get(colleagueFrom) instanceof QA){
                     colleagueMap.get(colleagueFrom).messageReceived(message);
                 }
                 else if (personaParseOrigen instanceof DEV && colleagueMap.get(colleagueFrom) instanceof DEV){
                     colleagueMap.get(colleagueFrom).messageReceived(message);
                 }
                 else if (personaParseOrigen instanceof SM){
                    colleagueMap.get(colleagueFrom).messageReceived(message);
                }
            }
        }
    }
}
