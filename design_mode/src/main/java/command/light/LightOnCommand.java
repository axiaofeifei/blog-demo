package command.light;


import command.command.Command;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/31 16:50
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
