package behavioral.command;

import java.util.Stack;

public class Client {
  public static void main(String[] args) {
    Stack<Command> commandHistory = new Stack<>();

    Command openCommand = new OpenCommand(new TextFile("file1.txt"));
    Invoker invoker = new Invoker(openCommand);
    invoker.executeOperation();

    commandHistory.push(openCommand);
  }

}
