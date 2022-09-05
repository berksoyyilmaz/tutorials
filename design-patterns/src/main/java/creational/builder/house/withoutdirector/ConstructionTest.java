package creational.builder.house.withoutdirector;

public class ConstructionTest {
  public static void main(String[] args) {
    House woodenHouse = new House.HouseBuilder("Wood, laminate, and PVC flooring")
        .addStructure("Structural steels and wooden wall panels")
        .addRoof("Roofing sheets")
        .addFurnished(true)
        .paintHouse(false)
        .build();


    System.out.println(woodenHouse);
  }
}
