package command.test;

import command.ceilingfan.CeiLingFanOnCommand;
import command.ceilingfan.CeiLingFanOff;
import command.garage.GarageDoor;
import command.light.Light;

import command.light.LightOffCommand;
import command.light.LightOnCommand;
import command.remote_control.RemoteControl;
import command.stereo.Stereo;
import command.stereo.StereoOffCommand;
import command.stereo.StereoOnCommand;
import command.ceilingfan.CeiLingFan;
import org.junit.Test;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/3 10:14
 */
public class RemoteLoader {

    @Test
    public void test(){
        RemoteControl remoteControl = new RemoteControl();
        Light LivingRoomlight = new Light("Living Room");
        Light kitchenLight = new Light("kitchen");
        CeiLingFan ceiLingFan = new CeiLingFan("ketchen");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living room");
        stereo.setVolume(6);

        LightOnCommand lighton1 = new LightOnCommand(LivingRoomlight);
        LightOnCommand lighton2 = new LightOnCommand(kitchenLight);
        LightOffCommand lightOff1 = new LightOffCommand(LivingRoomlight);
        LightOffCommand lightOff2 = new LightOffCommand(kitchenLight);

        CeiLingFanOnCommand ceiLingFanON = new CeiLingFanOnCommand(ceiLingFan);
        CeiLingFanOff ceiLingFanOff = new CeiLingFanOff(ceiLingFan);

        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0,lighton1,lightOff1);
        remoteControl.setCommand(1,lighton2,lightOff2);
        remoteControl.setCommand(2,ceiLingFanON,ceiLingFanOff);
        remoteControl.setCommand(3,stereoOnCommand,stereoOffCommand);
        System.out.println("--------------------------------------------------");
        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);

        remoteControl.offButtonWasPushed(0);
        remoteControl.offButtonWasPushed(1);
        remoteControl.offButtonWasPushed(2);
        remoteControl.offButtonWasPushed(3);

    }
}
