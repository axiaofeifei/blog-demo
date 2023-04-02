package template.simple2;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/6 9:38
 */
public abstract class CaffeineBeveage {
    final void prepareReceive(){
        boilWater();
        brew();
        pourInCup();
        add();
    }

    abstract void brew();

    abstract void add();

    private void boilWater() {
        System.out.println("");
    }



    private void pourInCup() {
        System.out.println("Pouring into cup");
    }






}
