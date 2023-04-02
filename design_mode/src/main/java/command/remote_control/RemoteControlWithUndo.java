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
    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    //public void getOnCommands(){
    //    System.out.println(onCommands.length);
    //}

    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;

    }



    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        //保存本次的执行命令类型

        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        //保存本次的执行命令类型
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n-----------Remote Control ----------");

        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot "+ i + "]"+ onCommands[i].getClass().getName()+
                    " "+ offCommands[i].getClass().getName());

        }
        return stringBuffer.toString();
    }
}
