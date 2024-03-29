package test.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/12 15:10
 */
public class MapDemo {
    public static void main(String[] args) {
        String[] strArr = { "abcd", "bcdd", "defde", "fTr" };
        List<String> strList = Arrays.stream(strArr).map(String::toUpperCase).collect(Collectors.toList());

        List<Integer> intList = Arrays.asList(1, 3, 5, 7, 9, 11);
        List<Integer> intListNew = intList.stream().map(x -> x + 3).collect(Collectors.toList());
        System.out.println("每个元素大写：" + strList);
        System.out.println("每个元素+3：" + intListNew);

    }
}
