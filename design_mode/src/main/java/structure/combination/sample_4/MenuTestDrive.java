package structure.combination.sample_4;

import structure.combination.sample_4.package_1.Menu;
import structure.combination.sample_4.package_1.MenuComponent;
import structure.combination.sample_4.package_1.MenuItem;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/7 10:29
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent breakfast = new Menu("breakfast MENU", "breakfast");
        MenuComponent lunch = new Menu("lunch MENU", "lunch");
        MenuComponent dinner = new Menu("dinner MENU", "dinner");
        MenuComponent dessert = new Menu("dessert MENU", "dessert");
        MenuComponent allMenus = new Menu("allMenus MENU", "allMenus");

        allMenus.add(breakfast);
        allMenus.add(lunch);
        lunch.add(new MenuItem("牛肉汤","美滋滋",false,12.3));
        allMenus.add(dinner);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();


    }
}
