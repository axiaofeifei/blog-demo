import java.util.*;

/**
 * @author 小非肥
 * @version 1.0
 * @date 2022/5/12 10:00
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("id", "1");
        stringStringMap.put("id", "2");
        stringStringMap.put("id", "3");
        stringStringMap.put("id", "4");
        stringStringMap.put("name", "a");
        stringStringMap.put("name", "b");
        stringStringMap.put("name", "c");
        stringStringMap.put("name", "d");
        stringStringMap.put("value", "11");
        stringStringMap.put("value", "22");
        stringStringMap.put("value", "33");
        stringStringMap.put("value", "44");

        Set<Collection<String>> values = Collections.singleton(stringStringMap.values());
        Iterator<Collection<String>> iterator = values.iterator();
        System.out.println("----------------------------");
        while (iterator.hasNext()) {
            Object v = iterator.next();
            System.out.println(v);
            System.out.println("------------------------------------------------");
        }

    }
}
