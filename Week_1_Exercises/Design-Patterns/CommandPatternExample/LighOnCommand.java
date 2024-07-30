public class LighOnCommand implements Command{
    Light light;

    LighOnCommand(Light light){
      this.light = light;
    }

    @Override
    public void execute() {
        light.switchOn();
    }
}
