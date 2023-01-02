package command.remote_control;

import command.command.Command;
import command.command.NoCommand;

import java.util.ArrayList;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/2 13:12
 */
public class RemoteControlWithUndo {
    ArrayList onCommands;
    ArrayList offCommands;

    Command undoCommand;

    public void RemoteControlWithUndo() {
        onCommands = new ArrayList<Command>(5);
        offCommands = new ArrayList<Command>(5);

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < 5; i++) {
            onCommands.add(noCommand);
            offCommands.add(noCommand);
            undoCommand = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands.add(slot, onCommand);
        offCommands.add(slot, offCommand);
    }

    public void onButtonWasPushed(int slot) {
        Command command = (Command) onCommands.get(slot);
        command.execute();
        //保存本次的执行命令类型

        undoCommand = command;
    }

    public void offButtonWasPushed(int slot) {
        Command command = (Command) offCommands.get(slot);
        command.execute();
        //保存本次的执行命令类型
        undoCommand = command;
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n---------------remote   Control---------------\n");

        //for (int i = 0; i < onCommands.size(); i++) {
        //     stringBuffer.append(i+""+(Command)onCommands.get(i)+"")
        //}
        return "RemoteControl{" +
                "onCommands=" + onCommands +
                ", offCommands=" + offCommands +
                '}';
    }
}
