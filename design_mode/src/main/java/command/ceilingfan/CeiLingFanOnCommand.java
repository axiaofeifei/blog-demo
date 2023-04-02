package command.ceilingfan;

import command.command.Command;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/3 10:49
 */
public class CeiLingFanOnCommand implements Command {
    CeiLingFan ceiLingFan;

    public CeiLingFanOnCommand(CeiLingFan ceiLingFan) {
        this.ceiLingFan = ceiLingFan;
    }

    @Override
    public void execute() {
        ceiLingFan.on();
    }

    @Override
    public void undo() {

    }
}
