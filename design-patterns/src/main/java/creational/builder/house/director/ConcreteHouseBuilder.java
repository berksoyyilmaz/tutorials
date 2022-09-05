package creational.builder.house.director;

public class ConcreteHouseBuilder implements HouseBuilder {
  private final House house;

  ConcreteHouseBuilder() {
    house = new House();
  }

  @Override
  public void buildFoundation() {
    house.setFoundation("Concrete, brick, and stone");
    System.out.println("ConcreteHouseBuilder: Foundation complete...");
  }

  @Override
  public void buildStructure() {
    house.setStructure("Concrete, mortar, brick, and reinforced steel");
    System.out.println("ConcreteHouseBuilder: Structure complete...");
  }

  @Override
  public void buildRoof() {
    house.setRoof("Concrete and reinforced steel");
    System.out.println("ConcreteHouseBuilder: Roof complete...");
  }

  @Override
  public void paintHouse() {
    house.setPainted(true);
    System.out.println("ConcreteHouseBuilder: Painting complete...");
  }

  @Override
  public void furnishHouse() {
    house.setFurnished(true);
    System.out.println("ConcreteHouseBuilder: Furnishing complete...");
  }

  @Override
  public House getHouse() {
    System.out.println("ConcreteHouseBuilder: Concrete house complete...");
    return house;
  }
}