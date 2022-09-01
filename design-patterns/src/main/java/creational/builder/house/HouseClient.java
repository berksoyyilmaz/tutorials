package creational.builder.house;

public class HouseClient {
  public static void main(String[] args) {
    House house = new House(4, 2, 4, true, false, false, false);
    System.out.println(house);
  }
}
