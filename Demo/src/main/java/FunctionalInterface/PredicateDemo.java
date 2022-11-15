package test.FunctionalInterface;

import java.util.function.Predicate;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/12 9:37
 */
public class PredicateDemo {
    public static void main(String[] args) {
        /**
         *  Predicate<T>
         *  Boolean test(T t)
         *  参数t,返回值boolean
         */
        //Predicate<String> predicate = "hello"::equals;
        Predicate<String> predicate = (str) ->{

            return "hello".equals(str);
        };


        boolean test = predicate.test("hello world");
        System.out.println(test);
    }
}
