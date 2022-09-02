package creational.builder.house;

public class HouseClient {
  public static void main(String[] args) {
    House houseWithGarage = new HouseWithGarage(4, 2, 3, true);
    System.out.println(houseWithGarage);

    House houseWithSwimmingPool = new HouseWithSwimmingPool(4, 3, 5, true);
    System.out.println(houseWithSwimmingPool);
  }
}
