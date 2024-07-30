public class LighOffCommand implements Command{
    Light light;

    LighOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOff();
    }
}
