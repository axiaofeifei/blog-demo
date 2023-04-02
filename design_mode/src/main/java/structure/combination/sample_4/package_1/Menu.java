package structure.combination.sample_4.package_1;

import org.springframework.util.CompositeIterator;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/26 16:27
 */
public class Menu extends MenuComponent {

    private CompositeIterator iterator = null;

    private String name;
    private String desc;
    ArrayList menuComponents = new ArrayList();

    public Menu(String _name, String _desc) {
        name = _name;
        desc = _desc;
    }



    @Override
    public void add(MenuComponent menuComponent) {
        if (menuComponents == null) {
            menuComponents = new ArrayList<MenuComponent>();
        }
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return desc;
    }



    @Override
    public MenuComponent getChild(int childIndex) {
        if (menuComponents == null || menuComponents.size() <= childIndex) {
            return null;
        }
        return (MenuComponent) menuComponents.get(childIndex);
    }



    @Override
    public void print() {
        System.out.println("\nMenu: { " + name + ", " + desc + " }");
        if (menuComponents == null) {
            return;
        }
        System.out.println("-------------------------");

        //for ((MenuComponent menuComponent : menuComponents) {
        //    menuComponent.print();
        //}

        Iterator<MenuComponent> iterator1 = menuComponents.iterator();
        while (iterator1.hasNext()) {
            MenuComponent next = iterator1.next();
            next.print();
        }
    }

    //@Override
    public Iterator<MenuComponent> createIterator() {
        if (iterator == null) {
            iterator = new CompositeIterator();
        }

        return iterator;
    }


    //public void showVegetarMenu(MenuComponent menu) {
    //    List<MenuComponent> visited = new ArrayList<>();
    //    showVegetarMenu(menu, visited);
    //}
    //
    //private void showVegetarMenu(MenuComponent menu, List<MenuComponent> visited) {
    //    if (visited.contains(menu)) {
    //        return;
    //    }
    //
    //    if (menu instanceof MenuItem) {
    //        if (menu.isVegetarian()) {
    //            System.out.println(menu);
    //        }
    //        return;
    //    }
    //
    //    List<MenuComponent> children = ((Menu) menu).getChildren(menu);
    //    for (int i = 0; i < children.size(); i++) {
    //        showVegetarMenu(children.get(i), visited);
    //    }
    //}




}

