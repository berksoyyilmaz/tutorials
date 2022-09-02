package creational.builder.house;

public class HouseWithGarden extends House {
  private boolean hasGarden;

  public HouseWithGarden(int windows, int doors, int rooms, boolean hasGarden) {
    super(windows, doors, rooms);
    this.hasGarden = hasGarden;
  }

  public boolean isHasGarden() {
    return hasGarden;
  }

  public void setHasGarden(boolean hasGarden) {
    this.hasGarden = hasGarden;
  }
  
  @Override
  public String toString() {
    return "HouseWithGarden{" +
        "hasGarden=" + hasGarden +
        "} " + super.toString();
  }
}
