package command.remote_control;

import command.command.Command;
import command.command.NoCommand;

import java.awt.*;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/2 10:21
 */
public class RemoteControl {
     Command[] onCommands;
     Command[] offCommands;
     public RemoteControl() {
          onCommands = new Command[7];
          offCommands = new Command[7];


          NoCommand noCommand = new NoCommand();
          for (int i = 0; i < 7; i++) {
               onCommands[i] = noCommand;
               offCommands[i] = noCommand;
          }

     }

     public void setCommand(int slot, Command onCommand, Command offCommand) {
          onCommands[slot] = onCommand;
          offCommands[slot] = offCommand;
     }

     public void onButtonWasPushed(int slot) {
          onCommands[slot].execute();
     }

     public void offButtonWasPushed(int slot) {
          offCommands[slot].execute();
     }

     public String toString(){
          StringBuffer stringBuffer = new StringBuffer();
          stringBuffer.append("\n-----------Remote Control ----------");

          for (int i = 0; i < onCommands.length; i++) {
               stringBuffer.append("[slot "+ i + "]"+ onCommands[i].getClass().getName()+
                       " "+ offCommands[i].getClass().getName());

          }
          return stringBuffer.toString();
     }

}


     //ArrayList onCommands;
     //ArrayList offCommands;
     //
     //public RemoteControl() {
     //     onCommands = new ArrayList<Command>(5);
     //     offCommands = new ArrayList<Command>(5);
     //
     //     NoCommand noCommand = new NoCommand();
     //     for (int i = 0; i < 5; i++) {
     //          onCommands.add(noCommand);
     //          offCommands.add(noCommand);
     //     }
     //}
     //
     //public void setCommand(int slot, Command onCommand, Command offCommand) {
     //     onCommands.add(slot, onCommand);
     //     offCommands.add(slot, offCommand);
     //}
     //
     //public void onButtonWasPushed(int slot) {
     //     Command command = (Command) onCommands.get(slot);
     //     command.execute();
     //}
     //
     //public void offButtonWasPushed(int slot) {
     //     Command command = (Command) offCommands.get(slot);
     //     command.execute();
     //}
     //
     //public void undoButtonWasPushed(int slot) {
     //     Command command = (Command) offCommands.get(slot);
     //     command.undo();
     //}
     //
     //@Override
     //public String toString() {
     //     StringBuffer stringBuffer = new StringBuffer();
     //     stringBuffer.append("\n---------------remote   Control---------------\n");
     //
     //     //for (int i = 0; i < onCommands.size(); i++) {
     //     //     stringBuffer.append(i+""+(Command)onCommands.get(i)+"")
     //     //}
     //     return "RemoteControl{" +
     //             "onCommands=" + onCommands +
     //             ", offCommands=" + offCommands +
     //             '}';
     //}
