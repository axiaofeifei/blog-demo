package test.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/12 15:16
 */
public class ReduceDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 2, 8, 11, 4);
        // 求和方式1
        Optional<Integer> sum = list.stream().reduce((x, y) -> x + y);
        // 求和方式2
        Optional<Integer> sum2 = list.stream().reduce(Integer::sum);
        // 求和方式3     reduce的第一个参数是Integer类型
        Integer sum3 = list.stream().reduce(0, Integer::sum);
        // 求乘积
        Optional<Integer> product = list.stream().reduce((x, y) -> x * y);
        // 求最大值方式1
        Optional<Integer> max = list.stream().reduce((x, y) -> x > y ? x : y);
        Optional<Integer> max1= list.stream().reduce(Integer::max);
        // 求最大值写法2
        Integer max2 = list.stream().reduce(0, Integer::max);
        System.out.println("sum--->" + sum.get() + "," + "sum2--->" + sum2.get() + "," + "sum3--->" + sum3);
        System.out.println("list求积：" + product.get());
        System.out.println(max1.get()+"===================");
        System.out.println("max--->" + max.get() + "               max2------->" + max2);


    }
}
