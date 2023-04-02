package structure.combination.sample_1;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/26 11:34
 */
public class Leaf extends Component{
    //首先重写component的方法
    //叶子节点关键点在于业务
    @Override
    public void addComposite(Component c) {
        //提示报错呗 。
        System.out.print("不是子容器");
    }

    @Override
    public void removeComposite(Component c) {
        //提示报错呗 。
        System.out.print("不是子容器");
    }

    @Override
    public Component getComposite(int i) {
        //提示报错呗 。
        System.out.print("不是子容器");
        return null;
    }

    @Override
    public void operation() {
        System.out.println("叶子节点进行业务操作...");
    }
}
