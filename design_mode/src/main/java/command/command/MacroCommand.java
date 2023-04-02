package command.command;

import command.ceilingfan.CeiLingFan;
import command.ceilingfan.CeiLingFanMediumCommand;
import command.light.Light;
import command.stereo.Stereo;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/5 14:29
 */
//宏操作，一下子操作好多命令
public class MacroCommand implements Command{
   Command[] commands;


    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();

        }

    }

    @Override
    public void undo() {

    }
}
