package test.FunctionalInterface;

import java.util.function.Consumer;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/12 9:11
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        String string = "consumer 测试";
        /**
         * Consumer<T>
         * void accept(T t)
         * 有参数，无返回值
         */
        Consumer<String> consumer = (str) -> {
            System.out.println(str);
        };

        consumer.accept(string);
    }
}
