package command.command;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/31 16:01
 */
public interface Command {
    public void execute();

    public void undo();
}
