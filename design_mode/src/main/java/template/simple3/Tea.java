package template.simple3;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/6 9:41
 */
public class Tea extends CaffeineBeveage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");

    }

    @Override
    void add() {
        System.out.println("add lemon");
    }
}
