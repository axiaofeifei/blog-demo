package command.garage;

import command.command.Command;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/2 9:24
 */
public class GarageDoorOnCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.on();
    }

    @Override
    public void undo() {
        garageDoor.off();
    }
}
