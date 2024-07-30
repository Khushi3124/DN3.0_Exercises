public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        LighOnCommand lighOnCommand = new LighOnCommand(light);
        RemoteControl remoteControl = new RemoteControl(lighOnCommand);
        remoteControl.pressSwitch();
        

        LighOffCommand lighOffCommand = new LighOffCommand(light);
        remoteControl.setCommand(lighOffCommand);
        remoteControl.pressSwitch();
    }
}
