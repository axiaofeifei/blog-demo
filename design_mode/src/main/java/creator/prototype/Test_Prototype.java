package creator.prototype;

import org.junit.Test;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/24 15:12
 */
public class Test_Prototype {

    @Test
    public void test(){
        ConcretePrototype concretePrototype = new ConcretePrototype();

        concretePrototype.setAge(12);
        concretePrototype.setName("小河");
        System.out.println(concretePrototype);

        ConcretePrototype clone = concretePrototype.clone();
        System.out.println(clone);

    }
}
