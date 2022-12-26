package structure.composite_sample.sample_1;

import java.util.ArrayList;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/26 11:41
 */
public class Composite extends Component{
    //首先来一个存储的集合
    ArrayList<Component> list = new ArrayList<Component>();

    public void addComposite(Component c){
        list.add(c);
    }
    public void removeComposite(Component c){
        list.remove(c);
    }
    public Component getComposite(int c){
        Component c1 =list.get(c);
        return c1;
    }
    public void operation(){
        for(Object obj:list){
            ((Component)obj).operation();
        }
    }

}
