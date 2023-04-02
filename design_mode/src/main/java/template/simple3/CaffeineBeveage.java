package template.simple3;

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
        if(customerWantsCondiments()){
            add();
        }
    }



    abstract void brew();

    abstract void add();

     void boilWater() {
        System.out.println("Boiling water...");
    }

     void pourInCup() {
        System.out.println("Pouring into cup");
    }
     boolean customerWantsCondiments() {
        return true;
    }

}
