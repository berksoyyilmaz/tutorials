package creational.builder.house.director;

public interface HouseBuilder {
  void buildFoundation();

  void buildStructure();

  void buildRoof();

  void paintHouse();

  void furnishHouse();

  House getHouse();
}