package status;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/9 8:45
 */
public class Status {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;

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
}
