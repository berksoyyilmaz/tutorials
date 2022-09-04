package creational.builder.house;

public class HouseClient {
  public static void main(String[] args) {

    House<BasicHouse> house = Houses.unmodifiableHouse(new BasicHouse(2, 3, 4));
    System.out.println(house.print());

    House<HouseWithGarage> houseWithGarage = Houses.unmodifiableHouse(new HouseWithGarage(2, 3, 4, true));
    System.out.println(houseWithGarage.print());
    
  }
}
