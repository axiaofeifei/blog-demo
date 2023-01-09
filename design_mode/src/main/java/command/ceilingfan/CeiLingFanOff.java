package command.ceilingfan;

import command.command.Command;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/2 14:08
 */
public class CeiLingFanOff implements Command {
    CeiLingFan ceiLingFan;

    int prevSpeed;

    public CeiLingFanOff(CeiLingFan ceiLingFan) {
        this.ceiLingFan = ceiLingFan;
    }

    @Override
    public void execute() {
        ceiLingFan.setOff();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeiLingFan.HIGH) {
            ceiLingFan.setHigh();
        }else if (prevSpeed == CeiLingFan.MEDIUM){
            ceiLingFan.setMedium();
        }else if (prevSpeed == CeiLingFan.LOW){
            ceiLingFan.setLow();
        } else if (prevSpeed == CeiLingFan.OFF) {
            ceiLingFan.setOff();
        }

    }
}
