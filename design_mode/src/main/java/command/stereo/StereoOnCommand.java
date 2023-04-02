package command.stereo;


import command.command.Command;
import command.light.Light;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/31 16:50
 */
public class StereoOnCommand implements Command {

    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(5);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
