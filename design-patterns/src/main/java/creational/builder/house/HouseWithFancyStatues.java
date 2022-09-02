package creational.builder.house;

public class HouseWithFancyStatues extends House {
  private boolean hasStatues;

  public HouseWithFancyStatues(int windows, int doors, int rooms, boolean hasStatues) {
    super(windows, doors, rooms);
    this.hasStatues = hasStatues;
  }

  public boolean isHasStatues() {
    return hasStatues;
  }

  public void setHasStatues(boolean hasStatues) {
    this.hasStatues = hasStatues;
  }

  @Override
  public String toString() {
    return "HouseWithFancyStatues{" +
        "hasStatues=" + hasStatues +
        "} " + super.toString();
  }
}
