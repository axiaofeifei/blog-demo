package command.test;

import command.ceilingfan.CeiLingFan;
import command.ceilingfan.CeiLingFanHighCommand;
import command.ceilingfan.CeiLingFanMediumCommand;
import command.ceilingfan.CeiLingFanOff;
import command.remote_control.RemoteControlWithUndo;
import org.junit.Test;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/3 13:56
 */
//测试电风扇
public class Test_4 {

    @Test
    public void test(){
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        CeiLingFan living_room_Fan = new CeiLingFan("Living Room");

        CeiLingFanMediumCommand FanMediumCommand = new CeiLingFanMediumCommand(living_room_Fan);
        CeiLingFanHighCommand FanHighCommand = new CeiLingFanHighCommand(living_room_Fan);
        CeiLingFanOff FanOff = new CeiLingFanOff(living_room_Fan);

        remoteControlWithUndo.setCommand(0,FanHighCommand,FanOff);
        remoteControlWithUndo.setCommand(1,FanMediumCommand,FanOff);

        remoteControlWithUndo.onButtonWasPushed(1);
        remoteControlWithUndo.offButtonWasPushed(1);
        remoteControlWithUndo.undoButtonWasPushed();

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.undoButtonWasPushed();
    }
}
