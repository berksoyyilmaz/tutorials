package creational.builder.house.director;

public class PrefabricatedHouseBuilder implements HouseBuilder {
  private final House house;

  PrefabricatedHouseBuilder() {
    house = new House();
  }

  @Override
  public void buildFoundation() {
    house.setFoundation("Wood, laminate, and PVC flooring");
    System.out.println("PrefabricatedHouseBuilder: Foundation complete...");
  }

  @Override
  public void buildStructure() {
    house.setStructure("Structural steels and wooden wall panels");
    System.out.println("PrefabricatedHouseBuilder: Structure complete...");
  }

  @Override
  public void buildRoof() {
    house.setRoof("Roofing sheets");
    System.out.println("PrefabricatedHouseBuilder: Roof complete...");
  }

  @Override
  public void paintHouse() {
    house.setPainted(false);
    System.out.println("PrefabricatedHouseBuilder: Painting not required...");
  }

  @Override
  public void furnishHouse() {
    house.setFurnished(true);
    System.out.println("PrefabricatedHouseBuilder: Furnishing complete...");
  }

  @Override
  public House getHouse() {
    System.out.println("PrefabricatedHouseBuilder: Prefabricated house complete...");
    return house;
  }
}