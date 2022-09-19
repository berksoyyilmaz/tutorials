package behavioral.command;

public class OpenCommand implements Command {

  private final TextFile textFile;

  public OpenCommand(TextFile textFile) {
    this.textFile = textFile;
  }

  @Override
  public String execute() {
    return textFile.open();
  }
}