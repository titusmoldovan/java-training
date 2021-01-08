package command_remote_control;

public class IncreaseACTempCommand implements Command {

    AC ac;

    @Override
    public void execute() {
        ac.increaseTemperature();
    }
}
