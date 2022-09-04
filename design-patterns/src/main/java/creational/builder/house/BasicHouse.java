package creational.builder.house;

public class BasicHouse implements House {
  private int windows;
  private int doors;
  private int rooms;


  BasicHouse(int windows, int doors, int rooms) {
    this.windows = windows;
    this.doors = doors;
    this.rooms = rooms;
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

  @Override
  public String toString() {
    return "House{" +
        "windows=" + windows +
        ", doors=" + doors +
        ", rooms=" + rooms +
        '}';
  }

  @Override
  public String print() {
    return toString();
  }
}