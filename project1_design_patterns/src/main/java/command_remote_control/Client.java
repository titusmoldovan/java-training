package command_remote_control;

public class Client {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        AC ac = new AC();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        //turn on the light
        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();

        //turn off the light
        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();

        Command acOn = new AcOnCommand(ac);
        Command acOff = new ACOffCommand(ac);

        //turn on the Ac
        remoteControl.setCommand(acOn);
        remoteControl.pressButton();

        //turn off the Ac
        remoteControl.setCommand(acOff);
        remoteControl.pressButton();

    }
}
