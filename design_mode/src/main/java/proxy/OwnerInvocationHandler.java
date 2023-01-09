package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/9 15:19
 */
public class OwnerInvocationHandler implements InvocationHandler {
    PersonBean personBean;

    public OwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(personBean,args);
            } else if (method.getName().equals("setHotOrNotRating")) {
                throw new IllegalAccessError();
            }else if (method.getName().startsWith("set")){
                return method.invoke(personBean,args);
            }
        }catch (InvocationTargetException e){
            e.printStackTrace();
        }
        return null;
    }

    PersonBean getOwnProxy(PersonBean person){
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }
}
