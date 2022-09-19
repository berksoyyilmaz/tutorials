package behavioral.command;

public class TextFile {

  private final String name;

  public TextFile(String name) {
    this.name = name;
  }

  public String open() {
    return "Opening file " + name;
  }

  public String save() {
    return "Saving file " + name;
  }
}