package command.test;

import command.garage.GarageDoor;
import command.garage.GarageDoorOnCommand;
import command.remote_control.SimpleRemoteControl;
import org.junit.Test;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/2 15:58
 */
public class Test_2 {

    @Test
    public void test(){
//门窗的测试
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOnCommand garageDoorOpenCommand = new GarageDoorOnCommand(garageDoor);

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        simpleRemoteControl.setCommand(garageDoorOpenCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
