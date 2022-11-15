package test.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/12 11:50
 */
public class Find_matchDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,8,6,7,9);
        // 匹配第一个
        Optional<Integer> findFirst = list.stream().filter(l -> l > 5).findFirst();
        System.out.println(findFirst.get());
        System.out.println(findFirst);
        // 匹配任意（适用于并行流）
        Optional<Integer> findAny = list.parallelStream().filter(l -> l > 6).findAny();
        System.out.println(findAny);
        // 是否包含符合特定条件的元素
        boolean anyMatch = list.stream().anyMatch(l -> l > 6);
        System.out.println(anyMatch);
    }
}
