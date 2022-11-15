package test.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/12 14:52
 */
public class Max_minDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("adnm", "admmt", "pot", "xbangd", "weoujgsd");
        Optional<String> max = list.stream().max(Comparator.comparing(String::length));
        Optional<String> min = list.stream().min(Comparator.comparing(String::length));
        System.out.println("最长的字符串：" + max.get());
        System.out.println("最短的字符串：" + min.get());


        List<Integer> list1 = Arrays.asList(7, 6, 9, 4, 11, 3);
        // 自然排序
        Optional<Integer> max1 = list1.stream().max(Integer::compareTo);
        // 自定义排序
        Optional<Integer> max2 = list1.stream().max((l1, l2) -> l1.compareTo(l2));
		//简写为上面这个
		/*
		    Optional<Integer> max2 = list.stream().max(new Comparator<Integer>() {
			@Override
			public int compare(Integer l1, Integer l2) {
				return l1.compareTo(l2);
			}

        }*/



    }
}
