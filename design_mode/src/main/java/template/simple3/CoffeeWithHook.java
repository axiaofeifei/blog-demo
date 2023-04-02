package template.simple3;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/6 9:41
 */
public class CoffeeWithHook extends CaffeineBeveage {
    @Override
    void brew() {
        System.out.println("Driping coffer though filter");

    }

    @Override
    void add() {
        System.out.println("Adding suger and milk");

    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        }else {
            return false;
        }
    }

    private String getUserInput(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like milk and sugar with your coffee (y/n):");
        String answer = scanner.nextLine();



        if (answer == null){
            return "no";
        }
        return answer;

    }
}
