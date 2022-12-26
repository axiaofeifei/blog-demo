package structure.composite_sample.sample_2;

import java.util.ArrayList;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/26 13:42
 */
public class Folder extends AbstractFiles{

    ArrayList list = new ArrayList<AbstractFiles>();

    private String name;
    public Folder(String name) {
        this.name=name;
    }

    @Override
    public void add(AbstractFiles af) {
        list.add(af);
        System.out.println("添加成功");
    }

    @Override
    public void remove(AbstractFiles af) {
        // TODO Auto-generated method stub
        if(list.remove(af)) {
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
    }

    @Override
    public AbstractFiles get(int i) {
        // TODO Auto-generated method stub
        return (AbstractFiles) list.get(i);
    }

    @Override
    public void killVirus() {
        // TODO Auto-generated method stub
        System.out.println("对文件夹" + name + "进行杀毒");

        for (Object o : list) { //本模式重点在于 递归调用"本操作方法"
            ((AbstractFiles) o).killVirus();
        }
    }
}
