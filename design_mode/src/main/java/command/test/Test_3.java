package command.test;

import command.light.LightOffCommand;
import command.light.LightOnCommand;
import command.remote_control.RemoteControlWithUndo;
import command.light.Light;
import org.junit.Test;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/2 14:23
 */
public class Test_3 {

    @Test
    public void RemoteControlWithUndo(){
        Light light = new Light("Living Room");
        //control控制第三版本     开和关，撤销的功能同时设置
        System.out.println("------------------------------");
        //    测试撤销命令,策划命令是做本次命令相反的命令

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
        remoteControlWithUndo.setCommand(0,lightOnCommand,lightOffCommand);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        remoteControlWithUndo.undoButtonWasPushed();
        remoteControlWithUndo.offButtonWasPushed(0);
        remoteControlWithUndo.undoButtonWasPushed();



        //    测试电风扇
        //System.out.println("测试电风扇...");
        //CeiLingFan ceiLingFan = new CeiLingFan("卧室");
        //CeiLingFanHighCommand ceiLingFanHighCommand = new CeiLingFanHighCommand(ceiLingFan);
        //CeiLingFanMediumCommand ceiLingFanMediumCommand = new CeiLingFanMediumCommand(ceiLingFan);
        //CeiLingFanLowCommand ceiLingFanLowCommand = new CeiLingFanLowCommand(ceiLingFan);
        //CeiLingFanOff ceiLingFanOff = new CeiLingFanOff(ceiLingFan);
        //
        //
        //remoteControlWithUndo.setCommand(2,ceiLingFanHighCommand,ceiLingFanOff);
        //remoteControlWithUndo.setCommand(3,ceiLingFanMediumCommand,ceiLingFanOff);
        //remoteControlWithUndo.onButtonWasPushed(2);
        //remoteControlWithUndo.offButtonWasPushed(2);
        //remoteControlWithUndo.undoButtonWasPushed();
        //remoteControlWithUndo.onButtonWasPushed(3);
        //remoteControlWithUndo.undoButtonWasPushed();
    }
}
