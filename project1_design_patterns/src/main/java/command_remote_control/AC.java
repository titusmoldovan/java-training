package command_remote_control;

public class AC {

    private int minTemperature;
    private int maxTemperature;
    private int currentTemperature;
    private boolean isOn;

    public AC() {
        minTemperature = 5;
        maxTemperature = 20;
        currentTemperature = minTemperature;
    }

    public void turnOnTheAC() {
        isOn = true;
    }

    public void turnOffTheAC() {
        isOn = false;
    }

    public void increaseTemperature() {
        if (currentTemperature < maxTemperature)
            currentTemperature++;
    }

    public void decreaseTemperature() {
        if (currentTemperature > minTemperature)
            currentTemperature--;
    }
}
