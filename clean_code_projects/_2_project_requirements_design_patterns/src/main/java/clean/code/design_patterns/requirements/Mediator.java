package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private final List<User> entities = new ArrayList<>();
    public void sendMessage(String message){
        for (User c: entities){
            c.receiveMessage(message);
        }
    }
    public void addEntity(User character){
        this.entities.add(character);
    }
}
