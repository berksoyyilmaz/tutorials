package creational.builder.house;

public class House {
  private int windows;
  private int doors;
  private int rooms;

  private House(int windows, int doors, int rooms) {
    this.windows = windows;
    this.doors = doors;
    this.rooms = rooms;
  }

  static House createHouse(int windows, int doors, int rooms) {
    return new House(windows, doors, rooms);
  }

  static House createHouseWithoutRoom(int windows, int doors) {
    return new House(windows, doors, 0);
  }

  static House createHouseWithoutDoors(int windows, int rooms) {
    return new House(windows, 0, rooms);
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
