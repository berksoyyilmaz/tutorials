package creational.builder.house;

public class HouseClient {
  public static void main(String[] args) {
    HouseWithGarage house = new HouseWithGarage();
    house.setWindows(4);
    house.setDoors(2);
    house.setRooms(4);
    house.setHasGarage(true);
  }
}
