package command.remote_control;

import command.command.Command;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/2 9:03
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
