package io.properties;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/29 16:05
 */
public class properties_ {
    public static void main(String[] args) {

    }

    @Test
    public void test01() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\io\\properties\\mysql.properties"));
        String line = null;
        while ((line = br.readLine()) != null) {
            String[] split = line.split("=");
            if ("ip".equals(split[0].trim())) {
                System.out.println(split[0]+"的值是："+split[1].trim());
            }
        }

        br.close();
    }
    //读取配置文件数据
    @Test
    public void test02() throws IOException {
        //1. 创建Properties 对象
        Properties properties = new Properties();
        //2. 加载指定配置文件
        properties.load(new FileReader("src\\main\\java\\io\\properties\\mysql.properties"));
        //3. 把k-v显示控制台
        properties.list(System.out);
        //4. 根据key 获取对应的值
        System.out.println("--------输出用户名，密码------------");
        String user = properties.getProperty("username");
        String pwd = properties.getProperty("password");
        System.out.println("用户名=" + user);
        System.out.println("密码是=" + pwd);


    }
    //向配置文件中填入数据
    @Test
    public void test03() throws IOException {
        //使用Properties 类来创建 配置文件, 修改配置文件内容

        Properties properties = new Properties();
        //创建
        //1.如果该文件没有key 就是创建
        //2.如果该文件有key ,就是修改
        /*
            Properties 父类是 Hashtable ， 底层就是Hashtable 核心方法
            public synchronized V put(K key, V value) {
                // Make sure the value is not null
                if (value == null) {
                    throw new NullPointerException();
                }
                // Makes sure the key is not already in the hashtable.
                Entry<?,?> tab[] = table;
                int hash = key.hashCode();
                int index = (hash & 0x7FFFFFFF) % tab.length;
                @SuppressWarnings("unchecked")
                Entry<K,V> entry = (Entry<K,V>)tab[index];
                for(; entry != null ; entry = entry.next) {
                    if ((entry.hash == hash) && entry.key.equals(key)) {
                        V old = entry.value;
                        entry.value = value;//如果key 存在，就替换
                        return old;
                    }
                }
                addEntry(hash, key, value, index);//如果是新k, 就addEntry
                return null;
            }
         */
        properties.setProperty("charset", "utf8");
        properties.setProperty("user", "汤姆");//注意保存时，是中文的 unicode码值
        properties.setProperty("pwd", "888888");

        //将k-v 存储文件中即可
        //注意null是指properties配置文件没有要说明的注释，如果有的话会在配置文件的
        //最上方显示。
        String path = "src\\main\\java\\io\\properties\\mysql2.properties";
        properties.store(new FileOutputStream(path), null);
        System.out.println("保存配置文件成功~");

    }
}
