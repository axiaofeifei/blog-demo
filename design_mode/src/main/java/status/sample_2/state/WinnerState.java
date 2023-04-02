package status.sample_2.state;

import status.sample_2.GumballMachine;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/9 10:56
 */
public class WinnerState implements State{
    GumballMachine gumballMachine;
    @Override
    public void insertQuarter() {
        System.out.println("错误信息...");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("错误信息...");
    }

    @Override
    public void turnCrank() {
        System.out.println("错误信息...");
    }

    @Override
    public void dispense() {
        System.out.println("You're A WINNER!You get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }else {
                System.out.println("Oops,out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
