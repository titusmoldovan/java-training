package command_remote_control;

public class AcOnCommand implements Command {

    AC ac;

    public AcOnCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOnTheAC();

    }
}
