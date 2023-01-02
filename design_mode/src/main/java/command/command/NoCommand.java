package command.command;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/2 10:28
 */
public class NoCommand implements Command{
    //插槽没有接入设备，因此是无操作的
    @Override
    public void execute() {
        //System.out.println("无操作...");
    }

    @Override
    public void undo() {

    }
}
