package status.sample_1;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/9 8:45
 */
public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count){
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter(){
        if (state == HAS_QUARTER) {
            System.out.println("里面已经有钱了，你不能再放钱");
        }else if(state == SOLD_OUT){
            System.out.println("你不能投钱了，糖果机里面已经没有糖果了");

        } else if (state == SOLD) {
            System.out.println("停止，我们已经给你糖果了");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("你投入了硬币");
        }
    }

    public void ejectQuarter(){
        if (state == HAS_QUARTER){
            System.out.println("拿回去吧...");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("你没有投入硬币...");
        } else if (state == SOLD) {
            System.out.println("抱歉你已经转动了曲柄...");

        } else if (state == SOLD_OUT) {
            System.out.println("你不能拿回钱，你已经拿回糖果...");

        }
    }
    
    public void turnCrank(){
        if (state == SOLD){
            System.out.println("你已经拿过糖果");
        } else if (state == NO_QUARTER) {
            System.out.println("你需要先投钱");
        } else if (state == SOLD_OUT) {
            System.out.println("已经没有糖果了");
            
        } else if (state == HAS_QUARTER) {
            System.out.println("你拿到糖果了...");
            state = SOLD;
            dispense();
        }
    }

    private void dispense() {
        if (state == SOLD){
            System.out.println("A gumball comes rolling out the slot");
            count = count - 1;
            if (count == 0) {
                System.out.println("Oops,out of gumballs");
                state = SOLD_OUT;
            }else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("You need to pay first");
        } else if (state == SOLD_OUT) {
            System.out.println("NO gumball dispensed");
        } else if (state == HAS_QUARTER) {
            System.out.println("No gumball dispensed");
        }
    }
}
