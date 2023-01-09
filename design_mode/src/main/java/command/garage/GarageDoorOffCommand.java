package command.garage;

import command.command.Command;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/2 10:14
 */
public class GarageDoorOffCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOffCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.off();
    }

    @Override
    public void undo() {
        garageDoor.on();
    }
}
