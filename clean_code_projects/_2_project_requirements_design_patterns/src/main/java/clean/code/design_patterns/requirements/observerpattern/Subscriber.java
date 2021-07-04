package clean.code.design_patterns.requirements.observerpattern;

public class Subscriber implements Observer {
    @Override
    public void update(String message) {
        getMessage(message);
    }
    private void getMessage(String message){
        System.out.println("Subscriber made a note of the announcement.");
    }
}
