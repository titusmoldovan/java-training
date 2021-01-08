package command_remote_control;

public class DecreaseACTempCommand implements Command {

    AC ac;

    @Override
    public void execute() {
        ac.decreaseTemperature();
    }
}
