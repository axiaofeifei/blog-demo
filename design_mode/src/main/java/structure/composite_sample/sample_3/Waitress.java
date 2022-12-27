package structure.composite_sample.sample_3;

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
