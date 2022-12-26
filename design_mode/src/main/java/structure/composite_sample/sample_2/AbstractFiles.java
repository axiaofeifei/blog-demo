package structure.composite_sample.sample_2;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/26 13:38
 */
public abstract class AbstractFiles {

    public abstract void add(AbstractFiles af);
    public abstract void remove(AbstractFiles af);
    public abstract AbstractFiles get(int i);
    public abstract void killVirus();

}
