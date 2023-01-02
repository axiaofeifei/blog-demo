package command.command;

import command.tool.Light;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/2 10:09
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
