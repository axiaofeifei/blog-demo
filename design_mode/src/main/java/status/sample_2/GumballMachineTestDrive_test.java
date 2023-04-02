package status.sample_2;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/9 14:21
 */
public class GumballMachineTestDrive_test {
    public static void main(String[] args) {
        int count = 0;
        if (args.length < 2) {
            System.out.println();
            System.exit(1);
        }

        count = Integer.parseInt(args[1]);
        GumballMachine machine = new GumballMachine(count, args[0]);
        GumballMonitor monitor = new GumballMonitor(machine);

        monitor.report();
        }
}
