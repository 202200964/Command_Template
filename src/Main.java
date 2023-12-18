public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        TurnOnCommand turnOn = new TurnOnCommand(light);
        TurnOffCommand turnOff = new TurnOffCommand(light);

        Remote remote = new Remote();

        remote.setCommand(turnOn);
        remote.pressButton();

        remote.setCommand(turnOff);
        remote.pressButton();
    }
}