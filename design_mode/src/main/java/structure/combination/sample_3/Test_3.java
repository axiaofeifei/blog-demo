package structure.combination.sample_3;

import org.junit.Test;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/26 16:29
 */
public class Test_3 {

    @Test
    public void test(){
        Menu menu_1 = new Menu("早餐", "早餐");
        Menu menu_2 = new Menu("午餐", "午餐");
        Menu menu_3 = new Menu("晚餐", "晚餐");

        Menu menu_21 = new Menu("北方菜", "午餐的北方菜");
        Menu menu_22 = new Menu("南方菜", "午餐的南方菜");


        Menu menu_31 = new Menu("甜点", "晚餐的甜点");
        Menu menu_32 = new Menu("地方小吃", "晚餐的地方小吃");

        menu_2.add(menu_21);
        menu_2.add(menu_22);

        menu_3.add(menu_31);
        menu_3.add(menu_32);

        MenuItem menuItem_1_1 = new MenuItem("包子", "早餐包子", true, 12.2);
        MenuItem menuItem_1_2 = new MenuItem("油条", "早餐油条", false, 6.4);
        MenuItem menuItem_1_3 = new MenuItem("豆浆", "早餐豆浆", true, 8.7);
        menu_1.add(menuItem_1_1);
        menu_1.add(menuItem_1_2);
        menu_1.add(menuItem_1_3);

        MenuItem menuItem_21_1 = new MenuItem("锅包肉", "北方菜锅包肉", false, 35.2);
        MenuItem menuItem_21_2 = new MenuItem("猪肉炖粉条", "北方菜猪肉炖粉条", false, 54.2);
        MenuItem menuItem_21_3 = new MenuItem("辣子鸡", "北方菜辣子鸡", false, 42.2);
        menu_21.add(menuItem_21_1);
        menu_21.add(menuItem_21_2);
        menu_21.add(menuItem_21_3);

        MenuItem menuItem_22_1 = new MenuItem("炒米粉", "南方菜炒米粉", true, 56.2);
        MenuItem menuItem_22_2 = new MenuItem("南焖羊肉", "南方菜南焖羊肉", false, 72.2);
        MenuItem menuItem_22_3 = new MenuItem("蒸排骨", "南方菜蒸排骨", false, 55.2);
        menu_22.add(menuItem_22_1);
        menu_22.add(menuItem_22_2);
        menu_22.add(menuItem_22_3);

        MenuItem menuItem_31_1 = new MenuItem("冰激凌", "甜点冰激凌", true, 44.2);
        menu_31.add(menuItem_31_1);

        MenuItem menuItem_32_1 = new MenuItem("肉夹馍", "地方小吃肉夹馍", false, 66.2);
        MenuItem menuItem_32_2 = new MenuItem("羊肉泡馍", "地方小吃羊肉泡馍", false, 72.2);
        menu_32.add(menuItem_32_1);
        menu_32.add(menuItem_32_2);


        //Iterator<MenuComponent> iterator = menuItem_21_1.createIterator();
        ////System.out.println(iterator);
        //while(iterator.hasNext()){ //判断是否有迭代元素
        //    System.out.println(iterator.next());//获取迭代出的元素
        //
        //}
        //
        //menu_1.print();
        //System.out.println(menuItem_1_1.isVegetarian());

    }
}
