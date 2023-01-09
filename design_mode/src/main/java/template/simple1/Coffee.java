package template.simple1;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/6 9:12
 */
public class Coffee {
    public void prepareReceive(){
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugerAndMilk();
    }
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void brewCoffeeGrinds() {
        System.out.println("Driping coffer though filter");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }


    private void addSugerAndMilk() {
        System.out.println("Adding suger and milk");
    }





}
