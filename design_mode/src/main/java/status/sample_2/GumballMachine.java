package status.sample_2;

import lombok.Data;
import status.sample_2.state.*;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/9 8:45
 */
@Data
public class GumballMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State winnerState;

    State state = soldOutState;
    int count = 0;

    String location;

    public GumballMachine(int count, String location) {
        this.count = count;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public GumballMachine(int numberGumballs){
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0){
            state = noQuarterState;
        }

    }



    //投钱
    public void insertQuarter(){
        state.insertQuarter();
    }
    //取回钱
    public void ejectQuarter(){
        state.ejectQuarter();
    }
    //拿糖果
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot");
        if (count != 0) {
            count = count - 1;
        }
    }

}
