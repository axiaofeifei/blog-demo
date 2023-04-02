package template.simple2;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/6 9:41
 */
public class Coffee extends CaffeineBeveage{
    @Override
    void brew() {
        System.out.println("Driping coffer though filter");

    }

    @Override
    void add() {
        System.out.println("Adding suger and milk");

    }
}
