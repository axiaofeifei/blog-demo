package command.test;

import command.remote_control.RemoteControl;
import command.remote_control.RemoteControlWithUndo;
import org.junit.Test;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/3 13:25
 */
public class test_test {
    public static void main(String[] args) {
        int[] ints = new int[6];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(ints[i]);
        }




    }

    @Test
    public void test(){
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
        System.out.println(remoteControlWithUndo.toString());
        //remoteControlWithUndo.getOnCommands();
        RemoteControl remoteControl = new RemoteControl();
        System.out.println(remoteControl.toString());


    }
}
