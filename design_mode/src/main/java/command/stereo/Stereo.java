package command.stereo;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/2 15:39
 */
public class Stereo {

    private String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println("打开音响...");
    }

    public void off(){
        System.out.println("关闭音响...");
    }

    public void setCD(){
        System.out.println("选择你喜欢的CD...");
    }

    public void setVolume(int num){
        System.out.println("设置音响的分贝为："+num);
    }
}
