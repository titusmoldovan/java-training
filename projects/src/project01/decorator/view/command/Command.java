package project01.decorator.view.command;

import project01.decorator.Order;

public abstract class Command {
    private final String key, description;
    protected final Order order;

    public Command(String k, String d, Order o) {
        key = k;
        description = d;
        order = o;
    }

    public abstract void execute();

    public String getKey() {
        return key;
    }

    public String getDescription() {
        return description;
    }
}
