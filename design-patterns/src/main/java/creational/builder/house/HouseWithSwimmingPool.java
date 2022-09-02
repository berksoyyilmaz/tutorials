package creational.builder.house;

public class HouseWithSwimmingPool extends House {
  private boolean hasSwimmingPool;

  public HouseWithSwimmingPool(int windows, int doors, int rooms, boolean hasSwimmingPool) {
    super(windows, doors, rooms);
    this.hasSwimmingPool = hasSwimmingPool;
  }

  public boolean isHasSwimmingPool() {
    return hasSwimmingPool;
  }

  public void setHasSwimmingPool(boolean hasSwimmingPool) {
    this.hasSwimmingPool = hasSwimmingPool;
  }

  @Override
  public String toString() {
    return "HouseWithSwimmingPool{" +
        "hasSwimmingPool=" + hasSwimmingPool +
        "} " + super.toString();
  }
}
