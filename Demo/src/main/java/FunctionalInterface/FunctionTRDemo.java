package test.FunctionalInterface;

import java.util.function.Function;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/12 9:19
 */
public class FunctionTRDemo {
    public static void main(String[] args) {
        /**
         * Function(T , R)
         * R apply(T t)
         * 参数是t , 返回值是R
         */
        Function<Integer,Integer> function = (num) -> {
            System.out.println("Function(T,R)方法测试");
            int result = num * 10;
            return result;
        };

        function.apply(10);
    }
}
