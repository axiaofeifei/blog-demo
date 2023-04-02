package status.sample_2.state;

import status.sample_2.GumballMachine;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/9 10:55
 */
public class NoQuarterState implements State{
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("臭小子，你没有向里面放钱啊...");
    }

    @Override
    public void turnCrank() {
        System.out.println("没给钱，哪来的糖果啊...");
    }

    @Override
    public void dispense() {
        System.out.println("先付钱...");
    }
}
