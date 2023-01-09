package structure.combination.sample_4;


import structure.combination.sample_4.package_1.MenuComponent;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/27 8:34
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }
}
