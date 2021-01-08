package command_remote_control;

public class ACOffCommand implements Command {

    AC ac;

    public ACOffCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOffTheAC();
    }
}
