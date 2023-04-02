package status.sample_2.state;

import status.sample_2.GumballMachine;

import java.util.Random;


/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/9 10:55
 */
public class HasQuarterState implements State{
    Random random = new Random();
    GumballMachine gumballMachine;
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }



    @Override
    public void insertQuarter() {
        System.out.println("你已经向里面放钱了啊...");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退回顾客的钱，设置状态为未付钱...");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned ...");
        int nextInt = random.nextInt(10);
        if ((nextInt == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        }else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispened...");
    }
}
