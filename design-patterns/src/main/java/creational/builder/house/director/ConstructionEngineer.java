package creational.builder.house.director;

class ConstructionEngineer {
  private final HouseBuilder houseBuilder;

  ConstructionEngineer(HouseBuilder houseBuilder) {
    this.houseBuilder = houseBuilder;
  }

  House constructHouse() {
    houseBuilder.buildFoundation();
    houseBuilder.buildStructure();
    houseBuilder.buildRoof();
    houseBuilder.paintHouse();
    houseBuilder.furnishHouse();
    return houseBuilder.getHouse();
  }
}