package command.test;

import command.ceilingfan.CeiLingFan;
import command.ceilingfan.CeiLingFanOff;
import command.ceilingfan.CeiLingFanOnCommand;
import command.command.Command;
import command.command.MacroCommand;
import command.light.Light;
import command.light.LightOffCommand;
import command.light.LightOnCommand;
import command.remote_control.RemoteControl;
import command.remote_control.RemoteControlWithUndo;
import command.stereo.Stereo;
import command.stereo.StereoOffCommand;
import command.stereo.StereoOnCommand;
import org.junit.Test;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/5 14:39
 */
public class test_5 {
    @Test
    public void test(){
        Light light = new Light("Living room");
        CeiLingFan ceiLingFan = new CeiLingFan("Living room");
        Stereo stereo = new Stereo("Living room");

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        CeiLingFanOnCommand ceiLingFanOnCommand = new CeiLingFanOnCommand(ceiLingFan);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        CeiLingFanOff ceiLingFanOff = new CeiLingFanOff(ceiLingFan);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        Command[] PartyON = {lightOnCommand,ceiLingFanOnCommand,stereoOnCommand};
        Command[] PartyOff = {lightOffCommand,stereoOffCommand,ceiLingFanOff};

        MacroCommand PartyONCommand = new MacroCommand(PartyON);
        MacroCommand PartyOffCommand = new MacroCommand(PartyOff);

        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
        remoteControlWithUndo.setCommand(0,PartyONCommand,PartyOffCommand);
        System.out.println("---------------开启party 模式--------------");
        remoteControlWithUndo.onButtonWasPushed(0);
        System.out.println("---------------结束party 模式---------------");

        remoteControlWithUndo.offButtonWasPushed(0);
    }
}
