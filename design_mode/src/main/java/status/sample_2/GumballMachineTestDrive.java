package status.sample_2;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/9 13:54
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        //gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
