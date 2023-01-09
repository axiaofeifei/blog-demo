package template.simple3;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/6 9:41
 */
public class Coffee extends CaffeineBeveage {
    @Override
    void brew() {
        System.out.println("Driping coffee though filter");

    }

    @Override
    void add() {
        System.out.println("Adding suger and milk");

    }
}
