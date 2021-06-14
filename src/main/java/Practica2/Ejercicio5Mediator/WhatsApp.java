package Practica2.Ejercicio5Mediator;

import java.util.LinkedList;
import java.util.List;

public class WhatsApp implements ICanalDeComunicacion{

    private List<UserGroup> groups = new LinkedList<UserGroup>();

    public void addGrupo(UserGroup group) {
        groups.add(group);
    }

    @Override
    public void sendUser(String message, User user) {
        user.messageReceived(message);
    }

    @Override
    public void sendGroup(String message, String nameGroup, User userSender) {
        UserGroup actualGroup = new UserGroup("");
        for (UserGroup userGroup : groups) {
            if(userGroup.getNombre().equals(nameGroup)) {
                actualGroup=userGroup;
                break;
            }
        }
        for (User users : actualGroup.getGrupo()) {
            if(!users.equals(userSender)) {
                users.messageReceived(message);
            }
        }
    }
}
