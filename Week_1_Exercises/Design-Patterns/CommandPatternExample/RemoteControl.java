public class RemoteControl {
    Command command;

    public RemoteControl(Command command){
        this.command = command;
    }

    void setCommand(Command command){
        this.command = command;
    }

    void pressSwitch(){
        command.execute();
    }
}
