package creational.builder.house;

public class HouseClient {
  public static void main(String[] args) {
    House house = House.createHouse(4, 2, 5);
    House houseWithoutRoom = House.createHouseWithoutRoom(4, 2);
    House houseWithoutDoors = House.createHouseWithoutDoors(4, 5);

    System.out.println(house);
    System.out.println(houseWithoutDoors);
    System.out.println(houseWithoutRoom);
  }
}
