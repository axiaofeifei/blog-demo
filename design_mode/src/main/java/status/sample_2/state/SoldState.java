package status.sample_2.state;

import status.sample_2.GumballMachine;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/9 10:54
 */
public class SoldState implements State {
    GumballMachine gumballMachine;
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait,we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry,you alrady turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());

        }else {
            System.out.println("Oops,out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
