package test.FunctionalInterface;

import java.util.function.Supplier;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/12 9:06
 */

public class SupplierDemo {
    public static void main(String[] args) {
        /**
         * Supplier<T>
         * T get()方法
         * 无参数，有返回值
         */
        Supplier<String> supplier = () -> {
            String s = "supplier 测试：hello world";
            return s;
        };

        String s = supplier.get();
        System.out.println(s);
    }
}
