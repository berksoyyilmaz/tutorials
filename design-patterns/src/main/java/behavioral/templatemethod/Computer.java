package behavioral.templatemethod;

import java.util.Map;

public class Computer {

  private final Map<String, String> computerParts;

  public Computer(Map<String, String> computerParts) {
    this.computerParts = computerParts;
  }

  public Map<String, String> getComputerParts() {
    return computerParts;
  }
}
