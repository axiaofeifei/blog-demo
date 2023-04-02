package status.sample_2;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/9 14:17
 */
public class GumballMonitor {
    GumballMachine machine;

    public GumballMonitor(GumballMachine machine) {
        this.machine = machine;
    }

    public void report(){
        System.out.println("Gumball Machine: " + machine.getLocation());
        System.out.println("Gumball inventory: " + machine.getLocation());
        System.out.println("Gumball state: " + machine.getLocation());
    }
}
