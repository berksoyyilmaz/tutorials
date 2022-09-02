package creational.builder.house;

public class HouseWithGarage extends House {
  private boolean hasGarage;

  HouseWithGarage(int windows, int doors, int rooms, boolean hasGarage) {
    super(windows, doors, rooms);
    this.hasGarage = hasGarage;
  }

  public boolean isHasGarage() {
    return hasGarage;
  }

  public void setHasGarage(boolean hasGarage) {
    this.hasGarage = hasGarage;
  }

  @Override
  public String toString() {
    return "HouseWithGarage{" +
        "hasGarage=" + hasGarage +
        "} " + super.toString();
  }
}
