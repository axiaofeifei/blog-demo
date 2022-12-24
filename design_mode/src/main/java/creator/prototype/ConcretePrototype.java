package creator.prototype;

import lombok.Data;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/24 14:46
 */
@Data
public class ConcretePrototype implements phototype{

    private int age;

    private String name;

    @Override
    public ConcretePrototype clone() {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAge(this.age);
        concretePrototype.setName(this.name);
        return concretePrototype;
    }
}
