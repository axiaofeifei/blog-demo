package template.simple1;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/6 9:24
 */
public class Tea {
    public void prepareReceive(){
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    private void addLemon() {
        System.out.println("add lemon");
    }

    private void pourInCup() {
        System.out.println("pout in cup");
    }






}
