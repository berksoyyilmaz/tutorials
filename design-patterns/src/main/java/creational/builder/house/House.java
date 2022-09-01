package creational.builder.house;

public class House {
  private int windows;
  private int doors;
  private int rooms;
  private boolean hasGarage;
  private boolean hasSwimmingPool;
  private boolean hasStatues;
  private boolean hasGarden;

  public House(int windows,
               int doors,
               int rooms,
               boolean hasGarage,
               boolean hasSwimmingPool,
               boolean hasStatues,
               boolean hasGarden) {
    this.windows = windows;
    this.doors = doors;
    this.rooms = rooms;
    this.hasGarage = hasGarage;
    this.hasSwimmingPool = hasSwimmingPool;
    this.hasStatues = hasStatues;
    this.hasGarden = hasGarden;
  }

  public int getWindows() {
    return windows;
  }

  public void setWindows(int windows) {
    this.windows = windows;
  }

  public int getDoors() {
    return doors;
  }

  public void setDoors(int doors) {
    this.doors = doors;
  }

  public int getRooms() {
    return rooms;
  }

  public void setRooms(int rooms) {
    this.rooms = rooms;
  }

  public boolean isHasGarage() {
    return hasGarage;
  }

  public void setHasGarage(boolean hasGarage) {
    this.hasGarage = hasGarage;
  }

  public boolean isHasSwimmingPool() {
    return hasSwimmingPool;
  }

  public void setHasSwimmingPool(boolean hasSwimmingPool) {
    this.hasSwimmingPool = hasSwimmingPool;
  }

  public boolean isHasStatues() {
    return hasStatues;
  }

  public void setHasStatues(boolean hasStatues) {
    this.hasStatues = hasStatues;
  }

  public boolean isHasGarden() {
    return hasGarden;
  }

  public void setHasGarden(boolean hasGarden) {
    this.hasGarden = hasGarden;
  }

  @Override
  public String toString() {
    return "House{" +
        "windows=" + windows +
        ", doors=" + doors +
        ", rooms=" + rooms +
        ", hasGarage=" + hasGarage +
        ", hasSwimmingPool=" + hasSwimmingPool +
        ", hasStatues=" + hasStatues +
        ", hasGarden=" + hasGarden +
        '}';
  }
}
