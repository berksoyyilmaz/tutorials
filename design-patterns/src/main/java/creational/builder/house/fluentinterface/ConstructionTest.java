package creational.builder.house.fluentinterface;

public class ConstructionTest {
  public static void main(String[] args) {
    House house = new House.HouseBuilder()
        .addFoundation("Wood, laminate, and PVC flooring")
        .addStructure("Structural steels and wooden wall panels")
        .addRoof("Roofing sheets")
        .addFurnished(true)
        .paintHouse(false)
        .build();

    System.out.println(house);
  }
}
