package test.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/12 15:08
 */
public class CountDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 6, 9, 4, 11, 5);
        long count = list.stream().filter(x -> x > 5).count();
        System.out.println("list中大于5的元素个数：" + count);

    }
}
