package test.lambda;



import java.util.*;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/12 11:04
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("adnm", "admmt", "pot", "xbangd", "weoujgsd");

        Optional<String> max = list.stream().max(Comparator.comparing(String::length));
        Optional<String> min = list.stream().min(Comparator.comparing(String::length));
        System.out.println("最长的字符串：" + max.get());
        System.out.println("最短的字符串：" + min.get());




    }
}
