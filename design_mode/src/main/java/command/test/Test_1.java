package command.test;

import command.garage.GarageDoorOnCommand;
import command.light.LightOffCommand;
import command.light.LightOnCommand;
import command.remote_control.SimpleRemoteControl;
import command.garage.GarageDoor;
import command.light.Light;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/2 9:07
 */
//这个就是client
public class Test_1 {
    public static void main(String[] args) {
        //control控制第一版本     开和关的功能要分别设置
        //灯的测试
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();






    }
}
