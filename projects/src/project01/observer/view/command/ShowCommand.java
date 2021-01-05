package project01.observer.view.command;

import project01.observer.View;

public class ShowCommand extends Command {
    private final View view;

    public ShowCommand(String key, String description, View view) {
        super(key, description);
        this.view = view;
    }

    @Override
    public void execute() {
        view.show();
    }
}
