package behavioral.command;

public class Invoker {

  private final Command command;

  public Invoker(Command command) {
    this.command = command;
  }

  public String executeOperation() {
    return command.execute();
  }
}