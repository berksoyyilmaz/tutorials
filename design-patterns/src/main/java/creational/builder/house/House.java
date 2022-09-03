package creational.builder.house;

public abstract class House {
  private int windows;
  private int doors;
  private int rooms;

  House(int windows) {
    this(windows, 0, 0);
  }

  House(int windows, int doors) {
    this(windows, doors, 0);
  }

  House(int windows, int doors, int rooms) {
    this.windows = windows;
    this.doors = doors;
    this.rooms = rooms;
  }

  House() {

  }

  public int getWindows() {
    return windows;
  }

  void setWindows(int windows) {
    this.windows = windows;
  }

  public int getDoors() {
    return doors;
  }

  void setDoors(int doors) {
    this.doors = doors;
  }

  public int getRooms() {
    return rooms;
  }

  void setRooms(int rooms) {
    this.rooms = rooms;
  }

  @Override
  public String toString() {
    return "House{" +
        "windows=" + windows +
        ", doors=" + doors +
        ", rooms=" + rooms +
        '}';
  }
}
