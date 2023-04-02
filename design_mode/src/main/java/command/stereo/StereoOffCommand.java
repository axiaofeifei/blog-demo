package command.stereo;

import command.command.Command;
import command.light.Light;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/2 10:09
 */
public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }


    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
