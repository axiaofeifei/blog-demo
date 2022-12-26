package structure.composite_sample.sample_2;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/26 13:39
 */
public class ImageFile extends AbstractFiles{

    private String name;

    public ImageFile(String name) {
        this.name=name;
    }

    @Override
    public void add(AbstractFiles af) {
        System.out.println("不支持此方法...");
    }

    @Override
    public void remove(AbstractFiles af) {
        System.out.println("不支持此方法...");

    }

    @Override
    public AbstractFiles get(int i) {
        System.out.println("不支持此方法...");

        return null;
    }

    @Override
    public void killVirus() {
        System.out.println("对"+name+"文件进行杀毒...");
    }
}
