package status.sample_2.state;

import status.sample_2.GumballMachine;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/9 10:55
 */
public class SoldOutState implements State{
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("不要再投钱了，糖果已经卖光了...");

    }

    @Override
    public void ejectQuarter() {
        //if (){
        //    gumballMachine.ejectQuarter();
        //}else{
        //    System.out.println("你没有投钱啊...");
        //}
    }

    @Override
    public void turnCrank() {
        System.out.println("糖果已经卖光了...");
    }

    @Override
    public void dispense() {

    }
}
